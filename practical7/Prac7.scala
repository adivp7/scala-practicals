import util.control.Breaks._

object Prac7
{
    def min_max_1(a:Int,b:Int)={   
        def max(a:Int,b:Int):Int={   // single nested function
            if(a>b)
                return a
            else
                return b
        }
        def min(a:Int,b:Int):Int={
            if(a<b)
                return a
            else
                return b
        }
        println("Max: "+max(a,b))
        println("Min: "+min(a,b))
    }

    def min_max_2(a:Int,b:Int)={
        def min_max(a:Int,b:Int)={
            def max(a:Int,b:Int):Int={   // multi nested function
                if(a>b)
                    return a
                else
                    return b
            }
            def min(a:Int,b:Int):Int={
                if(a<b)
                    return a
                else
                    return b
            }
            println("Max: "+max(a,b))
            println("Min: "+min(a,b))
        }
        min_max(a,b)
    }

    def is3(n:Int):Boolean={
        breakable{
            if(n!=3)
                break()
            return true
        }
        return false
    }

    def min_element(arr:Array[Int])={
        for(x<-arr)
            breakable{
                for(y<-arr)
                    if(x>y)
                        break()
                println(x)
            }
    }

    def main(args:Array[String])={
        println("Enter 2 numbers to compare:-")
        print("Enter a: ")
        var a=io.StdIn.readInt()
        print("Enter b: ")
        var b=io.StdIn.readInt()
        min_max_1(a,b)  //q1
        min_max_2(a,b)  //q2
        //q3: entry/exit control loop
        print("\nEnter a number: ")
        var c=io.StdIn.readInt()
        if(is3(c)) //q4
            println("The entered number was 3")
        else
            println("The entered number was not 3")
        print("\nMin element in array of (1,2,3,4,5,0): ")
        min_element(Array(1,2,3,4,5,0)) //q5
    }
}
