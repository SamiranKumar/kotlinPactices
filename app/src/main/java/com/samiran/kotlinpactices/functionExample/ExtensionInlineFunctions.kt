package com.samiran.kotlinpactices.functionExample


/**
Created by Samiran Kumar on 07,August,2023
 **/
class ExtensionInlineFunctions {

    fun loop(n: Long) {
        for (i in 1..n) {

        }
    }


    //when use inline keyword dont create instance in byte code
    inline fun calculateTimeAndRun(fn: () -> Unit) {
        val start = System.currentTimeMillis()
        fn()
        val end = System.currentTimeMillis()
        FunctionDemo.printSeparateValueWithLine("Time taken ${end - start} ms")
    }

}


//Extension function
fun String.formattedPrint(): String {
    return "==========\n$this\n===================="
}