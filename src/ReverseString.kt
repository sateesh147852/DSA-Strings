fun main() {
    reverseString("My name is satish")
    reverseString2("My name is satish")
}

private fun reverseString(str: String) {
    val charArray = str.toCharArray()
    for (i in 0..charArray.size / 2) {
        val temp = charArray[i]
        charArray[i] = charArray[charArray.size - 1 - i]
        charArray[charArray.size - 1 - i] = temp
    }
    println(String(charArray))
}

private fun reverseString2(str: String) {
    val sb = StringBuilder(str)
    var start = 0
    var end = sb.length - 1
    while (start < end) {
        val temp = sb[start]
        sb.setCharAt(start, sb[end])
        sb.setCharAt(end, temp)
        start++
        end--
    }
    println(sb.toString())
}