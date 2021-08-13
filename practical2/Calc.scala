object Calc{
    def sum(a:Int,b:Int)=a+b
    def diff(a:Int,b:Int)=a-b
    def prod(a:Int,b:Int)=a*b
    def div(a:Int,b:Int)=a/b
    def main(args:Array[String])={
        val a=7
        val b=5
        println("a: "+a)
        println("b: "+b)
        println("a+b: "+sum(a,b))
        println("a-b: "+diff(a,b))
        println("a*b: "+prod(a,b))
        println("a/b: "+div(a,b))
    }
}
