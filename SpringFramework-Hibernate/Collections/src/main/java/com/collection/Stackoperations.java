package com.collection;

import java.util.Scanner;
import java.util.Stack;

public class Stackoperations {

	public static void main(String[] args) {

		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);
		int position, element;
		while(true){
		System.out.println("-------------------");
		System.out.println("      1.Push       ");
		System.out.println("      2.Pop        ");
		System.out.println("      3.Search     ");
		System.out.println("      4.Exit       ");
		System.out.println("  Enter Your Choice");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter elements");
			element = sc.nextInt();
			st.push(element);
			System.out.println("Stack element are "+st);
			break;
		case 2:
			st.pop();
			System.out.println(" After Poped "+st);
			break;
		case 3:
			
			System.out.println("Enter search element");
			position=st.search(sc.nextInt());
			System.out.println("Searched Element @ " +position);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Plz enter exist number only");

		}
		}

	}

}
