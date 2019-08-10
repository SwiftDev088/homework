package com.train

import java.util.*

fun main(args: Array<String>) {
    val endNumber = -1
    var total = 0

    while(total != endNumber) {
        print("Please enter number of tickets: ")
        val scanner: Scanner = Scanner(System.`in`)
        total = scanner.nextInt()
        if(total == endNumber) break
        print("How many round-trip tickets: ")
        var round = scanner.nextInt()
        if(round == endNumber) break

        val tk: TrainTicket = TrainTicket(total, round)
        tk.print()
        println("\n------Enter '-1' to exit------\n");
    }
}

class TrainTicket(var total:Int,var round:Int) {
    fun print() {
        var singlePrize = (total - round) * 1000
        var roundPrize = (round * 2000) * 9 / 10
        var sum = singlePrize + roundPrize
        println("Total tickets: $total")
        println("Round-trip: $round")
        println("Total: $sum")
    }
}