fun main()
{
    var arr1 = arrayOf(10 , 6 , 8 , 90 , 35 , 60 , 23)
    var max = arr1[0]
    var len1 = arr1.size

    for (i in 1..<len1)
    {
        if (arr1[i] > max )
        {
            max = arr1[i]
        }
    }

    println("Max element is $max")
}