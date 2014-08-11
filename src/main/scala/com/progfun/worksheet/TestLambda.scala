package com.progfun.worksheet

object TestLambda {

  def foo(x: String) = {
    println(x)
  }

  def high(f: String => Unit) = {
    f("higher")
  }

  def main(args: Array[String]) {
    val f1: String => Unit = foo
    val f2: Function1[String, Unit] = foo

    high(f1)
    high(f2)

    high({
      (x: String) => println(x)
    })
    high {
      (x: String) => println(x)
    }

    high(((x: String) => println(x)))
    high((x: String) => println(x))
    high(x => println(x))
    high(println(_))
    high(println _)
    high(println)
  }
}
