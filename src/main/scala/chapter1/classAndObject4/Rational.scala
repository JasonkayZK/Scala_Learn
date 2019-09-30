package chapter1.classAndObject4

class Rational(n: Int, d: Int) {
    require(d != 0)

    private val g = gcd(n.abs, d.abs)

    val number = n / g
    val demon = d / g

    override def toString: String = number + "/" + demon

    def add(rational: Rational) = {
        new Rational (number * rational.demon + rational.number * demon, demon * rational.demon)
    }

    def this(n : Int) = this(n, 1)

    private def gcd(a: Int, b: Int) :Int = {
        if (b == 0) a
        else gcd(b, a % b)
    }

}

object Rational {
    def main(args: Array[String]): Unit = {
        println(new Rational(66, 42))
    }
}
