package exampleprime;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inp = new Scanner(System.in);
System.out.println("enter radius");
int input = inp.nextInt();
double result = Math.PI*input*input;
System.out.println("Area of circle :"+result);

	}

}