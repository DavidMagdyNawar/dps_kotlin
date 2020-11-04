fun main(args: Array<String>) {
    var a = 2
    println(someMethod(a, {println("Just some dummy function")}))
}
// using inline keyword reduces memory call overhead
inline fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}