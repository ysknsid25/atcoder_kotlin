import kotlin.math.*
import kotlin.collections.*
import kotlin.comparisons.reverseOrder

class Common{
    // 文字列を受け取る場合
    fun readString(): String = readLine()!!

    // 整数を受け取る場合
    fun readInt(): Int = readLine()!!.toInt()

    // 小数を受け取る場合
    fun readFloat(): Float = readLine()!!.toFloat()

    // 文字列を2つ受け取る場合
    fun readTwoStrings(): Pair<String, String> {
        val (A, B) = readLine()!!.split(" ")
        return Pair(A, B)
    }

    // 整数を3つ受け取る場合
    fun readThreeInts(): Triple<Int, Int, Int> {
        val (X, Y, Z) = readLine()!!.split(" ").map { it.toInt() }
        return Triple(X, Y, Z)
    }

    // 小数を3つ受け取る場合
    fun readThreeFloats(): Triple<Float, Float, Float> {
        val (H, M, S) = readLine()!!.split(" ").map { it.toFloat() }
        return Triple(H, M, S)
    }

    // 文字列のリストを受け取る場合
    fun readStringList(): List<String> = readLine()!!.split(" ")

    // 整数列を受け取る場合
    fun readIntList(): List<Int> = readLine()!!.split(" ").map { it.toInt() }

    // 小数列を受け取る場合
    fun readFloatList(): List<Float> = readLine()!!.split(" ").map { it.toFloat() }

    // 複数行の文字列を受け取る場合
    fun readMultipleLinesStrings(n: Int): List<List<String>> =
        List(n) { readLine()!!.split(" ") }


    // 複数行の整数列を受け取る場合
    fun readMultipleLinesInts(n: Int): List<List<Int>> =
        List(n) { readLine()!!.split(" ").map { it.toInt() } }

    // 複数行の小数列を受け取る場合
    fun readMultipleLinesFloats(n: Int): List<List<Float>> =
        List(n) { readLine()!!.split(" ").map { it.toFloat() } }

    // 配列の初期化
    val mulTbl: List<List<Int>> = List(4) { y -> List(3) { x -> (x + 1) * (y + 1) } } // 1~3, 1~4

    // 整数配列の生成
    fun generateIntList(m: Int): List<Int> = (0..m).toList()

    // 文字列を配列に変換
    fun stringToList(testStr: String): List<Char> = testStr.toList()

    // 配列の長さ
    fun getArrayLength(arr: List<Any>): Int = arr.size

    // マップにすでにキーがあるか確認する
    fun hasKey(d: Map<String, Any>, key: String): Boolean = d.containsKey(key)

    // マップにすでに値があるか確認する
    fun hasValue(d: Map<String, Any>, value: Any): Boolean = d.containsValue(value)

    // [s[i], t[i]]の配列の要素を順にSに取り出してループさせる
    fun loopOverPairs(s: List<Any>, t: List<Any>) {
        for (S in listOf(s, t).flatten()) {
            println(S)
        }
    }

    // 配列の要素の追加
    fun <T> appendElement(arr: MutableList<T>, element: T) {
        arr.add(element)
    }

    // 指定した位置の配列の要素を削除し、値を取得する
    fun <T> removeElementAt(arr: MutableList<T>, index: Int): T = arr.removeAt(index)

    // 指定した値が配列のどのインデックスにあるかを検索
    // 配列に含まれているか？を調べてからでないと、.indexOfは-1を返す
    fun findIndex(mylist: List<Int>, value: Int): Int {
        return if (mylist.contains(value)) mylist.indexOf(value) else -1
    }

    // 文字列型への変換
    fun toStringConversion(notExistX: Any): String = notExistX.toString()

    // 辞書をループで回す
    fun loopDictionaryKeys(d: Map<String, Any>) {
        for (k in d.keys) {
            println(k)
        }
    }

    fun loopDictionaryValues(d: Map<String, Any>) {
        for (v in d.values) {
            println(v)
        }
    }

    fun loopDictionaryEntries(d: Map<String, Any>) {
        for ((k, v) in d) {
            println("$k: $v")
        }
    }

    // 平方根の計算
    fun calculateSqrt(x: Double): Double = sqrt(x)

    // 辞書の初期化
    fun initializeMap(): MutableMap<String, Int> = mutableMapOf("app" to 1, "pen" to 2)

    // 配列の要素に含まれる値の個数をカウントする
    fun countOccurrences(arr: List<String>, search: String): Int = arr.count { it == search }

    // 文字列のtrim（Kotlinではsubstringを使用）
    fun trimString(str: String): Triple<String, String, String> {
        val result1 = str.substring(0, 1)    // h
        val result2 = str.substring(0, 1)    // h
        val result3 = str.substring(str.length - 1) // e
        return Triple(result1, result2, result3)
    }

    // 配列のソート
    fun sortArray(arr: MutableList<String>) {
        arr.sort()
    }

    // 配列の降順ソート
    fun sortArrayDescending(arr: MutableList<String>) {
        arr.sortedByDescending{it}
    }

    // 配列から文字列を生成
    fun joinStrings(A: List<String>): String = A.joinToString("")

    // mapをキーで昇順ソート
    fun sortMapByKeyAsc(dic: Map<String, Int>): Map<String, Int> = dic.toSortedMap()

    // mapをキーで降順ソート
    fun sortMapByKeyDesc(dic: Map<String, Int>): List<Pair<String, Int>> =
        dic.toList().sortedByDescending { it.first }

