package lessons

import kotlin.random.Random

fun main() {
    // вариант 1
    var randomNumber = Random.nextInt(0, 100)
    while (randomNumber != 50) {
        print("number = $randomNumber | ")
        randomNumber = Random.nextInt(0, 100)
    }
    println("you win")

    // вариант 2

    do {
        val random = Random.nextInt(0, 100)
        println("randome number = $random | ")
    } while (random != 50)

    println("you win")
}