package controlConstructur;

import java.util.Scanner;

public class ForLoopSumOfnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a num:");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<=num;i++) {
	sum=sum+i;
	System.out.println("the sum of natural numbers are:"+sum);
}
	}

}
