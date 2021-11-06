class ParseNiceIntFromCharProblem8kyu {
    fun getAge(yearsOld: String): Int {
        return Integer.parseInt(yearsOld.split(" ")[0])
    }
}