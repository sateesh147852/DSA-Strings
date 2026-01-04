fun main() {
    removeDuplicateWords4("Java Kotlin Java KOTLIN Python Python C")
}

private fun removeDuplicateWords(str: String) {
    val hashSet = HashSet<String>()
    val sb = StringBuilder()
    for (word in str.split(" ")) {
        if (hashSet.add(word)) {
            sb.append(word).append(" ")
        }
    }
    println(sb.trim())
}

private fun removeDuplicateWords2(str: String) {
    val uniqueArray = ArrayList<String>()
    for (word in str.split(" ")) {
        var isPresent = false
        for (temp in uniqueArray) {
            if (temp == word) {
                isPresent = true
                break
            }
        }
        if (!isPresent) {
            uniqueArray.add(word)
        }
    }
    println(uniqueArray.joinToString(" "))
}

private fun removeDuplicateWords3(str: String) {
    val sb = StringBuilder()
    for (word in str.split(" ")) {
        var isPresent = false
        for (temp in sb.split(" ")) {
            if (word == temp) {
                isPresent = true
                break
            }
        }
        if (!isPresent) {
            sb.append(word).append(" ")
        }
    }
    println(sb.trim())
}

private fun removeDuplicateWords4(str: String) {
    val result = StringBuilder()
    val words = str.split(" ")
    for (i in words.indices) {
        var isDuplicate = false
        for(j in 0 until i) {
            if (words[i] == words[j]) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            result.append(words[i]).append(" ")
        }
    }
    println(result.trim())
}