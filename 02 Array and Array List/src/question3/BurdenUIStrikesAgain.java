package question3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import question1and2.Student;

public class BurdenUIStrikesAgain extends Application {
	public class UIComponents {
		Stage window;
		Label lbAdmin, lbName, lbBirthdate, lbTest1, lbTest2, lbTest3;
		TextField tfName, tfBirthdate, tfTest1, tfTest2, tfTest3;
		ComboBox<Student> cbStudents;
		Button bUpdate, bExit;
	}
	static class StudentCell extends ListCell<Student> {
		@Override
		public void updateItem(Student s, boolean empty) {
			super.updateItem(s, empty);
			if (s != null) {
				setContentDisplay(ContentDisplay.TEXT_ONLY);
				setText(s.getAdminNo());
			}
		}
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		UIComponents ui = new UIComponents();
		BurdenControllerStrikesAgain con = new BurdenControllerStrikesAgain(ui);
		ui.window = primaryStage;
		ui.window.setTitle("Update Student Details");
		
		//containing AnchorPane
		BorderPane container = new BorderPane();
		//gridpane for organization
		GridPane grid = new GridPane();
		//containing Scene
		Scene scene = new Scene(container);
		
		//labels
		ui.lbAdmin = new Label("Admin No:");
		ui.lbName = new Label("Name:");
		ui.lbBirthdate = new Label("Birthdate:");
		ui.lbTest1 = new Label("Test 1:");
		ui.lbTest2 = new Label("Test 2:");
		ui.lbTest3 = new Label("Test 3:");
		
		//textfields
		ui.tfName = new TextField();
		ui.tfBirthdate = new TextField();
		ui.tfTest1 = new TextField();
		ui.tfTest2 = new TextField();
		ui.tfTest3 = new TextField();
		
		//buttons
		ui.bUpdate = new Button("Update");
		ui.bUpdate.setOnAction((e) -> {
			con.save();
		});
		ui.bExit = new Button("Exit");
		ui.bExit.setOnAction((e) -> {
			ui.window.close();
		});
		HBox buttons = new HBox(20);
		buttons.getChildren().addAll(ui.bUpdate, ui.bExit);
		
		//Dropdown/ComboBox/whatever you want to call it
		ui.cbStudents = new ComboBox(); //name DEFINITELY NOT INTENTIONAL
		
		//doing custom shit to the combobox
		ui.cbStudents.getSelectionModel().selectedItemProperty().addListener((ov, old_val, new_val) -> {
			con.updateDetails((Student)old_val, (Student)new_val);
		});
		ui.cbStudents.setCellFactory(new Callback<ListView<Student>, ListCell<Student>>() {

			@Override
			public ListCell<Student> call(ListView<Student> param) {
				return new StudentCell();
			}
			
		});
		
		
		//putting stuff in the grid
		GridPane.setConstraints(ui.lbAdmin, 0, 0);
		GridPane.setConstraints(ui.lbName, 0, 1);
		GridPane.setConstraints(ui.lbBirthdate, 0, 2);
		GridPane.setConstraints(ui.lbTest1, 0, 3);
		GridPane.setConstraints(ui.lbTest2, 0, 4);
		GridPane.setConstraints(ui.lbTest3, 0, 5);
		GridPane.setConstraints(ui.cbStudents, 1, 0);
		GridPane.setConstraints(ui.tfName, 1, 1);
		GridPane.setConstraints(ui.tfBirthdate, 1, 2);
		GridPane.setConstraints(ui.tfTest1, 1, 3);
		GridPane.setConstraints(ui.tfTest2, 1, 4);
		GridPane.setConstraints(ui.tfTest3, 1, 5);
		grid.getChildren().addAll(ui.lbAdmin, ui.lbName, ui.lbTest1, ui.lbTest2,
				ui.lbTest3, ui.cbStudents, ui.tfName, ui.tfBirthdate, ui.tfTest1,
				ui.tfTest2, ui.tfTest3);
		
		//adding stuff to the BorderPane
		BorderPane.setAlignment(grid, Pos.CENTER);
		BorderPane.setAlignment(buttons, Pos.CENTER);
		container.setCenter(grid);
		container.setBottom(buttons);
		
		con.fillComboBox();
		ui.window.setScene(scene);
		ui.window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
