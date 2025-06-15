package chap41

class Box3<L, C>(val label:L? = null, val content:C? = null) {

}

fun main() {
    // コンストラクタのパラメータから、型を推論可能な場合は
    // 明示的に型パラメータを渡さないことも可
    val box = Box3("ラベル", 123)
    // ↑ Box3<String, Int> と解釈されている。
}
