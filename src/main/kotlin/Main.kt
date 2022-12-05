fun main(args: Array<String>) {
   println("Enter a number: ")
    val input = readLine()?.toInt()
    if (input != null){
        if(input.isPrime()){
            println("$input is a prime number")
        }else{
            println("$input is not a prime number")
        }
    }
    val sum = alternatingSum(2,3,5,6,3,4,8,2,7,8,3,4,6)
    println("The alternating sum is $sum")
    val list = listOf(1,2,3,4,5,6,7)
    println("The product of $list is: ${list.product()}")
}
fun Int.isPrime(): Boolean {
    for(i in 2 until this -1){
        if (this % i == 0){
            return false
        }
    }
    return true
}
fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for(number in numbers){
        if (toggle){
            sum += number
        }else{
            sum -= number
        }
        toggle = ! toggle
    }
    return sum
}
fun List<Int>.product():Int {
    var result = 1
    for(value in this){
        result *= value
    }
    return  result
}