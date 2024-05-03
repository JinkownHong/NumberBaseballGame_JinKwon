package lv3

class Recorder : NumberBaseballGame() {

    fun customerSelectRecord() {
        when {
            selectMenu == "2" -> {
                for (index in 1..recordList.size) {
                    println("$index GAME : ${recordList[index - 1]} TRY")
                }
            }
        }
    }

    fun customerFinishRecord() {
        when {
            selectMenu == "3" -> {
                println("See You Next Time!")
            }
        }
    }
}