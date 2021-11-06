class OppositesAttract8kyu {
    fun loveFun(flowerA: Int, flowerB: Int): Boolean {
        if (kotlin.math.abs(flowerA - flowerB) %2 == 0)
            return false
        return true
    }
}