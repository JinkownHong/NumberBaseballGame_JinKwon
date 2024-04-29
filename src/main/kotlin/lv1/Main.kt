package org.example.lv1

fun main() {
    println("환영합니다! 숫자 야구게임을 시작합니다.")
    println("Rule1 : 숫자 3자리를 입력해주세요.")
    println("Rule2 : 1에서 9 사이 숫자를 입력해야하며 동일한 숫자는 입력할 수 없습니다.")
    print("게임을 시작합니다! 원하시는 숫자 3자리를 입력해주세요 : ")

    val oneToNineList = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val answerList = oneToNineList.shuffled().slice(0..2)


    while (true) {
        val inputList = readln().map { it.digitToInt() }


        if (inputList[0] == inputList[1] || inputList[0] == inputList[2] || inputList[1] == inputList[2]) {
            print("동일한 숫자를 입력했습니다. 다시 입력해주세요 :")
            continue
        }

        var strike = 0
        var ball = 0

        for (index in 0..2) {
            if (inputList[index] == answerList[index]) {
                strike += 1
            }
            for (i in 0..2) {
                if (inputList[index] != answerList[index] && inputList[index] == answerList[i]) {
                    ball += 1
                }
            }
        }
        when {
            strike == 3 -> {
                println("정답입니다!"); break
            }

            strike != 0 && ball != 0 -> println("${strike}스트라이크 ${ball}볼 입니다.")
            strike != 0 && ball == 0 -> println("${strike}스트라이크입니다.")
            strike == 0 && ball != 0 -> println("${ball}볼입니다.")
            else -> println("일치하는 숫자가 없습니다.")
        }
    }
}