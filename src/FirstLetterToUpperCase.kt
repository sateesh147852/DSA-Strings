fun main() {
    firstLetterToUpperCase("my name is sateesh chikkalagi")
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