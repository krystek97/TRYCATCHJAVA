package trycatch.sportcode.pl;

import java.util.Scanner;

public class TryCatch 
{
	int division ; 
	public static void main(String[] args)
	{
		try
		{
			int number , number2 , division;
			Scanner odczyt = new Scanner(System.in) ; 
			System.out.println("Podaj pierwsza liczbe\n") ; 
			number = odczyt.nextInt() ; 
			System.out.println("Podaj druga liczbe\n");
			number2 = odczyt.nextInt() ; 
			division = number/number2 ; 
			System.out.println(division);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Nie mozna dzielic przez zero");
		}
	}
}
