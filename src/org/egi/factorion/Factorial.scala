package org.egi.factorion

class Factorial {
  
  def get(number:Int): Int = {
     var factorialNumber = 1;
     for(i <- 1 to number){
        factorialNumber *= i
     }
     return factorialNumber
  }

}