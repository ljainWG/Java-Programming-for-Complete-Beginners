package com.section16.referenceType;

public class ExploreStrings {
	public static void main(String[] args) {
		String str = "Lakshay Jain";

//		 str.indexOf(character/substring)
//		 str.lastIndexOf(character/substring)
//		
//		 str.chartAt(characterInString)
//		
//		 str.substring(index)
//		 str.substring(index1, index2) 			// index1 is inclusive and index2 is exclusive
//		 str.subSequence(index1, index2)

		System.out.println(str.indexOf("J"));
		System.out.println(str.indexOf("Jain"));

		System.out.println(str.charAt(5));

		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));

		System.out.println(str.lastIndexOf("ain"));
		str = "Lakshay Jain ain";
		System.out.println(str.lastIndexOf("ain"));

		str = "Lakshay Jain";

//		str.contains(substring)
//		str.startsWith(substring)
//		str.endsWith(substring)
//		
//		str.isEmpty()
//
//      str.concat(anotherString)		// str remains unchanged	.concat() function returns a string which can be assigned to another string

		String message = "Welcome to WG ".concat(str);
		System.out.println(message);

//		str.toUpperCase()				// str gets changed
//		str.toLowerCase()				// str gets changed
//		str.trim()						// str is updated, removes the starting and ending white spaces from string
//		Strings.join("xyz",str,str2,str3, etc)		// return a new string, rest all strings are unchanged
// 		str.replace(s1,s2)				// replace s1 with s2 in str string, str string is updated/changed	,	any it doesnt throw error if s1 is not present in str

		// StringBuffer is mutable, StringBuffer is a synchronised class that means
		// StringBuffer class is ready for mulithreading
		StringBuffer sb = new StringBuffer(str);
		sb.append(" welcome to WG");
		int idx = sb.indexOf("welcome");
		sb.setCharAt(idx, 'W');
		System.out.println(sb);

		// StringBuilder is a non-synchronised class that means it is not for
		// multithreading
		// StringBuilfer and StringBuffer is choosen over String when we want to
		// concatinate multiple string because string is immutale while othern't

		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);


	}
}
