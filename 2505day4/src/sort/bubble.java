package sort;

public class bubble {
   static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
public	 void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {35, 10, 31, 11, 26};    
		    bubble b1 = new bubble();  
		    System.out.println("Before sorting array elements are - ");    
		    b1.print(arr);  
		    b1.sort(arr);  
		    System.out.println();  
		    System.out.println("After sorting array elements are - ");    
		    b1.print(arr);  
			
		

	}

}
