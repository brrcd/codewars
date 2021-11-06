class NDCircularList<T>(vararg val elements: T) {

    init {
        if (elements.isEmpty())
            throw Exception()
    }

    private var isNextInvoked = false
    private var isPrevInvoked = false
    private var counter = 0

    fun next(): T {
        var res: T
        if (!isNextInvoked && !isPrevInvoked) {
            res = elements.first()

            counter++
        }
        else if (elements[counter] == elements.last()) {
            res = elements[counter]
            counter = 0
        } else if (isPrevInvoked) {
            if (counter + 2 >= elements.size - 1) {
                counter += 2
                res = elements[counter]
            } else {
                counter = 1
                res = elements[counter]
            }
        } else {
            res = elements[counter]
            counter++
        }
        isNextInvoked = true
        isPrevInvoked = false
        return res
    }

    fun prev(): T {
        var res: T

        if (!isNextInvoked && !isPrevInvoked) {
            res = elements.last()
            counter--
        } else if (elements[counter] == elements.first()) {
            res = elements[counter]
            counter = elements.size - 1
        } else if (isNextInvoked) {
            if (counter - elements.size - 1 >= 2) {
                counter -= 2
                res = elements[counter]
                counter--
            } else {
                counter = elements.size - 1
                res = elements[counter]
                counter--
            }
        } else {
            res = elements[counter]
            counter--
        }
        isPrevInvoked = true
        isNextInvoked = false
        return res
    }
}
