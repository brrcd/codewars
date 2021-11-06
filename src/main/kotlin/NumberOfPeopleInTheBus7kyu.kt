class NumberOfPeopleInTheBus7kyu {

    fun people(busStops: Array<Pair<Int, Int>>) : Int {
        var result = 0

        busStops.forEach {
            result += it.first
            result -= it.second
        }

        return result
    }

}