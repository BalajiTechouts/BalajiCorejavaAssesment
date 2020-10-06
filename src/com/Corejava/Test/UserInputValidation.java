package com.Corejava.Test;

import java.util.Scanner;

public class UserInputValidation
{

	public void validate(String str) 
	{
		if(str.length()<10 || str.contains("&")) {
			System.out.println("usename is Invalid.please enter a valid username which comtains length of less than 10 ");
		                                         }
		else {
			System.out.println("your useme is valid");
		     }
	}
 public static void main(String[] args) 
      { 
		UserInputValidation uiv=new UserInputValidation();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String str=sc.next();
		uiv.validate(str);

	  }

}