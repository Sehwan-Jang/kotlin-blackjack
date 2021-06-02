package view

fun inputNames(): List<String> {
    println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
    return input().replace(" ", "").split(",")
}

fun inputHit(name: String): String {
    println("${name}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
    return input()
}

tailrec fun inputMoney(name: String): Int {
    println("${name}의 배팅 금액은?")
    return readLine()?.toIntOrNull() ?: inputMoney(name)
}

private tailrec fun input(): String {
    val input = readLine()
    if (input.isNullOrBlank()) {
        return input()
    }
    return input
}
