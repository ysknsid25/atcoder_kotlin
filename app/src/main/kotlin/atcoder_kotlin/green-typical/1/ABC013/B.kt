fun main() {
  var a = readLine()!!.toInt()
  var b = readLine()!!.toInt()
  val c = Math.abs(a - b)
  if (a > b) {
    b+=10
  } else {
    a+=10
  }
  val d = Math.abs(a - b)
  if (c > d) {
    println(d)
  } else {
    println(c)
  }
}