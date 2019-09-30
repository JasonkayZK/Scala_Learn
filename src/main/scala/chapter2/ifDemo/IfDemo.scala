package chapter2.ifDemo

object IfDemo {

    def main(args: Array[String]): Unit = {
        val fileName = if (!args.isEmpty) args(0) else "default.txt";
        println(fileName)
    }
}
