package Dqueue;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		dqueue d1=new dqueue();
		System.out.println("\nquque element are:");
		d1.enque(10);
		d1.enque(20);
		d1.enque(30);
		d1.display();
//		System.out.println("\nafter removing");
//		d1.dequeue();
//		d1.display();
		System.out.println("\nDeleted Element from Queue"+" "+d1.dqueuee().getData());
		d1.display();
		System.out.println("\nFirst Element from Queue "+d1.peek().getData());

	}

}
