object Prac8{
    def compare(str1:String,str2:String)={
        val r:Int=str1.compareTo(str2)
        println(s"\n$str1 compared to $str2: $r")
    }

    def convert(str:String)={
        val r:String=str.toLowerCase()
        println(s"\n$str converted to lowercase: $r")
    }

    def find(str:String,ch:Char)={
        val r:Int=str.indexOf(ch)
        println(s"\nIndex of $ch in $str: $r")
    }

    def find(str:String,sub:String)={
        val r:Int=str.indexOf(sub)
        println(s"\nIndex of $sub in $str: $r")
    }

    def as_string(arr:Array[Char])={
        //arr.toString does not give correct output
        val r:String=arr.mkString   //no () without args, makes String from sequence
        println(s"\nChar array converted to String: $r")
    }

    def main(args:Array[String])={
        compare("ABC","ABC")    //task 1
        convert("HELLO")    //task 2
        //task 3
        print("Enter string: ")
        val str:String=io.StdIn.readLine()
        print(s"Enter char to find in $str: ")
        val ch:Char=io.StdIn.readChar()
        find(str,ch)
        //task 4
        print(s"Enter substring to find in $str: ")
        val sub:String=io.StdIn.readLine()
        find(str,sub)
        //task 5
        val arr:Array[Char]=Array('a','p','p','l','e')
        as_string(arr)
    }
}
