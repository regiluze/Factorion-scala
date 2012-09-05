package org.egi.factorion
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._

class FactorionSpec extends AssertionsForJUnit{
  
  var factorion: Factorion = _
  
  @Test
  def verifyFactorionWithNumber_One_is_true(){
    
    factorion = new Factorion();
    
    assertTrue(factorion.isFactorion(1));
  }
  
  @Test
  def verifyFactorionWithNumber_Three_is_false(){
    
    factorion = new Factorion();
    
    assertFalse(factorion.isFactorion(3));
  }
  
  @Test
  def verifyFactorionWithNumber_145_is_true(){
    
    factorion = new Factorion();
    
    assertTrue(factorion.isFactorion(145));
  }
  
  @Test
  def verifyAllFactorion(){
    
    factorion = new Factorion();
    
    var allFactorion = factorion.getAll()
    
    assertEquals(4,allFactorion.size)
    
  }
  

}