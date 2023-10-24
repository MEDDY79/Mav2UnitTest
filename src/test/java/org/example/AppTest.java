package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
 @Test
 public void testCalSum(){
  Assertions.assertEquals(8, Calc.sum(5,3));
  Assertions.assertEquals(8, Calc.sum(3,5));
  Assertions.assertEquals(0, Calc.sum(0,0));
  Assertions.assertEquals(0, Calc.sum(-8,8));
  Assertions.assertEquals(-7, Calc.sum(0,-7));
  Assertions.assertEquals(-9, Calc.sum(-5,-4));
 }
 }
