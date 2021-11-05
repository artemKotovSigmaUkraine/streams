package com;

import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderSortedList {

  public List<String> getNaturalSortedList(List<String> inputList) {
    return inputList.stream().
          sorted().
          collect(Collectors.toList());
  }
}
