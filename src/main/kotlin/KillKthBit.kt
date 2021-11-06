class KillKthBit {
    fun killKthBit(n: Int, k: Int): Int {

        val nBinary = Integer.toBinaryString(n)
        if (k > nBinary.length)
            return n
        val result: String = StringBuilder(
            nBinary.slice(0 until nBinary.length-k)
                .plus("0")
                .plus(nBinary.slice(nBinary.length-k+1 until nBinary.length))).toString()
        return Integer.parseInt(result, 2)
    }
}