fun main (){
  val (a, b) = readLine()!!.split(" ").map { it.toInt() }
  val c = a + b
  for (i in 0..10){
    if (c != i) {
      println(i)
      break
    }
  }
}