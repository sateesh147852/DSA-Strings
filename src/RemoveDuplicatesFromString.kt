fun main() {
    removeDuplicatesFromString("raining here...")
}

private fun removeDuplicatesFromString(str: String) {
    val sb = StringBuilder()
    val isSeen = BooleanArray(256)
    for (c in str) {
        println(c.code)
        if (!isSeen[c.code]) {
            sb.append(c)
            isSeen[c.code] = true
        }
    }
    println(sb)
}