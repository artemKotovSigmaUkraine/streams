package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JoinListTest {

  private JoinList joinList = new JoinList();

  private static Stream<Arguments> testData() {
    return Stream.of(
          arguments(Lists.newArrayList("ABCd", "ABDC")),
          arguments(Lists.newArrayList("haRRY", "SALLY"))
    );
  }

  @ParameterizedTest(name = "Join List {0}.")
  @MethodSource("testData")
  public void getMappedListTest(List<String> inputList) {
    String actual = joinList.getJoinedList(inputList);

    assertEquals(actual, String.join(",", inputList).toUpperCase());
  }
}
