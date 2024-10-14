fun main(){
  val n=readLine()!!.toInt()
  val l = n-1
  var ans = 1L
  for (i in 1..11){
    ans = ans * (l-i+1) / i
  }
  println(ans)
}