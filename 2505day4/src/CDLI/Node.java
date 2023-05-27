package CDLI;

public class Node {

	private int data;
  private Node pre,next;
  public Node(int data) {
	  this.data=data;
	// TODO Auto-generated constructor stub
}
public int getData()
  {
	  return data;
  }
  public void setData(int data)
  {
	  this.data=data;
  }
  public Node getNext()
  {
	  return next;
  }
  public void setNext(Node next)
  {
	  this.next=next;
  }
  public Node getPre()
  {
	  return pre;
  }
  public void setPre(Node pre)
  {
	  this.pre=pre;
  }
}
