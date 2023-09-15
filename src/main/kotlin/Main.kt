fun main(args: Array<String>) {
    println("What is your name?")
    val  name = readln()
    println("Hello ,$name")

        print("Enter a number: ")
        val stringInput = readLine()!!
        var integer:Int = stringInput.toInt()
        println("You entered: $integer")

        val first: Int = 10
        val second: Int = 20
        val sum = first + second
        println("The sum is: $sum")

    val ch = 'i'
    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u')"vowel" else "consonant"
    println("$ch is $vowelConsonant")

    val year = 1990
    var leap = false

    if (year % 4 ==0) {
        if (year %100 == 0) {
            leap = year % 400 == 0
        }else
            leap = true
    }else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}