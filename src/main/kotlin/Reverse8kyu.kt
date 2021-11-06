class Reverse8kyu {
    fun reverseWords(str: String): String {
        val strArr = str.split(" ")
        return strArr.reversed().joinToString(" ")
    }
}