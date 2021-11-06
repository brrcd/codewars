class AlphabetWar7kyu {
    fun alphabetWar(fight: String): String {
        val ls: Map<String, Int> = mapOf("w" to 4, "p" to 3, "b" to 2, "s" to 1)
        val rs: Map<String, Int> = mapOf("m" to 4, "q" to 3, "d" to 2, "z" to 1)
        var lss = 0
        var rss = 0
        for (i in fight.indices) {
            if (ls.containsKey(fight[i].toString()))
                lss += ls.getValue(fight[i].toString())
            else if (rs.containsKey(fight[i].toString()))
                rss += rs.getValue(fight[i].toString())
        }
        if (lss > rss)
            return "Left side wins!"
        else if (rss > lss)
            return "Right side wins!"
        return "Let's fight again!"
    }
}