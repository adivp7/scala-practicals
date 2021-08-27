object Datatypes{
    def main(args:Array[String])={
        var byte:Byte=1
        var short:Short=1
        var int:Int=1
        var long:Long=1L    //L is not necessary if number within int range
        var float:Float=1.0f    //f is necesary otherwise type mismatch error
        var double:Double=1.0
        var char:Char='a'
        var string:String="hello"
        var boolean:Boolean=true
        var unit:Unit=()    // () is the only value for Unit
        var null_var:Null=null  // null is instance of type Null
        //var nothing:Nothing   // Nothing cannot be used as a val/var/return type except for exceptions
        var anyval:AnyVal=1     // AnyVal can hold any instantiable datatype value
        var anyref:AnyRef=null_var  // AnyRef can hold reference of any object
        println(byte)
        println(short)
        println(int)
        println(long)
        println(float)
        println(double)
        println(char)
        println(string)
        println(boolean)
        println(unit)
        println(null_var)
        println(anyval)
        println(anyref)
    }
}
