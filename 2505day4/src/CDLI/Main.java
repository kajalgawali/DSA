package CDLI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cdlist c1=new Cdlist();
		c1.insertATF(10);
		c1.insertATF(30);
		c1.insertATF(40);
		c1.display();
		System.out.println("\nlast");
		c1.insertATl(60);
		c1.display();
		System.out.println("\ndeletedFirst");
		c1.delete();
		c1.display();
		System.out.println("\ndeleted last");
		c1.deleteL();
		c1.display();

	}

}
