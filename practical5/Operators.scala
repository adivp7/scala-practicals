object Operators
{
    def arithmetic(a:Int,b:Int)={
        println("\na: "+a+", b: "+b)
        println(a+" + "+b+": "+(a+b))
        println(a+" - "+b+": "+(a-b))
        println(a+" x "+b+": "+(a*b))
        println(a+" / "+b+": "+(a/b))
        println(a+" mod "+b+": "+(a%b))
    }
    def relational(a:Int,b:Int)={
        println("\na: "+a+", b: "+b)
        println(a+" > "+b+": "+(a>b))
        println(a+" < "+b+": "+(a<b))
        println(a+" >= "+b+": "+(a>=b))
        println(a+" <= "+b+": "+(a<=b))
        println(a+" == "+b+": "+(a==b))
        println(a+" not = "+b+": "+(a!=b))
    }
    def logical(a:Boolean,b:Boolean)={
        println("\na: "+a+", b: "+b)
        println(a+" and "+b+": "+(a&&b))
        println(a+" or "+b+": "+(a||b))
        println("not a: "+(!a))
    }
    def bitwise(a:Int,b:Int)={
        println("\na: "+a+", b: "+b)
        println(a+" AND "+b+": "+(a&b))
        println(a+" OR "+b+": "+(a|b))
        println(a+" XOR "+b+": "+(a^b))
        println("1's complement("+a+"): "+(~a))
        println(a+" (Arithmetic)Rsh "+b+": "+(a>>b)) // preserves sign bit
        println(a+" (Logical)Rsh "+b+": "+(a>>>b))   // always fills with 0
        println(a+" Lsh "+b+": "+(a<<b))
    }
    def assignment(x:Int,y:Int,z:Boolean,w:Boolean)={
        // operator should be binary
        // LHS should be assignable
        // RHS should evaluate to same type as LHS
        var a=x; var b=y
        println("\na: "+a+", b: "+b)
        println("a <- "+a+" + "+b)
        a+=b
        println("a: "+a)
        println("a <- "+a+" - "+b)
        a-=b
        println("a: "+a)
        println("a <- "+a+" x "+b)
        a*=b
        println("a: "+a)
        println("a <- "+a+" / "+b)
        a/=b
        println("a: "+a)
        println("a <- "+a+" mod "+b)
        a%=b
        println("a: "+a)
        println("a <- "+a+" AND "+b)
        a&=b
        println("a: "+a)
        println("a <- "+a+" OR "+b)
        a|=b
        println("a: "+a)
        println("a <- "+a+" XOR "+b)
        a^=b
        println("a: "+a)
        println("a <- "+a+" Lsh "+b)
        a<<=b
        println("a: "+a)
        println("a <- "+a+" (Arithmetic)Rsh "+b)
        a>>=b
        println("a: "+a)
        println("a <- "+a+" (Logical)Rsh "+b)
        a>>>=b
        println("a: "+a)
        var c=z; var d=w; 
        println("c: "+c+", d: "+d)
        println("c <- "+c+" and "+d)
        c&&=d
        println("c: "+c)
        println("c <- "+c+" or "+d)
        c||=d
        println("c: "+c)
    }
    def main(args:Array[String])={
        arithmetic(4,3)
        relational(5,7)
        bitwise(5,3)
        logical(true,false)
        assignment(5,2,true,false)
    }
}
