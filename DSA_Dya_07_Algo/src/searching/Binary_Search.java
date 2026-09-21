package searching;

class Binary_Search{	
	int binary_search(int a[],int start,int end,int key)
	{
		if(start<=end)
		{
			int mid = (start+end)/2;
					if(a[mid]==key)
						return mid;
					else
					{
						if(key<a[mid])
							return binary_search(a,start,mid-1,key);//go to left	
						else
							return binary_search(a,mid+1,end,key);//go to right
					}
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
	}
}

