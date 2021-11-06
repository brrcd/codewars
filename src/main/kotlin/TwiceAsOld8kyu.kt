import kotlin.math.abs

class TwiceAsOld8kyu {
    fun twiceAsOld(dYears: Int, sYears: Int): Int {
        return abs(dYears - sYears*2)
    }
}