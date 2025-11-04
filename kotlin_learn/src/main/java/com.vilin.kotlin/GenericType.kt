package com.vilin.kotlin

const val one = 1
const val threeBillion = 3000000000
const val oneLong = 1L
const val oneByte: Byte = 1
const val flag = 1 > 2
val rangeFlag = one in 1 .. 10

fun main(){
    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)

    println(flag)
    println(rangeFlag)
}