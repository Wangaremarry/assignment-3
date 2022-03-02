fun main(){
    var name="AkiraChix"
    var y=name[0].toString()+name[2]+name[3]
    println(y)
    var statement=sentence("Mary",24)
    println (statement)
    var k=name("susan")
    println(k.length)
    var f=identify("Mellisa")

}
fun sentence(x:String, y:Int):String{
    var statement=("Hi, my name is $x and i am $y years old")
    return statement
}
fun name(text:String):String{
    var k=("susan")
     return k
}
fun identify(text:String){
    if(text== "Mellisa")
        println("That's me")
    else
        println("I don't know who that is")

}

