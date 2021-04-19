/**
 * 
 */
package com.java.string;

/**
 * @author Yadav Vinod, methods of String
 *
 */
public class Student1 {
	public static void main(String[] args) {
		char[] ch = { 's', 'a', 't', 'i', 's', 'h' };
		String s = new String(ch);
		System.out.println(s);
		System.out.println();

		System.out.println("literal string");
		String s1 = "welcome";
		System.out.println(s1);
		System.out.println();

		System.out.println("By new keyword");
		String s2 = new String("Welcome Satish Yadav");
		System.out.println(s2);
		System.out.println();

		System.out.println("Immutable String");
		String s3 = "Satish";
		s3.concat("Yadav");
		System.out.println(s3);

		String s4 = s3.concat("Yadav");
		System.out.println(s4);
		System.out.println();

		System.out.println("String compare() method");
		System.out.println("equal() method");
		String s5 = "Satish";
		String s6 = "Satish";
		String s7 = new String("Satish");
		String s8 = "Sohan";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s5.equals(s8));
		System.out.println();

		System.out.println("equalsIgnoreCase() method");
		String s9 = "SATISH";
		System.out.println(s5.equals(s9));
		System.out.println(s5.equalsIgnoreCase(s9));
		System.out.println();

		System.out.println("== compare reference also");
		System.out.println(s5 == s6);// true
		System.out.println(s5 == s7);// false (==) check reference also
		System.out.println();

		System.out.println("compareTo() method");
		String s10 = "Abhishek";
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareTo(s10));
		System.out.println(s10.compareTo(s5));
		System.out.println();

		System.out.println("Concatenation() method");
		String s11 = "Satish" + "Yadav";
		System.out.println(s11);
		String s12 = 100 + 50 + "Satish" + 20 + 20;
		System.out.println(s12);
		System.out.println();

		System.out.println("concat() method");
		String s13 = "Sohan";
		String s14 = "Yadav";
		String s15 = s13.concat(s14);
		System.out.println(s15);
		System.out.println();

		System.out.println("Substring() method");
		System.out.println("substring() method");
		String s16 = "Saloni Yadav Deoria";
		String s17 = s16.substring(6);
		System.out.println(s17);
		System.out.println("substring() method");
		String s18 = s16.substring(6, 12);
		System.out.println(s18);
		System.out.println();

		System.out.println("toUpperCase(), toLowerCase() method");
		String s19 = "satish yadav";
		String s20 = s19.toUpperCase();
		System.out.println(s20);
		System.out.println(s20.toLowerCase());
		System.out.println();

		System.out.println("trim() method");
		String s21 = "      Satish";
		System.out.println(s21);
		System.out.println(s21.trim());
		System.out.println();

		System.out.println("startsWith() method");
		System.out.println(s19.startsWith("s"));
		System.out.println("endsWith() method");
		System.out.println(s19.endsWith("v"));
		System.out.println();

		System.out.println("length() method");
		System.out.println(s19.length());
		System.out.println();

		System.out.println("intern() method");
		String s22 = new String("Sohan");
		String s23 = s22.intern();
		System.out.println(s23);
		System.out.println();

		System.out.println("valueOf() method");
		int a = 100;
		String s24 = String.valueOf(a);
		System.out.println(s24 + 100);
		System.out.println();

		System.out.println("replace() method");
		String s25 = "Saloni Yadav Jokaha Khash Deooria";
		String s26 = s25.replace("Deooria", "Deoria");
		System.out.println(s26);

	}
}
