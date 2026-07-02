fun main()
{
    print("Enter the number 1")
    var num1 = readln().toInt()
    print("Enter the Number 2")
    var num2 = readln().toInt()
    println(add(num1,num2))
    println(sub(num1,num2))
    println(mul(num1,num2))

    if (num2 != 0)
    {
        println(div(num1,num2))
    }


}

fun add(num1:Int,num2:Int):Int
{
    return num1+num2
}
fun sub(num1:Int,num2 : Int) : Int
{
    return num1 - num2
}
fun mul(num1 : Int , num2: Int) : Int
{
    return num1*num2
}
fun div(num1:Int,num2:Int) : Int
{
        return num1/num2
}

