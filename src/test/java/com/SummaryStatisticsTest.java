package com;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SummaryStatisticsTest {

  private SummaryStatistics summaryStatistics = new SummaryStatistics();

  private static Stream<Arguments> testDataMax() {
    return Stream.of(
          arguments(Lists.newArrayList(1, 2, 3), 3),
          arguments(Lists.newArrayList(4, 5, 6), 6)
    );
  }

  private static Stream<Arguments> testDataMin() {
    return Stream.of(
          arguments(Lists.newArrayList(1, 2, 3), 1),
          arguments(Lists.newArrayList(4, 5, 6), 4)
    );
  }

  private static Stream<Arguments> testDataAverage() {
    return Stream.of(
          arguments(Lists.newArrayList(1, 2, 3), 2),
          arguments(Lists.newArrayList(4, 5, 6), 5)
    );
  }

  @ParameterizedTest(name = "Find max element in the list {0}.")
  @MethodSource("testDataMax")
  public void getMaxTest(List<Integer> inputList, long expectedResult) {
    long actual = summaryStatistics.getMax(inputList);

    assertEquals(actual, expectedResult);
  }

  @ParameterizedTest(name = "Find min element in the list {0}.")
  @MethodSource("testDataMin")
  public void getMinTest(List<Integer> inputList, long expectedResult) {
    long actual = summaryStatistics.getMin(inputList);

    assertEquals(actual, expectedResult);
  }

  @ParameterizedTest(name = "Find average element in the list {0}.")
  @MethodSource("testDataAverage")
  public void getAverageTest(List<Integer> inputList, double expectedResult) {
    double actual = summaryStatistics.getAverage(inputList);

    assertEquals(actual, expectedResult);
  }
}
