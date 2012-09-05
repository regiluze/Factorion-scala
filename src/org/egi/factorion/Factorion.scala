package org.egi.factorion
import java.util.ArrayList

class Factorion {
  
  val MAX_NMUBER = 2500000
  
  var factorialService: Factorial = new Factorial()
  
  def getAll(): List[Int]= {
    var allFactorion = List[Int]()
    for (i <- 0 to MAX_NMUBER){
      if (isFactorion(i)){
        allFactorion ::= i
      }
    }
    return allFactorion
  }
  
  def isFactorion(number: Int): Boolean= {
     (number == factorialSum(number.toString()))
  }
  
  private def factorialSum(number: String): Int= {
    var result = 0
    for(i <- 0 until number.length()){
      result += factorialService.get((number(i) + "").toInt)
    }
    return result
  }


}