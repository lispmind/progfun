package com.progfun.funcs

import scala.util.Random

object Sum {

  def sumInt(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInt(a + 1, b)

  def cube(a: Integer): Int = a * a * a

  def sumCube(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCube(a + 1, b)

  def fact(a: Integer): Int =
    if (a == 0) 1 else a * fact(a - 1)

  def factInt(a: Int): Int =
    if (a == 0) 1 else a * fact(a - 1)

  def sumFact(a: Int, b: Int): Int =
    if (a > b) 0 else fact(a) + sumFact(a + 1, b)

  def sum(f: Integer => Integer, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumTail(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, sum: Int): Int = {
      if (a > b) sum else loop(a + 1, f(a) + sum)
    }
    loop(a, 0)
  }

  def funcList(f: String => List[String], a: String, b: String): List[String] = {
    if (a.length > b.length) List[String](a) else funcList(f, a + Random.nextPrintableChar(), b) ::: f(a)
  }

  def main(args: Array[String]) {
    println(fact(3))
    println(fact(5))
    println(fact(8))

    println(sumInt(1, 8))
    println(sumCube(1, 8))
    println(sumFact(1, 8))

    println(sum((x: Integer) => x, 1, 8))
    println(sum(cube, 1, 8))
    println(sum((x: Integer) => x * x * x, 1, 8))
    println(sum(fact, 1, 8))

    println(sumTail((x: Int) => x, 1, 8))
    println(sumTail((x: Int) => x * x * x, 1, 8))
    println(sumTail(factInt, 1, 8))

    println(funcList(x => List(x, x.toUpperCase()), "a", "123456"))
  }
}
