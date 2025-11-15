fun main() {
    firstLetterToUpperCase("My name is sateesh chikkalagi")
    firstLetterToUpperCase2("Mys name is sateesh chikkalagi")
    firstLetterToUpperCase3("myw name is sateesh chikkalagi")
}

private fun firstLetterToUpperCase(str: String) {
    if (str.isEmpty()) return
    val charArray = str.toCharArray()
    var newWord = true
    for (i in charArray.indices) {
        if (charArray[i] == ' ') {
            newWord = true
        } else if (newWord) {
            charArray[i] = charArray[i].uppercaseChar()
            newWord = false
        }
    }
    println(String(charArray))
}

private fun firstLetterToUpperCase2(str: String) {
    if (str.isEmpty()) return
    val sb = StringBuilder(str)
    var newWord = true
    for (i in sb.indices) {
        if (sb[i] == ' ') {
            newWord = true
        } else if (newWord) {
            sb.setCharAt(i, sb[i].uppercaseChar())
            newWord = false
        }
    }
    println(sb)
}

private fun firstLetterToUpperCase3(str: String) {
    if (str.isEmpty()) return
    val sb = StringBuilder(str.length)
    var newWord = true
    for (c in str) {
        if (c == ' ') {
            newWord = true
            sb.append(c)
        } else if (newWord) {
            newWord = false
            sb.append(c.uppercaseChar())
        } else {
            sb.append(c)
        }
    }
    println(String(sb))
}