import java.io.*;
import java.util.Scanner;

// so this mini project pop the words into a stakc and than reverses then it print them because stack is first in and last out
public class Main {

        // defined the main method
        public static void main(String[] args) throws FileNotFoundException {

            // sample sentence for testing the StringReversal class
            String sentence = "When Chuck Norris falls in water, Chuck Norris doesn't get wet.";

            // reverse the words in the sample sentence using the StringReversal class
            String reversedSentence = wordReverse.reverseWords(sentence);

            // print the reversed sentence
            System.out.println(reversedSentence);

            // now read jokes from a file and reverse each sentence
            try {
                // specify the file path on my pc
                File file = new File("C:/Users/abhi8/IdeaProjects/ReverseWords/jokes.txt");

                // create a Scanner to read from the file
                Scanner scan = new Scanner(file);

                // StringBuilder to store the reversed content of the file
                StringBuilder fileContent = new StringBuilder();

                // iterate through each line in the file
                while (scan.hasNextLine()) {
                    // read the current line
                    String line = scan.nextLine();


                    // System.out.println(line);
                    // so this display the original content before reversal

                    // reverse the words in the line using the StringReversal class
                    String reversedLine = wordReverse.reverseWords(line);

                    // append the reversed line to the StringBuilder
                    fileContent.append(reversedLine).append("\n");
                }

                // display the reversed content after it was reversed in the while loop
                System.out.println("\nReversed Content:\n" + fileContent.toString());

            } catch (FileNotFoundException e) {
                // if error than catch it where file is not found
                System.err.println("File not found message: " + e.getMessage());
            }

        }

}