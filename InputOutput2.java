/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melly Dwiliani
 */
import java.util.Scanner;

public class InputOutput2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = new String[3];
        int[] inputIntegers = new int[3];
        
        for (int i = 0; i < 3; i++) {
            inputStrings[i] = scanner.next();  
            inputIntegers[i] = scanner.nextInt();  
        }

        for (int i = 0; i < 3; i++) {
            String formattedString = String.format("%-15s", inputStrings[i].toLowerCase());

            String formattedInteger = String.format("%03d", inputIntegers[i]);

            System.out.println(formattedString + formattedInteger);
        }
    }
}
