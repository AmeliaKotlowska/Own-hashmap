# Own-hashmap
Arrow down
Zaimplementuj własną hashmapę bazując na danym interfejsie:

public interface OwnMap {
 
  boolean put(String key, String value);
  boolean containsKey(String key);
  boolean containsValue(Object value);
 
  /*
    @param key
     key for which (key, value) entry will be removed
   
    @return value for given key
   */
  String remove(String key);
 
  /*
    Return value for given key
   */
  String get(String key);
}
 
Założenia dodatkowe:
●      Mapa przyjmuje tylko typ String
●      nie zachodzi kolizja w mapie tzn. wartość pod zadanym kluczem jest nadpisywana
●      złożoność obliczeniowa nie gra dużej roli, ale warto zwrócić na nią uwagę
●      do implementacji nie wolno stosować jakiejkolwiek implementacji już istniejącej Mapy
●      implementacja powinna być pokryta testami
