object Prac9{

    def init1()={
        //var z:Array[String]=new Array[String](3)
        //var z=new Array[String](3)
        /*
        z(0)="Zara"
        z(1)="Nuha"
        z(4/2)="Ayan"
        */
        var z=Array("Zara","Nuha","Ayan")
        println(s"Array: [${z.mkString(" ")}] of length: ${z.size}")
    }

    def init2()={
        var z = Array("Ayan","Zara","Ayan")
        /*
        z(0)=123 gives:
        z(0)=123
             ^
       error: type mismatch;
        found   : Int(123)
        required: String
        */
    }

    def init3()={
        var z=Array(123,123,123)
        /*
        z(0)="Aryan" gives:
        z(0)="Aryan"
             ^
       error: type mismatch;
        found   : String("Aryan")
        required: Int
        */
    }

    def init4()={
        val z = Array("Zara", "Nuha", "Ayan")
        z(0)="Zara"
        // z cannot be re-assigned but the Array elements are mutable
    }

    def init5()={
        val z1 = Array("Zara", "Nuha", "Ayan")
        val z2 = Array("Zara", "Nuha", "Ayan")
        /*
        z2=z1 gives:
        z2=z1
          ^
       error: reassignment to val
       */
        for(x<-z2)
            println(x)
    }

    def sort(arr:Array[Int])={
        val n=arr.size
        for(i<-0 until n-1)
        {
            var min=i
            for(j<-i+1 until n)
                if(arr(j)<arr(min))
                    min=j
            val t=arr(min)
            arr(min)=arr(i)
            arr(i)=t
        }
        println(s"Sorted Array: [${arr.mkString(" ")}]")
    }

    def rev2d(arr:Array[Array[Int]])={
        println()
        for(i<-Array.range(arr.size-1,-1,-1))
        {
            for(j<-Array.range(arr(i).size-1,-1,-1))
            {
                print(arr(i)(j))
                print(" ")
            }            
            println()
        }
    }

    def q7b(arr:Array[Array[Int]])={
        println()
        val n=arr(0).size-1
        for(i<-0 until arr.size)
        {
            for(j<-0 until arr(i).size)
            {
                print(arr(i)(n)/3)
                print(" ")
            }
            println()
        }
        println()
        for(i<-0 until arr.size)
        {
            for(j<-0 until arr(i).size)
                print(s"${i+1} ")
            println()
        }
    }

    def q8a(n:Int)={
        println()
        val arr=Array.ofDim[Char](n,n)
        for(i<-0 until n)
            for(j<-0 until n)
                if(j<=i)
                    arr(i)(j)='*'
                else
                    arr(i)(j)=' '
        for(i<-0 until n)
        {
            for(j<-0 until n)
                print(arr(i)(j))
            println()
        }
    }

    def q8b(n:Int)={
        println()
        val arr=Array.ofDim[Char](n,n)
        for(i<-0 until n)
            for(j<-0 until n)
                if(j>=i)
                    arr(i)(j)='*'
                else
                    arr(i)(j)=' '
        for(i<-0 until n)
                println(arr(i).mkString(""))
    }

    def q9(n:Int)={
        val arr=Array.range(1,20,3)
        println(s"\nArray: [${arr.mkString(" ")}]")
    }

    def q10(arr1:Array[Int],arr2:Array[Int])={
        println(s"\nArray 1: [${arr1.mkString(" ")}]")
        println(s"Array 2: [${arr2.mkString(" ")}]")
        println(s"Concatenated Array: [${Array.concat(arr1,arr2).mkString(" ")}]")
    }

    def main(args:Array[String])={
        init1()     //q1
        init2()     //q2
        init3()     //q3
        init4()     //q4
        init5()     //q5
        //q6
        print("\nEnter n: ")
        val n=io.StdIn.readInt()
        val arr=new Array[Int](n)
        println(s"Enter $n elements:-")
        for(i<-0 until arr.size)
            arr(i)=io.StdIn.readInt()
        sort(arr)
        //q7a
        val arr2=Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
        rev2d(arr2)
        q7b(arr2)
        q8a(4)
        q8b(4)
        q9(3)
        val a1=Array.range(1,5)
        val a2=Array.range(10,20,2)
        q10(a1,a2)
    }
}
