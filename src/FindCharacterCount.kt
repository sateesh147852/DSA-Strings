fun main() {
    findCharacterCount2("My name is satish.")
}

private fun findCharacterCount(str: String) {
    val map = hashMapOf<Char, Int>()
    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
    }
    println(map)
}

private fun findCharacterCount2(str: String) {
    val isVisited = BooleanArray(str.length)
    for(i in str.indices) {
        if (isVisited[i]) continue
        var count = 1
        for(j in i + 1 until str.length) {
            if (str[i] == str[j]) {
                isVisited[j] = true
                count++
            }
        }
        println("${str[i]} --> $count")
    }
}