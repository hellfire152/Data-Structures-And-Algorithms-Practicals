package question1;

/*==========================================================
 Program Name:	IntNode.java
 Description:	A class to define the nodes of a binary tree
 Done by:		Phoon Lee Kien
 Admin No:		001234A
 Module Group:	IT1204-99
 ============================================================*/
public class IntNode{
	private int data;		
	private IntNode left;	
	private IntNode right;	

	// Constructor
	public IntNode (int inData, IntNode inLeft, IntNode inRight){
		data = inData;
		left = inLeft;
		right = inRight;	
	}
	public int getData(){
		return data;
	}
	public IntNode getLeft(){
		return left;
	}
	public IntNode getRight(){
		return right;
	}
	public void setLeft(IntNode inLeft){
		left = inLeft;
	}
	public void setRight(IntNode inRight){
		right = inRight;
	}
}
