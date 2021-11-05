package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NaturalOrderSortedListTest {

  private NaturalOrderSortedList naturalOrderSortedList = new NaturalOrderSortedList();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("BCD", "ADC")),
          arguments(Lists.newArrayList("321", "123"))
    );
  }

  @ParameterizedTest(name = "Sorting List {0} by natural order.")
  @MethodSource("testData")
  public void getNaturalSortedListTest(List<String> inputList) {
    List<String> actual = naturalOrderSortedList.getNaturalSortedList(inputList);

    assertEquals(actual.size(), 2);
    List<String> sortedInputList = inputList.stream().sorted().collect(Collectors.toList());
    assertEquals(actual, sortedInputList);
  }
}
