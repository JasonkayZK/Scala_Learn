package chapter2.forDemo

import java.io.File

import scala.io.Source

object ForDemo3 {

    val filesHere = new File(".").listFiles

    def fileLines (file : File): List[String] = Source.fromFile(file).getLines().toList

    def grep(pattern: String) =


    def main(args: Array[String]): Unit = {

    }
}
