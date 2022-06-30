class wanafunzi(var name:String,var gender:String,var phone:String){

}
fun main(args: Array<String>){
    var obj=wanafunzi("Abiud","male", phone ="0791000007")
    println("The students name is" +obj.name)
    println("The gender is" +obj.gender)
    println("The students mobile number is" +obj.phone)
}
