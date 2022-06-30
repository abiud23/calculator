class fruits{
    var type=""
    var colour=""
    var price=0

}
fun main(args: Array<String>) {
    val matunda = fruits()
    matunda.type = "watermelon"
    matunda.colour="green"
    matunda.price=500
    println(matunda.type)
    println(matunda.colour)
    println(matunda.price)

    matunda.type = "banana"
    matunda.colour="yellow"
    matunda.price=400
    println(matunda.type)
    println(matunda.colour)
    println(matunda.price)

    matunda.type = "pineapple"
    matunda.colour="blue"
    matunda.price=1000
    println(matunda.type)
    println(matunda.colour)
    println(matunda.price)

    matunda.type = "oranges"
    matunda.colour="Violet"
    matunda.price=900
    println(matunda.type)
    println(matunda.colour)
    println(matunda.price)

}