#! /bin/sh
  exec scala "$0" "$@"
!#

def primes(n:Long):Array[Long] = {
  val sqrt = math.round(math.sqrt(n))
  
  def div(iter:Double):(Long,Long) = {
    if(iter == sqrt) n -> n
    else if(n%iter==0) (n/iter).toLong -> iter.toLong
    else div(iter+1)
  }

  val (prime, iter) = div(2)
  if(prime==n) Array(n)
  else iter +: primes(prime)
}

val num = 600851475143L
println(primes(num).max)
