def main(args: Array[String]): Unit = {
  print("Enter an integer number: ")
  val num = scala.io.StdIn.readInt()
  println(SUM(num))
  
}

def SUM(n:Int): Int = {
    var sum: Int=0;
    if(n==1)
    {
        sum=1
    }
    else
    {
        sum=SUM(n-1)+n
    }
    sum
}