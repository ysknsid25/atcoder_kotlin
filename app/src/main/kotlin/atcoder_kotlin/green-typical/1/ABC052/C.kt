import kotlin.math.sqrt

fun pf(n: Int): List<Int> {
    val num = sqrt(n.toDouble()).toInt()
    var rem = n
    val p = mutableListOf<Int>()

    for (i in 2..num) {
        while (rem % i == 0) {
            rem /= i
            p.add(i)
        }
    }
    if (rem != 1) {
        p.add(rem)
    }
    return p
}

fun main() {
    val n = readLine()?.toIntOrNull() ?: return
    val res = IntArray(n + 1) { 1 }
    res[0] = 0
    var i = 1

    while (i <= n) {
        val nums = pf(i)
        for (num in nums) {
            res[num] += 1
        }
        i++
    }

    var ans = 1L
    val MOD = 1_000_000_007

    for (i in 1..n) {
        ans = (ans * res[i]) % MOD
    }

    println(ans)
}
