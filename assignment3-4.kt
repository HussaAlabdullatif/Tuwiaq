import kotlin.random.Random
//array
fun main(){
    var NumAvr = arrayListOf<Double>()
    for (i in 1..5) NumAvr.add(Random.nextDouble())
    println(NumAvr.average())


    var average = 0.0
    for (i in NumAvr) average+=i
    println(average/NumAvr.size)

    //function
    math(number1 = 5.5 , number2 = 3.3)
    math(number1 = 5.5 , number2 = 3.3, operatior = "-")
    math(number1 = 5.5 , number2 = 3.3 , operatior = "*")
    math(number1 = 5.5 , number2 = 3.3 , operatior = "/")


fun math(number1 : Double , number2 : Double , operatior : String="+"){
    when (operatior){
        "+"-> println(number1 + number2)
        "-"-> println(number1 - number2)
        "*"-> println(number1 * number2)
        "/"-> println(number1 / number2)
        else -> println("go away")



    }


}
}