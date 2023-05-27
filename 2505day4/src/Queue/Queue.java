package Queue;

public class Queue {
	private int data[];
	private int front,rear;
	
	
	Queue(int size)
	{
		data=new int[size];
		front=-1;
		rear=-1;
	}
	public int getFront()
	{
		return front;
	}
	public void setFront(int front)
	{
		this.front=front;
	}
	public int getRear()
	{
		return rear;
	}
	public void setRear(int rear)
	{
		this.rear=rear;
	}
	public boolean isEmpty()
	{
		if(rear==-1) 
			return true;
		return false;
		
	}
	public  boolean isFull()
	{
		if( rear==data.length-1)
			return true;
		return false;
	}
	public void enque(int v)
	{
		if(isFull())
		{
			System.out.println("\n Queue is full");
			return;
		}
		if(rear==-1)
			front=0;
		data[++rear]=v;
			
		
     }
	public int dque()
	{
		if(isEmpty())
		{
			System.out.println("\nQueue is empty");
			return -1;
		}
		int v=data[++front];
		return v;
				
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("\n queue is empty");
			return -1;
		}
		return data[front];
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("\n queue is empty");
			return;
		}
		System.out.println("\n queue element are:");
		for(int i=front;i<=rear;i++) {
			System.out.print("\t"+data[i]+"->");
		}
	}
}




































