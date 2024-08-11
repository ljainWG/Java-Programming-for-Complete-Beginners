
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

	static void print(ArrayList ls) {
		System.out.println(ls);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList fruits = new ArrayList(); // datatype of element of arraylist is not mentioned therefore we can add
											// any datatype in it
											// but the good practise is to mention it explictly always
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add(23.336);
		System.out.println("Printing ArrayList");
		print(fruits);

		fruits.remove("apple"); // .remove(element)
		System.out.println("Printing ArrayList");
		print(fruits);

		fruits.remove(1);
		System.out.println("Printing ArrayList"); // .remove(index)
		print(fruits);

///////////////
		ArrayList<String> osList = new ArrayList<String>();
		osList.add("Mac");
		osList.add("Windows");
		osList.add("Unix");
		osList.add("Linux");

////////////////
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(23);
		marks.add(45);
		marks.add(65);
		marks.add(2);
		marks.add(49);
		int maxMarks = Collections.max(marks);
		int minMarks = Collections.min(marks);
		System.out.println(marks);
		System.out.println("size of arraylist is " + marks.size());
		System.out.println("maximum marks = " + maxMarks);
		System.out.println("minimum marks = " + minMarks);

		System.out.println();
		sc.close();
	}

}
