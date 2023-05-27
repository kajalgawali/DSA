package Queue;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new Queue(6);
		q1.enque(10);
		q1.enque(190);
		q1.enque(170);
		q1.enque(107);
		q1.enque(170);
		q1.enque(910);
		q1.display();
		q1.dque();
		q1.display();
		System.out.println("\nFirst Element of Queue :"+q1.peek());
		
			//System.out.println("Deleted Element from queue - "+q1.dque());
		
		

	}

}
