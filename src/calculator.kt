fun main(args:Array<String>) {
    print("Type your first number: ")
    var num1 = Integer.valueOf(readLine())
    print("Type your second number:  ")
    var num2 = Integer.valueOf(readLine())
    println(num1)
    println(num2)
    print("Enter operator (+,-,*,/): ")
    var opr = readLine()
    val op:Int=if (opr== "+"){
        num1+num2
    }else if (opr=="*"){
        num1*num2
        num1/num2
    }else if (opr== "-"){
        num1-num2
    }else{
        0}
    println("$op")
}

private operator fun String?.times(num2: String?) {

}


private operator fun String?.div(num2: String?) {

}

private operator fun String?.minus(num2: String?) {

}
