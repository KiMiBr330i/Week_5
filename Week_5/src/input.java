//--------------------------------------------------------
// Lab 5 Exercise 1  Kip Brower 08/04/2020
// input.java
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
import java.util.Arrays;
import java.util.regex.Pattern;


public class input {

	public static void main(String[] args) throws FileNotFoundException {
		
		String rows = null, row1, row2, row3;
		Scanner row1Scan, row2Scan, row3Scan;
		
	File f = new File("/Users/kipbrower/Desktop/input1.csv");
	Scanner file = new Scanner(f);

	while (file.hasNext())
		rows = file.toString();
		System.out.println(rows);
		System.out.println();
	
	
	/*System.out.println(fileScan.nextLine());
	System.out.println();
	System.out.println(fileScan.nextLine());
	System.out.println();
	System.out.println(fileScan.nextLine());
	System.out.println();*/
	
	}}
	
	




