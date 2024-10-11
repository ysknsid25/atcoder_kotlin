fun main(){
  val coin = listOf(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800)
  var p = readLine()!!.toInt()
  var count = 0
  for (i in 9 downTo 0){
    var limit = 100
    while (p >= coin[i]){
      p -= coin[i]
      count++
      limit--
      if (limit == 0){
        break
      }
    }
  }
  println(count)
}