    // mapをvalueで昇順ソート
    fun sortMapByValueAsc(dic: Map<String, Int>): List<Pair<String, Int>> =
        dic.toList().sortedBy { it.second }

    // mapをvalueで降順ソート
    fun sortMapByValueDesc(dic: Map<String, Int>): List<Pair<String, Int>> =
        dic.toList().sortedByDescending { it.second }

    // 進数変換
    fun base10ToN(n: Int, b: Int): String {
        return if (n / b != 0) base10ToN(n / b, b) + (n % b).toString() else (n % b).toString()
    }

    // 素因数分解
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

    // 最小公倍数
    fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)

    // 最大公約数
    fun gcd(x: Int, y: Int): Int {
        return if (y == 0) x else gcd(y, x % y)
    }

    /**
     * Union Find
     */
    class UnionFind(val n: Int) {
        private val parentSize = IntArray(n) { -1 }

        /**
         * リーダーが同じなら何もしない
         * リーダーが違う場合、グループの人数が少ない方を、大きい方のグループへ統合する
         */
        fun merge(a: Int, b: Int) {
            var x = leader(a)
            var y = leader(b)
            if (x == y) return
            if (abs(parentSize[x]) < abs(parentSize[y])) {
                val temp = x
                x = y
                y = temp
            }
            parentSize[x] += parentSize[y]
            parentSize[y] = x
        }

        fun same(a: Int, b: Int): Boolean = leader(a) == leader(b)

        /**
         * 再帰で根にいるリーダーを探しに行く
         * 自分自身がリーダーなら自分を返す
         */
        fun leader(a: Int): Int {
            return if (parentSize[a] < 0) {
                a
            } else {
                parentSize[a] = leader(parentSize[a])
                parentSize[a]
            }
        }

        /**
         * aが所属するグループのサイズ(人数)を返す
         */
        fun size(a: Int): Int = abs(parentSize[leader(a)])

        fun groups(): List<List<Int>> {
            val result = MutableList(n) { mutableListOf<Int>() }
            for (i in 0 until n) {
                result[leader(i)].add(i)
            }
            return result.filter { it.isNotEmpty() }
        }
    }

    // 素因数分解（別バージョン）
    fun primeFactorize(N: Int): List<Int> {
        if (N == 1) return listOf(1)
        val primeList = mutableListOf<Int>()
        var num = N
        var i = 2
        while (i * i <= num) {
            if (num % i == 0) {
                primeList.add(i)
                num /= i
            } else {
                i += 1
            }
        }
        if (num != 1) {
            primeList.add(num)
        }
        return primeList
    }

    // 文字列を反転させる
    fun reverseString(ans: String): String = ans.reversed()

    // 組み合わせ割算のための関数
    fun nCrMod(n: Int, r: Int, mod: Int = 1_000_000_007): Int {
        var nu = 1L
        for (i in (n - r + 1)..n) {
            nu = (nu * i) % mod
        }
        var de = 1L
        for (i in 1..r) {
            de = (de * i) % mod
        }
        val deInv = de.modInverse(mod)
        return ((nu * deInv) % mod).toInt()
    }

    // 拡張関数で逆元を計算
    fun Long.modInverse(mod: Int): Long {
        var a = this
        var m = mod.toLong()
        var m0 = m
        var y = 0L
        var x = 1L

        if (m == 1L) return 0

        while (a > 1) {
            val q = a / m
            var t = m

            m = a % m
            a = t
            t = y

            y = x - q * y
            x = t
        }

        if (x < 0) x += m0
        return x
    }

    // 深さ優先探索(DFS)
    fun dfs(seen: MutableList<Boolean>, g: List<List<Int>>, v: Int): MutableList<Boolean> {
        seen[v] = true
        for (to in g[v]) {
            if (seen[to]) continue
            dfs(seen, g, to)
        }
        return seen
    }

    // 尺取法
    /**
     * 「条件」を満たす区間(連続する部分列)のうち、最小の長さを求める
     * 「条件」を満たす区間(連続する部分列)のうち、最大の長さを求める
     * 「条件」を満たす区間(連続する部分列)を数え上げる
     */
    fun slidingWindowExample(n: Int, a: List<Int>) {
        var r = 0
        var res = 0
        var sum = 0
        for (l in 0 until n) {
            while (r < n &&  sum + a[r] <= 11 /*条件を満たす何かの条件 */) {
                sum += a[r]
                r += 1
            }
            // 条件を満たす最大なので何かする
            res += (r - l)
            // lをインクリする準備
            if (r == l) {
                r += 1
            } else {
                sum -= a[l]
            }
        }
        println(res)
    }

    // 和の公式を使って、a~bまでの和を計算する
    fun sumFormula(a: Int, b: Int): Int = (b - a + 1) * (a + b) / 2

    // 組み合わせの総数を計算
    fun combinationsCount(n: Int, k: Int): Long {
        return factorial(n) / (factorial(n - k) * factorial(k))
    }

    fun factorial(n: Int): Long = if (n <= 1) 1 else n * factorial(n - 1)

    // 3点が1直線上にあるかどうか
    fun checkAline(x: Int, x1: Int, x2: Int, y: Int, y1: Int, y2: Int): Boolean {
        return (y2 - y) * (x1 - x) == (y1 - y) * (x2 - x)
    }

    fun factorialMod(n: Int, mod: Int = 1_000_000_007): Long {
        var res = 1L
        for (i in 1..n) {
            res = (res * i) % mod
        }
        return res
    }
}