fun main(){
  var ans = 0L
  val (n,x) = readLine()!!.split(" ").map{it.toLong()}
  val m = List(n.toInt()) { readLine()!!.toLong() }.sorted()
  ans += m.size
  val sum = m.sum()
  var r = x - sum
  for(i in 0 until m.size){
    val next = r/m[i]
    if(next == 0L){
      break
    }
    ans+=next
    r -= next*m[i]
  }
  println(ans)
}