#! /bin/sh
  exec scala "$0" "$@"
!#

def fibo(x1: BigInt, x2: BigInt): Stream[BigInt] = (x1 + x2) #:: fibo(x2,x1+x2)

val evenFib = (2 #:: fibo(1,2)).takeWhile(_<4000000).filter(_%2==0).sum
println(evenFib)
