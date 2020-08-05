//--------------------------------------------------------
// Lab 5 Exercise 1  Kip Brower 08/04/2020
//input.java
//
//--------------------------------------------------------
/* a) Create a text file called "input.csv" which contains the following three lines of numbers,
separated by commas:
1,4,6,7,8
2,3,1,5,6
3,2,1,4,5
b) Write a program that reads the file you created (make sure it's in the right folder) and
outputs to the screen the largest number in each row. The output should looks like this:
Maximum values
ROW 1: 8
ROW 2: 6
ROW 3: 5 

*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class input {

	public static void main(String[] args) throws FileNotFoundException {
	
		int num, row1max, row2max, row3max;
	File f = new File("/Users/kipbrower/Desktop/input1.csv");
	Scanner fileScan = new Scanner(f);

	
	System.out.println(fileScan.nextLine());
	System.out.println();
	//scan the first row for the largest integer
	//print the largest integer in the row
	System.out.println(fileScan.nextLine());
	System.out.println();
	System.out.println(fileScan.nextLine());
	System.out.println();
	
	
	}
	
	}
	


