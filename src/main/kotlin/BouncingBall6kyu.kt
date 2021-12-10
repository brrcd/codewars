import java.lang.Math.log

class BouncingBall6kyu {

    fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
        var result = -1
        if (h > 0 &&
            0 < bounce &&
            bounce < 1 &&
            window < h
        ) {
            result = 0
            var height = h
            while (height > window){
                result++
                height *= bounce
                if(height > window)
                    result++
            }
        }

        return result
    }
}