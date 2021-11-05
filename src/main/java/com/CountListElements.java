package com;

import org.junit.platform.commons.util.StringUtils;

import java.util.List;

public class CountListElements {

  public long getAmountOfEmptyElementsInList(List<String> inputList) {
    return inputList.stream().
          filter(StringUtils::isBlank).
          count();
  }
}
