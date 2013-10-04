#!/bin/sh
 exec scala "$0" "$@"
!#

val n = 1000

val res = (for { i <- 2 to n
      j <- i to 2 by -1
      k = math.sqrt(math.pow(i,2)+math.pow(j,2))
      if (k.isWhole)
} yield i+j+k -> i*j*k).toArray.filter(_._1 == 1000).head

println(res._2.toLong)
