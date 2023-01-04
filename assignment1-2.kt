fun main(){
    println(false && false) //false
    println(10%3) //1
    println(5>=5) //true
    println(false || true) //true
    println(5-3*2) //-1
    println(3!=2) //true
    println((6+6)/3) //4

    for (i in 0..100){
        if (i == 71){
            println("ITS OVER 70!!!! ")
            break
        }else println(i)
    }
    var temp = 35
    while (temp > 10){
        when(temp) {
            30 -> println("Its Hot")
            20 -> println("Its Comfy")
            15 -> println("Its Cold!!!!!")
            else -> println(temp)

        }
    }
}