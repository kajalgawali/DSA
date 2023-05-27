package Dqueue;

public class dqueue {
private	Node front,rear;
	public dqueue()
	{
		this.front=null;
		this.rear=null;
	}
public void enque(int v)
{
	Node nn=new Node(v);
//	if(isFull())
//	{
//		System.out.println("\n queue is full");
//		return;
//	}
	if(rear==null)
	{
		front=nn;
		rear=nn;
		
	}
	else
	{
		rear.setNext(nn);//in queue node inserted in rear not a front
		rear=nn;
	}
}
public Node dqueuee()
{
	Node temp=front;
	front=front.getNext();
	temp.setNext(null);
	return temp;
}
public Node peek()
{
	if(isEmpty())
	{
		System.out.println("\n queue is empty");
		return null; 
	}
	return front;
	
}
public boolean isEmpty()
{
	if(rear==null)
		return true;
	return false;
}
public boolean isFull()
{
	if(front==null)
		return true;
	  return false;
}

public void display()
{
	Node temp=front;
	if(isEmpty())
	{
		System.out.println("\nQueue is empty");
	}
	while(temp!=null)
	{
		System.out.print(temp.getData()+"->");
		temp=temp.getNext();
	}
}
}
