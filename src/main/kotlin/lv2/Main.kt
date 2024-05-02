package org.example.lv2

fun main() {
    var countGame = 0
    val recordList: MutableList<Int> = mutableListOf()

    while (true) {
        var countTry = 0

        print("1.Game Start 2.View Record 3. End The Game : ")
        val selectMenu = readln()

        if (countGame == 0 && selectMenu == "2") {
            println("현재까지 확인되는 기록이 없습니다! 게임을 진행해주세요!")
            continue
        }

        when {
            selectMenu == "3" -> {
                println("See You Next Time!");break
            }

            selectMenu == "2" -> {
                for (index in 1..recordList.size) {
                    println("$index GAME : ${recordList[index - 1]} TRY")
                }
                continue
            }

            selectMenu != "1" -> {
                println("1, 2, 3 중 하나만 입력해주세요!")
                continue
            }
        }

        println("Rule1 : 3자리 숫자를 입력해주세요.")
        println("Rule2 : 0에서 9 사이 숫자를 입력해야 하며, 동일한 숫자는 입력할 수 없습니다.")
        print("게임을 시작합니다! 원하시는 숫자 3자리를 입력해주세요 : ")

        val readyForAnswerList = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val answerList = readyForAnswerList.shuffled().slice(0..2).toMutableList()
        if (answerList[0] == 0) {
            answerList[0] = answerList[1]
            answerList[1] = 0
        }

        while (true) {
            val input = readln()

            try {
                val test: Int = input.toInt()
            } catch (e: NumberFormatException) {
                print("문자가 아닌 숫자를 입력해주세요! :")
                continue
            }

            val inputList = input.map { it.digitToInt() }

            if (input.length != 3) {
                print("세자리 수를 입력해주세요! : ")
                continue
            }
            if (inputList[0] == 0) {
                print("맨 앞자리 숫자에는 0은 입력할 수 없습니다! : ")
                continue
            }

            if (inputList[0] == inputList[1] || inputList[0] == inputList[2] || inputList[1] == inputList[2]) {
                print("동일한 숫자를 입력할 수 없습니다 :")
                continue
            }

            var strike = 0
            var ball = 0

            for (index in 0..2) {
                if (inputList[index] == answerList[index]) {
                    strike++
                }
                for (i in 0..2) {
                    if (inputList[index] != answerList[index] && inputList[index] == answerList[i]) {
                        ball++
                    }
                }
            }
            countTry++

            when {
                strike == 3 -> {
                    println("정답입니다!"); break
                }

                strike != 0 && ball != 0 -> println("${strike}스트라이크 ${ball}볼 입니다.")
                strike != 0 && ball == 0 -> println("${strike}스트라이크입니다.")
                strike == 0 && ball != 0 -> println("${ball}볼입니다.")
                else -> println("일치하는 숫자가 없습니다. 호흡 가다듬고.. 천천히..")
            }
        }
        countGame++
        recordList.add(countTry)
    }
}