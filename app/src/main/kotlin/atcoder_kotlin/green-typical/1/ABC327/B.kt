fun main(){
  val b=readLine()!!.toLong()
  for(a in 1..20){
    var aa = a.toLong()
    for (c in 2..a){
      aa *= a
    }
    if(b==aa.toLong()){
      println(a)
      return
    }
  } 
  println(-1)
}