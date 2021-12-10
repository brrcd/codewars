import java.math.BigInteger

fun main(args: Array<String>) {

    val bb = BouncingBall6kyu()

    val br = bb.bouncingBall(3.0, 0.66, 1.5)

    println(br)
    val bd = bb.bouncingBall(30.0, 0.66, 1.5)

    print(bd)
}
