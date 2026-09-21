package assignment_searching;

import java.util.Scanner;

public class LinearOrBinarySearch {

	static void LineraSorted(int a[], int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				System.out.println("Element "+key+" found at position " + i);
				return;
			}
		}
		System.out.println(key +" Element Not Found");
	}
	
	 int BinarySearch(int a[],int start, int end, int key) {
		if(start <= end) {
			int mid = (start+end)/2;
			if(a[mid] == key) {
				return mid;
			}
			else {
				if(key<a[mid]) 
					 return BinarySearch(a,start,mid-1,key);
				else
					return BinarySearch(a,mid+1,end,key);//go to right
			}
			
		}else
			return -1;
	}
	 
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int maxSize = sc.nextInt();
		int[] arr= new int[maxSize];
		
		System.out.print("Enter Array Elements: ");
		
		for(int i=0; i<=maxSize; i++) {
			arr[i] = sc.nextInt();
		}
	
		int choice, e;
		
		do {
			System.out.print("-----------Select Choice--------------");
			System.out.print("1.Search By Linear: ");
			System.out.print("2. Search By Binary: ");
			System.out.print("0.Exit");
			
			choice = sc.nextInt();
			
			
		}while(choice != 0);
		
		
		
	
	}	
}
