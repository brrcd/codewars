class HighestAndLowest7kyu {

    fun highAndLow(numbers: String): String {
        val strList = numbers.split(" ")
        val numList = mutableListOf<Int>()
        for (s in strList)
            numList.add(Integer.parseInt(s))
        var max = numList.maxOrNull()
        var min = numList.minOrNull()
        return "$max $min"
    }
}