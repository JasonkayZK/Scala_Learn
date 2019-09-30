package chapter2.whileDemo

object WhileDemo {

    // while
    def gcdLoop(x : Long, y: Long) : Long = {
        var a = x
        var b = y
        while (a != 0) {
            var temp = a
            a = b % a
            b = temp
        }
        b
    }

    /**
     * 正因为 While 循环没有值，因此在纯函数化编程中应该避免使用 while 循环，
     *
     * Scala 保留的 While 循环是因为在某些时候使用循环代码比较容易理解，而如果使用纯函数化编程时，
     *
     * 需要执行一些重复运行的代码，通常就需要使用回溯函数来实现，回溯函数通常看起来不是很直观。
     */
    @scala.annotation.tailrec
    def gcd(x: Long, y: Long) : Long = {
         if (y == 0) x else gcd(y, x % y)
     }

    // do-while
    def doWhile(): Unit = {
        var line = ""
        do {
            line = readline()
            println("Read: " + line)
        } while (line != "")
    }


    def main(args: Array[String]): Unit = {
        println(gcdLoop(1355, 2525))

        // 可以看到（或者看到警告） greet()的返回值和()比较结果为 true
        println(greet() == ())

        // 意思 Unit（赋值语句返回值）和 String 做不等比较永远为 true。什么的代码会是一个死循环!
//        var line = readline()
//        while((line=readline()) != "")
//            println("Read: " + line)

        println(gcd(123523, 3214))
    }

    def readline(): String = ""

    def greet() {println("hi")}
}
