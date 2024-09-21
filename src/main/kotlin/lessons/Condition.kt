package lessons

import kotlin.random.Random

fun main() {
    val height = Random.nextInt(0, 300)

    if (height < 100) {
        println("ты низкий")
    } else if (height < 200) {
        println("ты норм")
    } else {
        println("ты выский")
    }

    when (height) {
        in (0..100) -> println("ты низкий")
        in (101..200) -> println("ты норм")
        else -> println("ты выский")
    }
}