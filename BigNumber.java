/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melly Dwiliani
 */
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        
        BigInteger sum = a.add(b);  
        BigInteger product = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(product);
        
        scan.close();
    }
}
    
