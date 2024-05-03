package lv3

open class NumberBaseballGame {
    val readyForAnswerList = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val answerList = readyForAnswerList.shuffled().slice(0..2).toMutableList()

    val customerInput = readln()
    val customerInputList = customerInput.map { it.digitToInt() }

    var strike = 0
    var ball = 0
    val selectMenu = readln()

    var countGame = 0
    var countTry = 0
    val recordList: MutableList<Int> = mutableListOf()
}