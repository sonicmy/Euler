#! /usr/sh
  exec scala "$0" "$@"
!#

val mults = (1 until 1000).filter(x=>x%3==0||x%5==0)
println(mults.sum)
