package Cqueue;

public class cqueue {
  private int data[];
  private int front,rear;
  int size;
  public cqueue(int size)
  {
	  data=new int[size];
	  this.front=-1;
	  this.rear=-1;
	  
  }
public int[] getData() {
	return data;
}
public void setData(int[] data) {
	this.data = data;
}
public int getFront() {
	return front;
}
public void setFront(int front) {
	this.front = front;
}
public int getRear() {
	return rear;
}
public void setRear(int rear) {
	this.rear = rear;
}
public boolean isEmpty()
{
	if(rear==-1)
	return true;
	return false;
}
public boolean isFull()
{
	if(rear==data.length-1 && front==0||front==rear+1)
		return true;
	return false;
}
  public void enqueue(int v)
  {
	if(isFull())
	{
		return;
	}
	if(rear==-1)
	{
		front=0;
	}
	data[++rear%size]=v;
  }
}
