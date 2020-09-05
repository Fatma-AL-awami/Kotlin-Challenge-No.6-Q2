interface MyInterface {
    val test: Int

    fun foo() : String

    fun hello() {
        println("Hello there, pal!")
    }
}

interface MyInterfacetwo {

    fun goodby() ;
}
class InterfaceImp : MyInterface ,MyInterfacetwo{
    override val test: Int = 25
    override fun foo() = "Lol"
    override fun goodby() {
        println("goodby there, pal!")
    }

}
fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("test = ${obj.test}")
    print("Calling hello(): ")
    obj.hello()
    print("Calling goodby(): ")
    obj.goodby()
    print("Calling and printing foo(): ")
    println(obj.foo())
}