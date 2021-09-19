object TailRecursion extends App {

  //RECURSIVIDAD

  /*this code is not efficient, because the multiplication only execute itself
    in the last execution, it waste memory charging the data before the execution.*/
  def factorial(n:Long): Long =
    if (n==0){
      1
    }else{
      n * factorial(n-1)
    }

  /*is more efficient than the other because in each iteration is making the
  * operation (multiplication), so it doesn't waste memory */
  def factorialWithTail(n: Long, result: Long =1L): Long =
    if (n==0){
      result
    }else{
      factorialWithTail(n-1, n* result)
    }

  println(factorial(3))
  println(factorialWithTail(5))

  // AGREGACION
  /* 1 to 5 creates an array with the numbers from one to five
  * foldLeft is a method of agregacion to iterate from left of the array to right
  * 1L is initial value
  * r,n => r*n this means the function is going to have two parameters r and n
  *   so in each iteration the function will multiply r with n
  * r would be the actual number and n would be the accumulate value*/
  val factorialResult = (1 to 5).foldLeft(1L)((r, n)=> r*n)
  println(factorialResult)
}
