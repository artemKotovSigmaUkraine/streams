package com;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {

  public int getMax(List<Integer> input) {
    IntSummaryStatistics stats = input.stream()
          .mapToInt(it -> it)
          .summaryStatistics();

    return stats.getMax();
  }

  public int getMin(List<Integer> input) {
    IntSummaryStatistics stats = input.stream()
          .mapToInt(it -> it)
          .summaryStatistics();

    return stats.getMin();
  }

  public double getAverage(List<Integer> input) {
    IntSummaryStatistics stats = input.stream()
          .mapToInt(it -> it)
          .summaryStatistics();

    return stats.getAverage();
  }
}
