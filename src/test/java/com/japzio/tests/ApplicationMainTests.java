package com.japzio.tests;

import com.japzio.decbinconverter.dectobin.DecimalToBinary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.regex.Pattern;

public class ApplicationMainTests {

  @Test
  public void getExponentTest() {
    assertEquals(8, DecimalToBinary.getExponent("01010100"));
  }

  @Test

  public void getBinaryFromIntegralTest() {
    assertEquals("11000010", DecimalToBinary.getBinaryFromIntegral(194));
  }


  @Test
  public void getBinaryFromFractionaTest() {

    Pattern pattern = Pattern.compile("^10100000");
    assertTrue(
            pattern.matcher(
                    DecimalToBinary.getBinaryFromFractional(625, 10)
            ).find());
  }

}