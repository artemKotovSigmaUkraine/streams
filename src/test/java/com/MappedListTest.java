package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MappedListTest {

  private MappedList mappedList = new MappedList();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("ABCD", "ABDC")),
          arguments(Lists.newArrayList("HARRY", "SALLY"))
    );
  }

  @ParameterizedTest(name = "Mapping List {0}.")
  @MethodSource("testData")
  public void getMappedListTest(List<String> inputList) {
    List<String> actual = mappedList.getMappedList(inputList);

    assertEquals(actual.size(), 2);
    actual.forEach(it -> it.endsWith(" - mapped"));
  }
}
