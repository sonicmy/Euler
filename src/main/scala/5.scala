#! /bin/sh
  exec scala "$0" "$@"
!#

def rangePrimes(t: Int): List[List[Int]] = {
	def primes(number: Int, div: Int): List[Int] = {
		if(number==div) List(number)
		else if (number%div==0) div :: primes(number/div,2)
		else primes(number, div+1)
	}
	(for(i <- 2 to t) yield primes(i,2)).toList
}

def sieve(s: Stream[Int]): Stream[Int] = s.head #:: sieve(s.tail).filter(_%s.head!=0)

val s = sieve(Stream.from(2)).takeWhile(_ < 20)
val range = rangePrimes(20)

println((for(i <- s) yield range.map(x => x.filter(_==i)).filter(_!=Nil).maxBy(_.length)).toList.flatten.product)
