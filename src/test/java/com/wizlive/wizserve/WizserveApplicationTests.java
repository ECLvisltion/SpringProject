package com.wizlive.wizserve;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WizserveApplicationTests
{
  @Test
  void testJpa()
  {
    String i = "test";
    String j = "test";
    assertEquals(i, j);
  }
}
