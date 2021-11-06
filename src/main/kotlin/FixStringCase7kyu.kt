import java.util.*

class FixStringCase7kyu {

    fun solve(s: String): String {
        var upCase = 0
        var loCase = 0
        s.forEach {
            if (it.isUpperCase()) upCase++
            else loCase++
        }
        if (upCase > loCase) return s.uppercase()
        else return s.lowercase()
    }

}