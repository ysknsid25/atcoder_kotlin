// 階乗
fun factorialMod(n: Int, mod: Int = 1_000_000_007): Long {
  var res = 1L
  for (i in 1..n) {
      res = (res * i) % mod
  }
  return res
}

fun main(){
  val n = readLine()!!.toInt()
  println(factorialMod(n))
}