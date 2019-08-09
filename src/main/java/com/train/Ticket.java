package com.train;

public class Ticket {
    public int total;
    public int round;

    public Ticket(int total,int round){
        this.total=total;
        this.round=round;
    }

    public void  print(){
        int singlePrize=(total-round)*1000;
        int roundPrize=(round*2000)*9/10;
        int sum=singlePrize+roundPrize;
        System.out.println("Total tickets: "+total);
        System.out.println("Round-trip: "+round);
        System.out.println("Total: "+sum);
    }
}
