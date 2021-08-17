package com.abstract_pattern;

import java.util.Scanner;

public final class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the companym");
		Scanner sc = new Scanner(System.in);
		String company = sc.next().toLowerCase().trim();				// audi or mercedes
		sc.close();
		
		Client client = new Client();
		client.doSomeClientJob(company);
	}
}