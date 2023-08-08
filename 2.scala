def main(args: Array[String]): Unit = {
  print("Enter an integer number: ")
  val num = scala.io.StdIn.readInt()

  for(i<- 2 to num-1 )
  {
    if(checkPrime(i,2)==true)
    {
      println(" "+i)
    }
  }
}

def checkPrime(n: Int, divisor: Int): Boolean = {
  if (divisor >= n/2)
  {
    true
  }
  else if (n % divisor == 0)
  {
    false
  } else
  {
    checkPrime(n, divisor + 1)
  }
}

