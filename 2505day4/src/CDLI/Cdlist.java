package CDLI;

public class Cdlist {
 Node head,tail;
 Cdlist()
 {
	 this.head=null;
	 this.tail=null;
 }
 public void insertATF(int v)
 {
	 Node nn=new Node(v);
	 if(head==null)
	 {
		 head=nn;
		 tail=nn;
		 head.setNext(nn);
		 tail.setPre(nn);
	 }
	 else {
		 nn.setNext(head);
		 nn.setPre(tail);
		 head.setPre(nn);
		 tail.setNext(nn);
		 
		 head=nn;
		 
	 }
 }
 public void insertATl(int v)
 {
	 Node nn=new Node(v);
	 Node temp=head;
	 if(temp!=head)
	 {
		 head=nn;
		 tail=nn;
		 head.setNext(nn);
		 head.setPre(nn);
		 
	 }
	 else
	 {
		 while(temp.getNext()!=head)
		 {
			 temp=temp.getNext();
		 }
		 tail.setNext(nn);
		 nn.setPre(tail);
		 nn.setNext(head);
		 head.setPre(nn);
		 tail=nn;
	 }
 }
 public void delete()
 {
	 Node temp=head;
	 head=head.getNext();
	 head.setPre(tail);
	 tail.setNext(head);
	 temp.setNext(null);
	 temp.setPre(null);
 }
 public void deleteL()
 {
	 Node temp=head;
	 while(temp.getNext().getNext()!=head)
	 {
		 temp=temp.getNext();
	 }
	 head.setPre(temp);
	 temp.setNext(head);
	 tail.setNext(null);
	 tail.setPre(null);
	 tail=temp;
	 
 }
 public void display()
 {
	 Node temp=head;
	 while(temp.getNext()!=head)
	 {
		 System.out.print("\t"+temp.getData()+"->");
		 
	   temp=temp.getNext();
	 }
	 System.out.print("\t"+temp.getData()+"->");
	 
 }
}

