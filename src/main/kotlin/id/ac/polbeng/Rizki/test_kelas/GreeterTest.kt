package id.ac.polbeng.Rizki.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anto")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}