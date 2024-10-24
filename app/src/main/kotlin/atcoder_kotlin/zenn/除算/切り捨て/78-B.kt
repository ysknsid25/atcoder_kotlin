fun main(){
  val (x,y,z) = readLine()!!.split(" ").map{it.toLong()}
  val l = (x-z)/(y+z)
  println(l)
}