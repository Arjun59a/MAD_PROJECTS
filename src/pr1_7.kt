fun main()
{
    print("Enter the number for finding the Factorial")
    val fact = readln().toInt()
    if (fact > 0)
    {
        print("The factorial of ${factorial(fact)}")
    }
    else
    {
        println("We can not find out the factorial of negatice numbers ")
    }
}

fun factorial(num1:Int) : Int{
    if (num1 == 1)
    {
        return 1
    }
        return num1*factorial(num1-1)
}