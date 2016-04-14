/**
  * Created by chrisp on 13/04/16.
  */
object FizzBuzz {
  def go(num: Int) : String = (num % 3, num % 5) match{
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _ => num.toString
  }
}
