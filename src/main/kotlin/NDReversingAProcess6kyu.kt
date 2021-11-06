
import java.math.BigInteger

class NDReversingAProcess6kyu {

    fun decode(r: String): String {
        val letterSet = ("abcdefghijklmnopqrstuvwxyz").map { it.toString() }
        val map: Map<String, Int> = letterSet.mapIndexed {index: Int, s: String -> s to index }.toMap()

        var edge = 0

        for (i in r.indices){
            if (r[i].toString().toIntOrNull() == null){
                edge = i
                break
            }
        }

        val number = r.substring(0, edge).toBigInteger()
        val string = r.substring(edge, r.length).toCharArray()
        var result = ""
        val twentySix = BigInteger.valueOf(26)

        for (i in string.indices){
            var x = map[string[i].toString()]?.toBigInteger()
            if (x != null) {
                x *= number
                x = number % twentySix
            }
            val letter: String = map.keys.first { x?.toInt() == map[it] }
            result += letter
        }

        return result
    }

}