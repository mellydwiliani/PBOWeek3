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

public class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String[] tokens = sentence.split("[ ,.!?@_'\"\\s]+");

        for (String token : tokens) {
            System.out.println(token);
        }

        int tokenCount = tokens.length;

        System.out.println(tokenCount);
    }
}
