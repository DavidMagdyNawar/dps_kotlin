fun main(args: Array<String>) {

var nonNullableString :String = "DPS"
//    nonNullableString = null
println(nonNullableString)

    var nullableString :String? = "Kotlin"
    nullableString = null
    println(nullableString)


    val length = nonNullableString.length
    println(length)

    // nullability check
    var nullLength =  if (nullableString!= null) nullableString.length else -1
    println(nullLength)


    //use let after checking the value of the item, if it's not null print it otherwise skip
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", "React")
    for (item in listWithNulls) {
        item?.let { println(it) } // prints every item and ignores null
    }

    //Elvis operator
     nullLength =  nullableString?.length?: -1
    println(nullLength)

    //!! operator used to convert any value to a non-null type and throw exception if the value is null
    val l = nullableString!!.length
    println(l)

}
