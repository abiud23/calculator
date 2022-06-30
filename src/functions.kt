fun calculate(){
    var num1=100
    var num2=10
    println("The sum of $num1 and $num2 is" +(num1+num2))
    println("The product of $num1 and $num2 is" +(num1*num2))
    println("The diffrence of $num1 and $num2 is" +(num1-num2))
    println("The quotient of $num1 and $num2 is" +(num1/num2))
}
fun main(args:Array<String>) {
    calculate()
    jina()
    cars(name ="Subaru", Colour ="Red", year ="2022")
    cars(name = "Mercedes", Colour = "Blue", year = "2003")
}
fun jina(){
  println("My name is Stivo Simpo Boy")
}
fun cars(name: String, Colour: String, year: String){
    print("The name of the car is $name, it's colour is $Colour and a $year new model from Japan.")

}