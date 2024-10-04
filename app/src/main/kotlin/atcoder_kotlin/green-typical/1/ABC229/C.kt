fun main(){
  var (n, w) = readLine()!!.split(" ").map { it.toInt() }
  val list = List(n) {readLine()!!.split(" ").map { it.toLong() }}.sortedByDescending { it[0] }

  var deli = 0L
  for (cheeze in list){
      val d = cheeze[0]
      var g = cheeze[1]
      while (g > 0){
          if(w==0){
              break
          }
          deli+=d
          g--
          w--
      }
      if(w==0){
          break
      }
  }
  println(deli) 
}