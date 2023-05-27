package Assignment;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     slinkedList l1=new slinkedList();
     System.out.println("element in linked list");
     l1.insertAtB(10);
     l1.insertAtB(20);
     l1.insertAtB(10);
     l1.insertAtB(30);
//     l1.insertAtB(20);
     //l1.insertAtB(10);
    // l1.insertAtB(20);
//l1.display();
//     
//     System.out.println("\ntotal count of linked list"+l1.countlength());
//     
//     l1.remove();
//     l1.display();
//     
//     l1.findMiddle();

     slinkedList l2=new slinkedList();
     System.out.println("element in linked list");
     l2.insertAtB(80);
     l2.insertAtB(90);
     l2.insertAtB(70);
     l2.insertAtB(60);
//     l2.display()
System.out.println(l1.head);
     
     slinkedList.merge(l1, l2);
    	}

}
