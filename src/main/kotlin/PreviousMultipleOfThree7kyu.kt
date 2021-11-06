class PreviousMultipleOfThree7kyu {
    fun prevMultipleOfThree(n: Int): Int? {
        var result: Int? = null
        if (n%3 == 0) return n
        if (n > 2) {
            var temp = n
            while (temp%3 != 0) {
                if (temp%3 == 0) {
                    return result
                } else {
                    temp /= 10
                    result = temp
                }
            }
        }
        if (result == 0){
            return null
        }
        return result
    }
}