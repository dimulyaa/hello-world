package lessons

fun main() {
    for (i in 0..99) {
        if (i == 80) break
        println("$i. ")
    }

    println("finish")

    repeat(100) {
        if (it == 80) println("sojfdohsldkfjsdf")
        println("$it.")
    }
}