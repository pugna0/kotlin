// !DIAGNOSTICS: -UNUSED_VARIABLE
// COMMON_COROUTINES_TEST
// SKIP_TXT
import COROUTINES_PACKAGE.*
import COROUTINES_PACKAGE.intrinsics.*

open class EmptyContinuation(override val context: CoroutineContext = EmptyCoroutineContext) : Continuation<Any?> {
    companion object : EmptyContinuation()
    override fun resume(<!PARAMETER_NAME_CHANGED_ON_OVERRIDE!>data<!>: Any?) {}
    override fun resumeWithException(exception: Throwable) { throw exception }
}

// Function is NOT suspend
// parameter is crossinline
// parameter is NOT suspend
// Block is allowed to be called inside the body of owner inline function
// Block is allowed to be called from nested classes/lambdas (as common crossinlines)
// It is NOT possible to call startCoroutine on the parameter
// suspend calls NOT possible inside lambda matching to the parameter

inline fun test(crossinline c: () -> Unit) {
    c()
    val o = object: Runnable {
        override fun run() {
            c()
        }
    }
    val l = { c() }
    c.<!UNRESOLVED_REFERENCE_WRONG_RECEIVER!>startCoroutine<!>(EmptyContinuation)
}

suspend fun calculate() = "OK"

fun box() {
    test {
        <!ILLEGAL_SUSPEND_FUNCTION_CALL!>calculate<!>()
    }
}
