//Nothing interesting here

def sieve(v:Array[Int],res:Array[Int]):BigInt = {
  if(v.isEmpty) res.map(BigInt(_)).sum
  else {
    val f = v.tail.filter(x => x%v.head != 0)
    sieve(f,res :+ v.head)
  }
}

println(sieve((2 to 2000000).toArray, Array(0)))
