fun main() {
    isPalindrome("levvel")
}

private fun isPalindrome(str: String) {
    var start = 0
    var end = str.length - 1

    while (start < end) {
        if(str[start] != str[end]) {
            println("The given string is not palindrome")
            return
        }
        start++
        end--
    }
    println("The given string is palindrome")
}