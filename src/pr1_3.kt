fun main()
{
        var studenten : String
        var studentnm : String
        var branch : String
        var Class : String
        var Batch : String
        var clg : String
        var univ  : String
        var age : Int

        print("student Enrollment No : ")
        studenten = readLine().toString()
        print("Student Name :")
        studentnm = readLine().toString()
        print("Branch Name :")
        branch = readLine().toString()
        print("student Class :")
        Class = readLine().toString()
        print("Student Batch :")
        Batch = readLine().toString()
        print("Student Colege Name :")
        clg = readLine().toString()
        print("Student University name :")
        univ = readLine().toString()
        print("Student age :")
        age = readln().toInt()


        println("**************")

        println("Student's Data")
        println("Student's Enrollment No : $studenten")
        println("Student's Name : $studentnm")
        println("Student's branch $branch" )
        println("Student's class $Class")
        println("Student's  Batch $Batch")
        println("Student's COlege Name : $clg")
        println("Students University name : $univ")
        println("students age : $age")


}