package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountListElementsTest {

  private CountListElements countListElements = new CountListElements();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("ABCD", "ABDC", "", null, null), 3),
          arguments(Lists.newArrayList("HARRY", "SALLY", null, ""), 2)
    );
  }

  @ParameterizedTest(name = "Count empty strings in the list {0}.")
  @MethodSource("testData")
  public void getMappedListTest(List<String> inputList, long expectedAmount) {
    long actual = countListElements.getAmountOfEmptyElementsInList(inputList);

    assertEquals(actual, expectedAmount);
  }
}
