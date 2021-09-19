class Student(m:Int)
{
    private var studmarks:Int=m
    def getMarks():Int={
        return this.studmarks
    }
    def setMarks(m:Int)={
        this.studmarks=m
    }
}

object Prac6
{
    def powers(x:Double)={
        for(p<-2 to 4)
        {
            var r:Double=x
            for(i<-2 to p)
                r=r*x
            println(s"$x raised to the power of $p: $r")
        }
    }

    def isprime(x:Int):Boolean={
        if(x<2)
            return false
        var i=2
        while(i*i<=x)
        {
            if(x%i==0)
                return false
            i+=1
        }
        return true
    }
    
    def main(args:Array[String])={
        //question 1
        print("\nInput number to show powers of: ")
        var a=scala.io.StdIn.readDouble()
        powers(a)

        //question 2
        print("\nInput number to check whether it is prime: ")
        var b=scala.io.StdIn.readInt()
        if(isprime(b))
            println(s"$b is prime")
        else
            println(s"$b is not prime")
        
        //question 3
        var s1=new Student(75)
        if(s1.getMarks()>65)
        {
            s1.setMarks(s1.getMarks()+20)
            println("\nStudent passed the exam with distinction")
        }
    }
}
