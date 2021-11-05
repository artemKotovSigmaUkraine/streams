package com;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctList {

  public List<String> getDistinctList(List<String> inputList) {
    return inputList.stream().
          distinct().
          collect(Collectors.toList());
  }
}
