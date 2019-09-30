package chapter1.classAndObject3

class Rational(n: Int, d: Int) {
    require(d != 0)

    override def toString = n + "/" + d
}

object Rational {
    def main(args: Array[String]): Unit = {
        println(new Rational(1, 0))
    }
}