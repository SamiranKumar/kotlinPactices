package com.samiran.kotlinpactices.functionExample

import com.samiran.kotlinpactices.functionExample.FunctionDemo.Companion.printSeparateValueWithLine


/**
Created by Samiran Kumar on 07,August,2023
 **/

/**
## High level/ Higher order function
 * Can accept Functions as a parameters
 * Can return a function or can do both
 *
 * Lambda function has no name only hase parameters and function body ex:
 * (parameter1Type, parameter2Type) -> returnType = {parameter1, parameter2 -> body ToDO }
 * ( Int, Int) -> Unit = { parameter1Type:Int , parameter2Type:Int -> print(something
 * */

class HigherOrderFunction {

    //simple function with body
    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b
        printSeparateValueWithLine("$sum")
    }


    // function with interface parameters
    fun addTwoNumbers(a: Int, b: Int, iExecute: IExecute) {
        val sum = a + b
        iExecute.execute(sum)
    }


    //high level function with lambda function parameters
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b
        action(sum)
    }


}

//======================================
interface IExecute {
    fun execute(sum: Int)
}