fun main(args: Array<String>) {

var nonNullableString :String = "DPS"
//    nonNullableString = null
println(nonNullableString)

    var nullableString :String? = "Kotlin"
    nullableString = null
    println(nullableString)


    val length = nonNullableString.length
    println(length)

    val nullLength =  nullableString?.length
    println(nullLength)

}
