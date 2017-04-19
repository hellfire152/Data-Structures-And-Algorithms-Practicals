package question3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import question1and2.FileController;
import question1and2.MyCalendar;
import question1and2.Student;
import question3.BurdenUIStrikesAgain.UIComponents;

public class BurdenControllerStrikesAgain {
	UIComponents ui;
	ObservableList<Student> studentList;
	//gets the student list
	{
		studentList = FXCollections.observableArrayList(
				Student.readStudent("student.txt"));
	}
	public BurdenControllerStrikesAgain(UIComponents ui) {
		this.ui = ui;
	}
	public void save() {
		StringBuilder sb = new StringBuilder();
		for (Student s : studentList) {
			sb.append(s.toRecord());
			sb.append(';');
		}
		FileController fc = new FileController("student.txt");
		fc.clear();
		fc.writeLine(sb.toString());
	}
	public void updateDetails(Student old, Student next) {
		//temporarily save the changes
		tempSave(old);
		//display the details for the new selected student
		updateFields(next);
	}
	public void fillComboBox() {
		ui.cbStudents.setItems(studentList);
	}
	private void tempSave(Student old) {
		old.setName(ui.tfName.getText());
		old.setBirthDate(MyCalendar.convertDate(
				ui.tfBirthdate.getText()));
		old.setTest1(Integer.parseInt(ui.tfTest1.getText()));
		old.setTest2(Integer.parseInt(ui.tfTest2.getText()));
		old.setTest3(Integer.parseInt(ui.tfTest3.getText()));
	}
	private void updateFields(Student next) {
		ui.lbName.setText(next.getName());
		ui.lbName.setText(MyCalendar.formatDate(
				next.getBirthDate()));
		ui.lbName.setText(""+next.getTest1());
		ui.lbName.setText(""+next.getTest2());
		ui.lbName.setText(""+next.getTest3());
	}
}
