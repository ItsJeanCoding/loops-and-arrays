//Code by ItsJeanCoding on GitHub

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputcounter; //initializes how many times the user will input a value
		int count; //counter for the first loop
		int counter = 1; //displays the (sequence) input number on the first loop and the number of index on the second loop
		int highest = 0; //stores the highest value that the user gave
		int lowest = 0; // stores the lowest value that the user gave

		System.out.print("Enter how many values you will input: ");
		inputcounter = in.nextInt();

		int values[] = new int [inputcounter];
		for(count = 0; inputcounter > count; count++){
			System.out.print("Enter Value Number " + counter + " : ");
			values[count] = in.nextInt();
			counter++;
		}
		counter = 0;
		for (int i : values){
			System.out.println("Index " + counter + " : " + i);
			counter++;

			if (i > highest){
				highest = i;
			}
			if (highest > i){
				lowest = i;

			}
		}

		System.out.println("HIGHEST : " + highest);
		System.out.println("LOWEST : " + lowest);

	}
}
