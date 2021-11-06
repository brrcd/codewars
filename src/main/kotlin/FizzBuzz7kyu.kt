class FizzBuzz7kyu {
    fun fizzBuzz(n: Int): Array<String> {
        val array: Array<String> = Array(n){i ->
            if ((i+1)%5 == 0 && (i+1)%3 == 0) {
                "FizzBuzz"
            } else if ((i+1)%5 == 0) {
                "Buzz"
            } else if ((i+1)%3 == 0) {
                "Fizz"
            } else {
                "${i+1}"
            }
        }
        return array
    }
}