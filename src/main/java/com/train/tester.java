package com.train;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner=new Scanner(System.in);
        int total=scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int round=scanner.nextInt();

        Ticket tk=new Ticket(total,round);
        tk.print();
    }
}
