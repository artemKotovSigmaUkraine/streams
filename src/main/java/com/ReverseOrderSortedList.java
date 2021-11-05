package com;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrderSortedList {

  public List<String> getReverseSortedList(List<String> inputList) {
    return inputList.stream().
          sorted(Comparator.reverseOrder()).
          collect(Collectors.toList());
  }
}
