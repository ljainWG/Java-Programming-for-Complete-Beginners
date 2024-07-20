package com.section16.referenceType;

public class referenceType {
	public static void main(String[] args) {
		String str = "Lakshay Jain";
		String str2 = "Lakshay Jain";
		String str3 = str;
		String str4 = new String("Lakshay Jain");

		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str3 == str2);

		System.out.println(str == str4);

		System.out.println(str.equals(str3));
		System.out.println(str.equals(str4));

//		boolean r1 = (str == str2);		
//		boolean r2 = str.equals(str2);
//		boolean r3 = str.equalsIgnoreCase(str2);
//		int r4 = str.compareTo(str2);				// r4 = str.length() - str2.length()

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		str = "WatchGuard";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		str4 = "WatchGuard";
		System.out.println(str4);

		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str3 == str2);

		System.out.println(str == str4);

		System.out.println(str.equals(str3));
		System.out.println(str.equals(str4));


	}
}
