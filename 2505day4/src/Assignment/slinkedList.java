//3. How do you find the length of a singly linked list?
//4. How are duplicate nodes removed in an unsorted linked list?
//5. How do you find the middle element of a singly linked list in one pass?
// How to check if a given linked list is a palindrome?


package Assignment;

public class slinkedList {
	Node head;

	public slinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	public void insertAtB(int d)
	{
		Node nn =new Node(d);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			nn.setNext(head);
			head=nn;
		}
	}
	public int countlength()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	public void findMiddle()
	{
		Node temp=head;
		int length=countlength();
		int middle=length/2;
		int i=0;
		while(i<=middle)
		{
			
			temp=temp.getNext();
			i++;
		}
		System.out.print("\n"+"middle element area:"+temp.getData());
	}
	
	
	public void remove()
	{
		Node ptr1=head;
		Node ptr2=head.getNext();
		while(ptr1!=null)
		{
			Node next=ptr2.getNext();
			if(ptr1.getData()==ptr2.getData())
			{
				ptr1.setNext(next);
				ptr2.setNext(null);
			}
			else
			{
				ptr1=ptr2;
				ptr2=next;
			}
			ptr1=ptr1.getNext();
		}
	}
	public static void merge(slinkedList l1,slinkedList l2)
	{
		
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print("\t"+temp.getData()+"->");
			temp=temp.getNext();
		}
	}

}
