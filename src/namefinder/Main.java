/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namefinder;

import java.util.Scanner;

/**
 *
 * @author Test
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    //setting the name to be guessed
    String name = "cody";
    //setting an empty string variable for upcoming guesses
    String guessLetters = "";
    //recieving the first guess and adding it in the empty string
    System.out.print("Enter first letter : ");
    String letter1 = scanner.nextLine().toLowerCase();
    
    guessLetters += letter1;
    
    System.out.print("Enter second letter : ");
    String letter2 = scanner.nextLine().toLowerCase();
    guessLetters += letter2;
    
    System.out.print("Enter third letter : ");
    String letter3 = scanner.nextLine().toLowerCase();
    guessLetters += letter3;
    
    System.out.print("Enter fourth letter : ");
    String letter4 = scanner.nextLine().toLowerCase();
    guessLetters += letter4;
    
    //name checking conditions LOGIC = if the String variable guessLetters contains letters specifically c, o, d, and y, in no specific order, the condition is in fact true and will print I found you, if its false(1 condition was not met) print I havent found you.
    if (guessLetters.contains("c") && 
        guessLetters.contains("o") &&
        guessLetters.contains("d") &&
        guessLetters.contains("y")) {
        
      System.out.println("I found you!");
      
    } else {
      System.out.println("I haven't found you");
    }
    
  }
}
