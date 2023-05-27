package serching;

public class binary {
 	int binarydisplay(int arr[],int k)
	{
	int l=0,h=arr.length;
	while(l<=h)
	{
		
		int mid=l+(h-l)/2;
		if(arr[mid]==k)
		{
			return mid;
		}
		if(arr[mid]<k)
		{
			l=mid+1;
		}
		else
		{
			h=mid-1;
		}
		
			
	}
	return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary b1= new binary();
        int arr[]= {2,5,8,12,16,23,38,56,72,91};
     int result=  b1.binarydisplay(arr, 91);
     if(result==-1)
     {
    	 System.out.println("element are not found");
     }
     else
     {
    	 System.out.println("element are found at index:"+result);
     }
       
        
        
	}
}
