
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("The value at index 2 is "+arr[2]);
		System.out.println("------------------");
		
		printArray(arr);
		
		System.out.println("--------------------");
		
		addElements(arr);
		
		System.out.println("------------------");
		
		printArray(arr);
		
	}
	
	public static void addElements(int[] arr){
		
		System.out.println("Enter the elements");
		
		for(int i=0; i<=arr.length-1; i++){
			arr[i]=sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr){
		System.out.println("print the array which is taken from user");
		
		for(int i=arr.length-1; i>=0; i--){
			System.out.println("The element at index "+i+" is "+arr[i]);
		}
	}

}

/*
OUTPUT:
Enter the size of array
4
The value at index 2 is 0
------------------
print the array which is taken from user
The element at index 3 is 0
The element at index 2 is 0
The element at index 1 is 0
The element at index 0 is 0
--------------------
Enter the elements
14
15
87
2
------------------
print the array which is taken from user
The element at index 3 is 2
The element at index 2 is 87
The element at index 1 is 15
The element at index 0 is 14


*/
