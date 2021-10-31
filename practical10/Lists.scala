object Lists{
    def init()={
        val l1:List[Int]=List(1,2,3,4)
        val l2="Apple"::"Banana"::"Cherry"::Nil //:: is right-associative
        // similar to "Apple"::("Banana"::("Cherry"::Nil)))
        println(l1) //unlike arrays we can print lists
        println(l2)
    }

    def disp(l:List[Int])={    //List requires type parameters
        print("\nList elements: ")
        for(a<-l)
            print(s"$a ")
        println()
    }
    
    def check(l:List[String])={
        println(s"\nList: $l")
        println(s"Head: ${l.head}")
        println(s"Tail: ${l.tail}")    //returns a list consisting of all elements except the first
        println(s"isEmpty: ${l.isEmpty}")
    }

    def addLists(l1:List[Int],l2:List[Int])={
        println(s"\nL1: $l1")
        println(s"L2: $l2")
        println("L1+L2:-")
        println(List.concat(l1,l2))
        println(l1:::l2)
        println(l1.:::(l2))
    }

    def uniform()={
        val l1=List.fill(5)("apple")
        println(s"\n$l1")
    }

    def addtwo(l1:List[Int],l2:List[Int])={
        println(s"\nL1: $l1")
        println(s"L2: $l2")
        println(s"L1+L2: ${l1:::l2}")
    }

    def main(args:Array[String])={
        init()  //q1
        val l1=List.tabulate(10)(x=>x)
        disp(l1)  //q2
        val l2=List("One","Two","Three")
        check(l2) //q3
        val l3=List(1,2,3,4,5)
        val l4=List(0,1,2,3,4)
        addLists(l3,l4) //q4
        uniform()   //q5
        val l5=List.fill(5)(1)
        val l6=List(0,1,2,3,4)
        addtwo(l5,l6)   //q6
    }
}
