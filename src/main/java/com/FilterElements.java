package com;

import java.util.List;
import java.util.stream.Collectors;

public class FilterElements {

  public List<String> filterElementsStartsWithInList(List<String> inputList, String startsWith) {
    return inputList.stream().
          filter(it -> it != null && it.startsWith(startsWith)).
          collect(Collectors.toList());
  }
}
