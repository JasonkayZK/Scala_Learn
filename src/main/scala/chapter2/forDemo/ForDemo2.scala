package chapter2.forDemo

import java.io.File

/**
 * 过滤
 */
object ForDemo2 {

    def main(args: Array[String]): Unit = {
        // 改成只列出 .scala 文件
        val filesHere = new File(".").listFiles
        for (file <- filesHere
             if file.isFile
             if file.getName.endsWith(".scala")
             ) println(file)
    }
}
