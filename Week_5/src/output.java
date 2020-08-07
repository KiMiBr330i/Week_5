import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.System;

/*Write a program that reads strings from the user and writes them to an output file called
userStrings.txt. Terminate processing when the user enters the string "DONE". Do not
write the sentinel string to the output file.*/

public class output {

	public static void main(String[] args) throws IOException {
		// asks user for input string
		// create an output stream for a file called userString.txt.

		FileWriter fw = new FileWriter("userStrings.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		Scanner userinput = new Scanner(System.in);
		String userStrings;
		System.out.println("Please enter a string: ");
	 	userStrings = userinput.nextLine();
		outFile.print(userStrings = userinput.nextLine());
		outFile.println();

		System.out.println("This is your string: " + userStrings + ". It is saved as userStrings.txt.");
		outFile.close();
		
	}

}
