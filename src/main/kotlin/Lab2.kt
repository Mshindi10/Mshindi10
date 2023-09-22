//TASK3
import java.util.*
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")//Task 4
    }

    fun main(args: Array<String>) {
        feedTheFish()//TASK3

        //TASK 2

        println("Hello, world!")
        println("Hello, ${args[0]}")
        // Will assign kotlin.Unit
        val isUnit = println("This is an expression")
        println(isUnit)

        val temperature = 10
        val isHot = if (temperature > 50) true else false
        println(isHot)
        val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
        println(message)

    }

//TASK 4
fun swim(speed: String = "fast") {
    println("swimming $speed")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"


