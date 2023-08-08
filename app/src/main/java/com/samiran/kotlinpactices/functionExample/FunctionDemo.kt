package com.samiran.kotlinpactices.functionExample

import com.samiran.kotlinpactices.functionExample.FunctionDemo.Companion.printSeparateValueWithLine


/**
Created by Samiran Kumar on 07,August,2023
 **/

/**
## All type of Kotlin function
 * inline function
 * lambda function
 * Higher order/ High Level functions
 * Extension Function
 *
 * */
class FunctionDemo {

    companion object {
        fun separateLine() {
            println("============================================\n")
        }

        fun printSeparateValueWithLine(value: String) {
            println(value)

            println("============================================\n")
        }

    }

}

fun main() {
    println("hkhr")
    FunctionDemo.separateLine()


    val higherOrderFunction = HigherOrderFunction()

    higherOrderFunction.addTwoNumbers(5, 6)

    //using interface
    higherOrderFunction.addTwoNumbers(11, 7, object : IExecute {
        override fun execute(sum: Int) {
            printSeparateValueWithLine("using interface: $sum")
        }
    })


    //using Lambada function as a parameters with Unit return type
    val myLambadaFun: (Int) -> Unit =
        { parameters: Int -> printSeparateValueWithLine("using Lambada function: $parameters") }

    higherOrderFunction.addTwoNumbers(50, 40, myLambadaFun)

    higherOrderFunction.addTwoNumbers(
        60,
        20,
        { parameters: Int -> printSeparateValueWithLine("using Lambada function 1: $parameters") })

    higherOrderFunction.addTwoNumbers(
        35,
        30
    ) { parameters: Int -> printSeparateValueWithLine("using Lambada function 1: $parameters") }
    /**
     * both are provide same result just high level syntax difference
     */


    println("Extension function Example".formattedPrint())


    val extensionInlineFunctions = ExtensionInlineFunctions()

    extensionInlineFunctions.calculateTimeAndRun {
        extensionInlineFunctions.loop(100000)
    }

}



