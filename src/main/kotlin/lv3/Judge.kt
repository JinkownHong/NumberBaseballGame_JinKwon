package lv3

class Judge : NumberBaseballGame() {

    fun judgeStrikeBall() {
        for (index in 0..2) {
            if (customerInputList[index] == answerList[index]) {
                strike++
            }
            for (i in 0..2) {
                if (customerInputList[index] != answerList[index] && customerInputList[index] == answerList[i]) {
                    ball++
                }
            }
        }
    }

    fun callTheScore() {
        when {
            strike == 3 -> {
                println("정답입니다!")
            }

            strike != 0 && ball != 0 -> println("${strike}스트라이크 ${ball}볼 입니다.")
            strike != 0 && ball == 0 -> println("${strike}스트라이크입니다.")
            strike == 0 && ball != 0 -> println("${ball}볼입니다.")
            else -> println("일치하는 숫자가 없습니다. 호흡 가다듬고.. 천천히..")
        }
    }
}
