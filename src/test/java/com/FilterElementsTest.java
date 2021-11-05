package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FilterElementsTest {

  private FilterElements filterElements = new FilterElements();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("ABCD", "BDC", "", null, null), "A", Lists.newArrayList("ABCD")),
          arguments(Lists.newArrayList("HARRY", "HALLY", null, ""), "H", Lists.newArrayList("HARRY", "HALLY")),
          arguments(Lists.newArrayList("HARRY", "HALLY", ""), "Z", Lists.newArrayList())
    );
  }

  @ParameterizedTest(name = "Find elements startsWith {1} in the list {0}.")
  @MethodSource("testData")
  public void getMappedListTest(List<String> inputList, String startsWith, List<String> expectedFilteredList) {
    List<String> actual = filterElements.filterElementsStartsWithInList(inputList, startsWith);

    assertEquals(actual, expectedFilteredList);
  }
}
