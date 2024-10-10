fun main(){
  val (a, b) = readLine()!!.split(" ").map { it.toInt() }
  if (a + b >= 10){
    println("error")
  } else {
    println(a + b)
  }
}