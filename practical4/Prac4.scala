class Prac4{
    protected var result:String=""    // cannot leave uninitialized?
    private val x:Int=0     
    private val y:Int=1 
    var a:Int=0     // a and b are public
    var b:Int=0
    def setResult={
        result = scala.io.StdIn.readLine()
    }
    def addMutable(n1:Int,n2:Int)={
        println("old a: "+a+", old b: "+b)
        a=n1
        b=n2
        println("new sum of a and b: "+(a+b))   // brackets around a and b necessary to perform add
    }
    def addImmutable:Int={
        return x+y      // x and y only accessible within class
    }
}

object RunPrac4 extends Prac4{
    def main(args:Array[String])={
        print("Enter some text: ")
        setResult
        println("var result set to: "+result)   // result is accessible here because object extends class
        addMutable(1,2)
        println("new a: "+a+", new b: "+b)    // a and b  are accessible here because they are public
        println("sum of x and y = "+addImmutable)
    }
}
