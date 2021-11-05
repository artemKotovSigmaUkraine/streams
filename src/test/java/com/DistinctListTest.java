package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DistinctListTest {

  private DistinctList distinctList = new DistinctList();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("ABCD", "ABDC", "ABCD", null, null), Lists.newArrayList("ABCD", "ABDC", null)),
          arguments(Lists.newArrayList("HARRY", "SALLY", "", "HARRY", ""), Lists.newArrayList("HARRY", "SALLY", ""))
    );
  }

  @ParameterizedTest(name = "Distinct List {0}.")
  @MethodSource("testData")
  public void getDistinctListTest(List<String> inputList, List<String> expectedList) {
    List<String> actual = distinctList.getDistinctList(inputList);

    assertEquals(actual, expectedList);
  }
}
