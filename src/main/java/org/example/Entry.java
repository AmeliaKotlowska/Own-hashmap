package org.example;

import java.util.Objects;

public class Entry {
  private String key;
  private String value;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entry entry = (Entry) o;
    return key.equals(entry.key) && value.equals(entry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public Entry(String key, String value) {
    this.key = key;
    this.value = value;
  }
}

