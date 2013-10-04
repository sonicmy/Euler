#!/bin/sh
	exec scala "$0" "$@"
!#

val res = math.pow((1 to 100).sum,2) - (1 to 100).map(math.pow(_,2)).sum
println(res.toLong)
