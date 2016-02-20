
package firstoccurencechange;

import java.util.Scanner;
public class Firstoccurencechange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
    String sentence1, post, sentence;
       System.out.println("Enter a line of text:");
       sentence1 = keyboard.nextLine();
       int position = sentence1.indexOf("hate");
       System.out.println("I have rephrased that line to read");
       sentence = sentence1.substring(0,position) + "love";
       int last = sentence.lastIndexOf(".");
       post = sentence.substring(position, last);
       System.out.println(sentence + post);
       
        
    }
    
}
