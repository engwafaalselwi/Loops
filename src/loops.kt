
fun main (){
    val StudentsName = listOf("Ali" , "Wafaa","Ahmed")

    for((index,value) in StudentsName.withIndex())
    {
        println("$index , $value")
    }
}