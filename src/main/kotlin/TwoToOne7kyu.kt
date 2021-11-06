class TwoToOne7kyu {

    fun longest(s1: String, s2: String): String {
        val string = (s1+s2).split("")
        val result = mutableListOf<String>()
        for (char in string){
            if (!result.contains(char))
                result.add(char)
        }
        result.sort()
        return result.joinToString("")
    }

}