fun main(){
  val (a,b,c,d) = readLine()!!.split(" ").map{it.toInt()}
  val takahashi = b.toDouble() / a
  val aoki = d.toDouble() / c
  if(takahashi > aoki){
    println("TAKAHASHI")
  }else if(takahashi < aoki){
    println("AOKI")
  }else{
    println("DRAW")
  }
}