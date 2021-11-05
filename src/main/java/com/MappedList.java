package com;

import java.util.List;
import java.util.stream.Collectors;

public class MappedList {

  public List<String> getMappedList(List<String> inputList) {
    return inputList.stream().
          map(it -> it + " - mapped").
          collect(Collectors.toList());
  }
}
