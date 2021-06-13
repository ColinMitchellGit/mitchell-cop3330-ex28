/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex28;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App
{
    public static void main( String[] args )
    {
        int sum = getNumbers();

        System.out.println("The total is " + sum + ".");
    }

    public static int getNumbers() {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += parseInt(input.nextLine());
        }

        return sum;
    }
}