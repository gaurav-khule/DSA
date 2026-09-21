package sorting;

import java.util.Arrays;

public class MergeExample {
	void Merge_sort(int a[],int start,int end)
	{
	   if(start<end)
		{
			int mid=(start+end)/2;
			Merge_sort(a,start,mid);
			Merge_sort(a,mid+1,end);
			Merger(a,start,mid,end);//conquer
		}
	}
	
	void Merger(int a[],int start,int mid,int end){
			int temp[]=new int[a.length];
			//Need a temporary array to store data in between. 
			int i=start,j=mid+1,t_index=start;
			while(i<=mid && j<=end)//Compare both and smaller is copied 
				{
					if(a[i]<a[j])
						temp[t_index++]=a[i++];
					else
						temp[t_index++]=a[j++];
				}
			//Copy left over from either side. 
			while(j<=end)
				temp[t_index++]=a[j++];
			while(i<=mid)
				temp[t_index++]=a[i++];
			//Copy data back to A. 
			for(i=start;i<=end;i++)
				a[i]=temp[i];
	     }
	
	 static void quick_sort(int a[],int start,int end){

		int i=start;
		int j=end;
		int pivot=start;
		while(i<j){
				while(a[j]>a[pivot])//should be 
					j--;
				if(i<j){ //if not greater than swap
						int temp=a[pivot];
						a[pivot]=a[j];
						a[j]=temp;
					}
			}
		if(i<end)//not till end then
			quick_sort(a,i+1,end);
	}
	
	static void quick_sort_reverse(int a[],int start,int end)
	{
		int i=start;
		int j=end;
		int pivot=end;
		while(i<j)
			{
				while(a[pivot]>a[i])//should be 
					i++;
				if(i<j)//if not greater than swap
					{
						int temp=a[pivot];
						a[pivot]=a[i];
						a[i]=temp;
					}
			}
		if(j>start)//not till end then
			quick_sort_reverse(a,start,j-1);
	}
	
	void bubble_sort(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length-1;i++)//n-1:passes
			{
				for(j=0;j<a.length-1;j++)
				//j should stop at second last so j+1 can be last
					{
					  if(a[j]>a[j+1])
						{
							temp=a[j];a[j]=a[j+1];a[j+1]=temp;
						}
					}
			}
}

	void bubble_sort_improved(int a[])
	{
		int i,j,temp;
		for(i=a.length-1;i>0;i--)//n-1:passes
			{
				boolean done=true;
				for(j=0;j<i;j++)
					{
					  if(a[j]>a[j+1])
						{
							temp=a[j];a[j]=a[j+1];a[j+1]=temp;
							done=false;
						}
					}
				if(done==true)
					break;//stop
			}
}

	void selection_sort(int a[]) { 
	   int i,j,min,position; 
	   for(i=0;i<a.length-1;i++){
				min=a[i];
				position=i;//reference
				for(j=i+1;j<a.length;j++){
						if(a[j]<min)
						{
							min=a[j];
							position=j;											}
					}
				 a[position]=a[i];
				a[i]=min;
			}
		}
	
	static  void insertion_sort(int a[])
	 {
	     int i,j,element;
	     for(i=0;i<a.length-1;i++)
	     {
	         element=a[i+1];//new element
			j=i+1;//from j to Zero
	         while(j>0 && a[j-1]>element)
	         {
	            a[j]=a[j-1];//move back
			  j--;
	         }
	        a[j]=element;
	     }
	 }


	
	//Write a main program which has a static array, calls `merge`, and prints the array entirely. 
	public static void main(String[] args) {
		MergeExample mr = new MergeExample();
		
		int arr[] = {11,54,68,3,54,12,5,9};
		
		System.out.println("\nInitial Array: "+Arrays.toString(arr));
		
//		mr.Merge_sort(arr, 0, arr.length-1);
//		mr.quick_sort(arr, 0, arr.length-1);
//		quick_sort_reverse(arr, 0, arr.length-1);
//		mr.bubble_sort(arr);
//		mr.bubble_sort_improved(arr);
//		mr.selection_sort(arr);
		
		insertion_sort(arr);
		
		System.out.println("\nAfter Array: "+Arrays.toString(arr));
	}
}
