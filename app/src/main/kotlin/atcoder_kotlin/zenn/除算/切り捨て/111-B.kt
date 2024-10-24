fun main(){
  val n = readLine()!!.toInt()
  val div = n/111
  if(n%111==0) println(n)
  else println((div+1)*111)
}