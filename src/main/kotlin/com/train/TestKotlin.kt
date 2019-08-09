package com.train

import java.util.*

fun main(args: Array<String>) {
    print("Please enter number of tickets: ")
    val scanner:Scanner= Scanner(System.`in`)
    var total=scanner.nextInt()
    print("How many round-trip tickets: ")
    var round=scanner.nextInt()

    val tk:TrainTicket= TrainTicket(total,round)
    tk.print()
}

class TrainTicket(var total:Int,var round:Int){
    fun print(){
        var singlePrize=(total-round)*1000
        var roundPrize=(round*2000)*9/10
        var sum=singlePrize+roundPrize
        println("Total tickets: $total")
        println("Round-trip: $round")
        println("Total: $sum")
    }
}