fun main()
{
    var arr1 = arrayOf<Int>(150,90,400,80,100)
    println(arr1.joinToString())
    val a2 = Array<Int>(5){0}
    println(a2.joinToString())
    val a3 = Array<Int>(5){i -> i*i}//Here the i is the indexing of the array
    println(a3.joinToString())

    var arr3d = Array(4){Array(4){i -> i *i} }
    println(arr3d.contentDeepToString())

    var emptarr = emptyArray<Int>()
    println("enter the element of the array")
    for (i in 0..10)
    {
        print("Arr[$i] :")
        var temp = readln().toInt()
        emptarr += temp
    }

    println(emptarr.joinToString())
    var len1 = emptarr.size
    for (i in 0..<len1)
    {
        for (j in i+1..<len1)
        {
            if (emptarr[i] > emptarr[j])
            {
                var t = emptarr[i]
                emptarr[i] = emptarr[j]
                emptarr[j] = t
            }
        }
    }

    println("Array is sorted without built in function ${emptarr.joinToString ()}")
    arr1.sort()
    println("Array is sorted with the use of the builtin function ${arr1.joinToString()} ")





}