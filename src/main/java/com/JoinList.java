package com;

import java.util.List;
import java.util.stream.Collectors;

public class JoinList {

  public String getJoinedList(List<String> inputList) {
    return inputList.stream().
          map(String::toUpperCase).
          collect(Collectors.joining(","));
  }
}
