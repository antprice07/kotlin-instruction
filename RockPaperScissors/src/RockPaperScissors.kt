
fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(options:Array<String>) = options[(Math.random() *options.size).toInt()]

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice) {
        print("Please enter one of the following: ")
        for (option in options) print(" $option")
        println(".")
        val userInput = readLine()
        if(userInput != null && userInput in options) {
            isValidChoice = true
            userChoice = userInput
        }
        if(!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if(userChoice == gameChoice) result = "Tie!"
    else if(userChoice=="Rock"&&gameChoice=="Scissors" ||
            userChoice=="Paper"&&gameChoice=="Rock"||
            userChoice=="Scissors"&&gameChoice=="Paper") result = "You Win"
    else result = "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}


