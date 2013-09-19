#! /bin/sh
  exec scala "$0" "$@"
!#
// The solution is too straightforward but digits are too small to think hard.
println((for( i <- 999 to 1 by -1; j <- 999 to 1 by -1; if((j*i).toString == (i*j).toString.reverse) ) yield (i*j)).toArray.max)

