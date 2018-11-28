package com.cg;

import java.util.Scanner;

import com.cg.demo.MyBook;

public class MyMainClass {

	public static void main(String[] args) {
	   System.out.println("Hello");
       MyBook b1=new MyBook(1,"Java");
       System.out.println(b1.getBookid());
       System.out.println(b1.getBooknam());
       Scanner sc=new Scanner(System.in);
       int bookid=sc.nextInt();
       System.out.println("enter"+bookid);
      
	}

}
