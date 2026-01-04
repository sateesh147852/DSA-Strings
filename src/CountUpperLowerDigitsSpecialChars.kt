fun main() {
    findCount("ABCDF abcd 123 !@#$")
}

private fun findCount(str: String) {
   var lowerCase = 0
    var upperCase = 0
    var specialCase = 0
    var digits = 0

    for (char in str) {
        when(char.code) {
            in 48..57 -> digits++
            in 65..90 -> upperCase++
            in 97..122 -> lowerCase++
            else -> specialCase++
        }
    }
    println(lowerCase)
    println(upperCase)
    println(specialCase)
    println(digits)
}