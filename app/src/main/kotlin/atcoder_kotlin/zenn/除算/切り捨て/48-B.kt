// Long同士で割り算すると、Kotlinでは自動的に小数点以下を切り捨ててくれる
// println(9/2) = 4
// 0を含む場合、0自身を足してあげないといけない 
// 1の場合、bでxを割ったのがそのまま答え
fun main(){
  val (a,b,x) = readLine()!!.split(" ").map{it.toLong()}
  val ans = b/x - if(a==0L){
    -1L
  }else if(a-1L>0L){
    (a-1L)/x
  }else{
    0L
  }
  println(ans)
}