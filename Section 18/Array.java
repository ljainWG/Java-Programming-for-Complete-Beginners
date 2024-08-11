
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5]; // new int[sizeOfArray] also intialisation with 0 to all indexes
		System.out.println("Prinitng elements of array");
		for (int val : arr) { // for each loop => used to traverse array
			System.out.print(val + "\t");
		}
		System.out.println();

		System.out.println("Enter elements of array");
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Prinitng elements of array");
		for (int val : arr) { // for each loop => used to traverse array
			System.out.print(val + "\t");
		}
		System.out.println();

///////////

		int[] arr3 = new int[5];
		Arrays.fill(arr3, 34); // update value of each element of arr3 by 34
		System.out.println("Prinitng elements of array");
		for (int val : arr3) {
			System.out.print(val + "\t");
		}
		System.out.println();

///////////////

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println("Prinitng elements of array");
		for (int val : arr2) {
			System.out.print(val + "\t");
		}
		System.out.println();

//////////

		System.out.println("Prinitng elements of array");
		System.out.println(Arrays.toString(arr2));
		System.out.println(); // Array function for converting array into string and printing it

/////////////////
		int[] array1 = { 1, 2, 3, 4, 5, 5 };
		int[] array2 = { 1, 2, 3, 4, 5, 5 };
		int[] array3 = array2;
		int[] array4 = { 1, 2, 3, 4, 5, 6 };

		System.out.println(array1 == array1);
		System.out.println(array1 == array2);
		System.out.println();

		System.out.println(array2 == array3);
		System.out.println(array1 == array3);
		System.out.println();

		System.out.println(array1 == array4);
		System.out.println(array2 == array4);
		System.out.println(array3 == array4);
		System.out.println(array4 == array4);
		System.out.println();

/////////////////

		System.out.println(Arrays.equals(array1, array1));
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		System.out.println(Arrays.equals(array2, array3));
		System.out.println(Arrays.equals(array1, array4));
		System.out.println();

////////////////////

		int[] numbers = { 5, 1, 3, 2, 4 };
		System.out.println("Prinitng elements of array");
		for (int val : arr) { // for each loop => used to traverse array
			System.out.print(val + "\t");
		}
		System.out.println();
		Arrays.sort(numbers);
		System.out.println("Prinitng elements of array in sorted order");
		for (int val : arr) { // for each loop => used to traverse array
			System.out.print(val + "\t");
		}
		System.out.println();
//////////////////

		String[] fruits = { "apple", "banana", "mango" };

//////////////////

//		Student[] studObj = new Student[5]; // array of 5 instances of class Student
//		studObj[0], studObj[1], studObj[2], studObj[3], studObj[4]		// refers to null

		Student[] studObj2 = { new Student(), new Student(), new Student(), new Student(), new Student() };
//		studObj[0], studObj[1], studObj[2], studObj[3], studObj[4]		// refers to some instances of Student Class

		System.out.println();
		sc.close();
	}
}
