package com.train;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        int total = 0;
        int endNumber = -1;

        while(total != endNumber) {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            total = scanner.nextInt();
            if(total == endNumber) break;
            System.out.print("How many round-trip tickets: ");
            int round = scanner.nextInt();
            if(round == endNumber) break;

            Ticket tk = new Ticket(total, round);
            tk.print();
            System.out.println("\n------Enter '-1' to exit------\n");
        }
    }
}
