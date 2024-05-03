package lv3

class Administrator : NumberBaseballGame() {

    fun firstTryRecord() {
        if (countGame == 0 && selectMenu == "2") {
            println("현재까지 확인되는 기록이 없습니다! 게임을 진행해주세요!")
        }
    }

    fun chooseNotOnTheMenu() {
        when {
            selectMenu != "1" -> {
                println("1, 2, 3 중 하나만 입력해주세요!")
            }
        }
    }

    fun eliminateFirstZero() {
        if (answerList[0] == 0) {
            answerList[0] = answerList[1]
            answerList[1] = 0
        }
    }

    fun inputString() {
        try {
            val test: Int = customerInput.toInt()
        } catch (e: NumberFormatException) {
            print("문자가 아닌 숫자를 입력해주세요! :")
        }
    }

    fun inputMiss() {
        if (customerInput.length != 3) {
            print("세자리 수를 입력해주세요! : ")
        }
        if (customerInputList[0] == 0) {
            print("맨 앞자리 숫자에는 0은 입력할 수 없습니다! : ")
        }

        if (customerInputList[0] == customerInputList[1] || customerInputList[0] == customerInputList[2] || customerInputList[1] == customerInputList[2]) {
            print("동일한 숫자를 입력할 수 없습니다 :")
        }
    }
}

