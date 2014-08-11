package com.progfun.worksheet

object TestApp extends App {
  val words = Array("a", "ab", "abc")
  val count = 10

  val cnt = words.map {
    word => (word, count)
  }
  cnt.foreach(println)
}
