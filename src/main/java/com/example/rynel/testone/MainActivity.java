package com.example.rynel.testone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



                String size, reverse = "";
                Scanner in = new Scanner(System.in);

                System.out.println("Enter a string to check if it is a palindrome");
                size = in.nextLine();

                int length = size.length();

                for ( int i = length - 1; i >= 0; i-- )
                    reverse = reverse + size.charAt(i);

                if (size.equals(reverse))
                    System.out.println("Entered string is a palindrome.");
                else
                    System.out.println("Entered string is not a palindrome.");






    }
}
/*
Coding test
1. Method to tell you if a string is a palindrome
2. Create a singleton class and make it thread safe
3. Create a function to find the most occurrence of a integer value given an integer array.
{2,3,4,5,5,6,7}
4: Simple Java Program to check or find if a number is Armstrong number or not.
An Armstrong number of three digit is a number whose sum of cubes of its digit is equal to its number. For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153


 */
