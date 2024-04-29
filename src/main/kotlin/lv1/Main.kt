package org.example.lv1

fun main() {

    println("환영합니다! 숫자 야구게임을 시작합니다.")
    println("Rule1 : 숫자 3자리를 입력해주세요.")
    println("Rule2 : 1에서 9 사이 숫자를 입력해야하며 동일한 숫자는 입력할 수 없습니다.")
    print("게임을 시작합니다! 원하시는 숫자 3자리를 입력해주세요 : ")

    val input: Int = readln().toInt()
}