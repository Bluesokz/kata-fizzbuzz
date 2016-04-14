import base.UnitSpec

class FizzBuzzSpec extends UnitSpec {

  "Calling FizzBuzz " should "return fizz with 3" in {
    assertResult("fizz"){
      FizzBuzz.go(3)
    }
  }

  it should "return buzz with 5" in {
    assertResult("buzz"){
      FizzBuzz.go(5)
    }
  }

  it should "return fizz with 6" in {
    assertResult("fizz"){
      FizzBuzz.go(6)
    }
  }

  it should "return fizz with 18" in {
    assertResult("fizz"){
      FizzBuzz.go(18)
    }
  }

  it should "return buzz with 10" in {
    assertResult("buzz"){
      FizzBuzz.go(10)
    }
  }

  it should "return 1 with 1" in {
    assertResult("1"){
      FizzBuzz.go(1)
    }
  }

  it should "return 89 with 89" in {
    assertResult("89"){
      FizzBuzz.go(89)
    }
  }

  it should "return fizzbuzz with 30" in {
    assertResult("fizzbuzz"){
      FizzBuzz.go(30)
    }
  }
}