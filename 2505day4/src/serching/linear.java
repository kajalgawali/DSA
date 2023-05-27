package serching;

public class linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,90,80,66};
		boolean flag=false;
		int k=80,i=0;
		for( i=0;i<arr.length;i++)
		{
			System.out.println("array element are:"+arr[i]);
			if(arr[i]==k)
			{
				flag= true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(k+" "+"found element at index "+(i+1));
		}
		else
		{
			System.out.println("not found");
		}
		

	}

}
