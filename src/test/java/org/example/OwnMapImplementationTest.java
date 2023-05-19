package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OwnMapImplementationTest {

  @Test
  void shouldPut() {
    //given
    OwnMap testMap = new OwnMapImplementation();
    //when
    boolean afterPut = testMap.put("1", "Koala");
    //then
    Assertions.assertTrue(testMap.containsKey("1"));
  }

  @Test
  void shouldContainsKey() {
    //given
    OwnMap testMap = new OwnMapImplementation();
    testMap.put("2", "ok");
    //when
    boolean result = testMap.containsKey("2");
    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldContainsValue() {
    //given
    OwnMap testMap = new OwnMapImplementation();
    testMap.put("0", "Ok");
    //when
    boolean result = testMap.containsValue("Ok");
    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldRemove() {
    //given
    OwnMap testMap = new OwnMapImplementation();
    testMap.put("2", "ok");
    //when
    String afterRemove = testMap.remove("2");
    //then
    Assertions.assertFalse(testMap.containsKey("2"));
  }

  @Test
  void shouldGet() {
    //given
    OwnMap testMap = new OwnMapImplementation();
    testMap.put("2", "ok");
    //when
    String result = testMap.get("2");
    //then
    Assertions.assertEquals("ok", result);
  }
}