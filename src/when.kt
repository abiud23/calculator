fun main() {
    var cars = "Subaru"

    when (cars) {
        "Nissan" -> println("My car is Nissan")
        "Subaru" -> println("My car is Subaru")
        "Toyota" -> println("My car is Toyota")
        "Hyundai" -> println("My car is Hyundai")
        "Mercedes" -> println("My car is Mercedes")
        "BMW" -> println("My car is BMW")
        else -> println("Invalid input")
    }
    for (n in 1..5) {
        println("break, Loop: $n")
        if (n == 5) {
            println("End of loop")
            break
        }
        for (n in 1..5) {
            println("before continue, Loop: $n")
            if (n == 0|| n == 0)
                continue

            println("after continue, Loop: $n")

        }
    }
}

