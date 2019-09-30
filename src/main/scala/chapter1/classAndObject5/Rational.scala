package chapter1.classAndObject5

class Rational(n: Int, d: Int) {
    def +(value: Int) : Rational = this.+(new Rational(value))

    require(d != 0)

    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    override def toString: String = numer + "/" + denom

    def +(that:Rational) = new Rational(numer * that.denom + that.numer* denom, denom * that.denom)

    def *(that:Rational) = new Rational(numer * that.numer, denom * that.denom)

    def this(n : Int) = this(n, 1)

    @scala.annotation.tailrec
    private def gcd(a: Int, b: Int) : Int = {
        if (b == 0) a
        else gcd(b, a % b)
    }

    implicit def intToRational(x : Int): Rational = new Rational(x)
}

object Rational {
    def main(args: Array[String]): Unit = {
        val x = new Rational(1, 2)
        val y = new Rational(2, 3)
        println(x + y)
        println(x + x * y)
//        println(x + new Rational(3))

        println(x + 3)
    }
}
