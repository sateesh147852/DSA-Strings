fun main() {
    reverseEachWord("My name is satish")
}

private fun reverseEachWord(str: String) {
    val charArray = str.toCharArray()
    var start = 0

    for (i in charArray.indices) {
        if (charArray[i] == ' ' || i == charArray.lastIndex) {
            var left = start
            var right = if (charArray[i] == ' ') i-1 else i

            while (left < right) {
                val temp = charArray[left]
                charArray[left] = charArray[right]
                charArray[right] = temp
                left++
                right--
            }
            start = i + 1
        }
    }
    println(String(charArray))
}