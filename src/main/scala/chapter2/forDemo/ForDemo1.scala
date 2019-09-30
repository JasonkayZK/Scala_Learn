package chapter2.forDemo

import java.io.File

/**
 * 枚举集合元素
 */
object ForDemo1 {

    def main(args: Array[String]): Unit = {
        val filesHere = new File(".").listFiles
        for (file <- filesHere) println(file)

        for (i <- 1 to 10) println("Iteration: " + i)
    }
}
