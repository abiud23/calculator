class hesabu {
    //data member
    var num1:Int=67
    var num2:Int=98

    fun arithmetic():Int{
        return num1+num2

    }
}
fun main(args: Array<String>){
    // creating object
    val myobj=hesabu()
    println(myobj.arithmetic())
}