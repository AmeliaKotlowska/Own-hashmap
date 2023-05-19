package org.example;

public class OwnMapImplementation implements OwnMap {

  private final int capacity = 200;
  private int size = 0;

  private final Entry[] entries = new Entry[capacity];

  @Override
  public boolean put(String key, String value) {
    if (key == null) {
      Entry entry = entries[0];
      if (entry != null) {
        entry.setKey(key);
        entry.setValue(value);
      } else {
        Entry newEntry = new Entry(key, value);
        entries[0] = newEntry;
        size++;
      }
      return true;
    }

    int location = key.hashCode() % capacity;
    if (location > capacity) {
      System.out.println("Brak miejsca w mapie");
      return false;
    }
    Entry entry = entries[location];
    if (entry != null) {
      entry.setKey(key);
      entry.setValue(value);
    } else {
      Entry newEntry = new Entry(key, value);
      entries[location] = newEntry;
      size++;
    }
    return true;
  }

  @Override
  public boolean containsKey(String key) {
    if (key == null) {
      Entry value = entries[0];
      return value != null && value.getKey() == null;
    }
    int location = key.hashCode() % capacity;
    Entry value = entries[location];
    return value != null && value.getKey().equals(key);
  }

  @Override
  public boolean containsValue(Object value) {
    int result = 0;
    if (value == null) {
      result = result;
    }
    for (Entry entry : entries) {
      if (entry.getValue().equals(value)) {
        result++;
      }
    }
    return result == 1;
  }

  @Override
  public String remove(String key) {
    if (key == null) {
      throw new IllegalArgumentException("Nie znaleziono klucza");
    }
    int location = key.hashCode() % capacity;
    if (entries[location].getKey().equals(key)) {
      entries[location] = null;
      size--;
    }
    return key;
  }

  @Override
  public String get(String key) {
    if (key == null) {
      throw new IllegalArgumentException("Nie istnieje taki element");
    } else {
      int location = key.hashCode() % capacity;
      Entry value = entries[location];
      if (value.getKey().equals(key)) {
        return value.getValue();
      }
    }
    return key;
  }
}
