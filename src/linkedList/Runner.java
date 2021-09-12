package linkedList;


public class Runner {

	public static void main(String args[]) {
	
		linkedlistdemo list = new linkedlistdemo();
		list.insert(10);
		list.insert(20);
		list.insert(40);
		list.insertAtStart(60);
		
		list.insertAt(0,24);
		list.deleteAt(3);
		list.show();
	}
}
