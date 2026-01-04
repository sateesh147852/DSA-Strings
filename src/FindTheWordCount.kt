fun main() {
    findTheWordCount("Java Sql Python Java C C++ Java C")
}

private fun findTheWordCount(str: String) {
    val words = str.split(" ")
    val isVisited = BooleanArray(words.size)

    for (i in words.indices) {
        if (isVisited[i]) continue

        var count = 1
        for(j in i + 1 until words.size) {
            if (words[i] == words[j]) {
                count++
                isVisited[j] = true
            }
        }
        println("${words[i]} --> $count")
    }
}