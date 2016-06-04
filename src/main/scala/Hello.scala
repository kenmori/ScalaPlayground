object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, moria!!!!!")
    def bark():Unit = println("bow");
    bark
    
    var x = 0
    if (x == 0) println("Zero") else println("Other")

    //2行
    if(x == 0)
     println("Zero") else println("Other")
    
    //
    def abs(x: Int):Int = {if (x > 0) x else -1 * x}
    var v1 = abs(10)
    var v2 = abs(-5)

    
    for(i <- 0 to 2){
        println(i)
    }
    
    val names = Array("Pochi", "Kenta", "Hachi-lo")
    for ( name <- names ) yield {
        println(name)
        name
    }
    (1 to 5)
  }
}
