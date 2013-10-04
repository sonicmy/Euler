#!/bin/sh
  exec scala "$0" "$@"
!#
//Damn straight solution
def straight(lst: List[Int], iter: Int):Int = {
  if(lst.length == 10000) lst.head
  else if(lst.forall(iter%_!=0)) straight(iter :: lst, iter + 2)
  else straight(lst, iter+2)
}

println(straight(Nil,3))
