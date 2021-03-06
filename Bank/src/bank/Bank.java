/*
 * Bank.java
 * bank application with classes for accounts and customers
 * by christopher mccauley
 */

package bank;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
    
    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", 
                                            "MyTown", "FL", "33445");
        Scanner input = new Scanner(System.in);
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println(munozAccount);
        
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble();
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        munozAccount.withdrawal(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.println("munozAccount.changeAddress() demo: ");
        munozAccount.changeAddress("500 East 300 South", "Kaysville", "UT", "84037");
        System.out.println(munozAccount);
        
    }
}