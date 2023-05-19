# Own-hashmap
Implement your own hashmap based on the given interface:

public interface OwnMap {

boolean put(String key, String value); boolean containsKey(String key); boolean containsValue(Object value);

/* @param key key for which (key, value) entry will be removed

@return value for given key
*/ String remove(String key);

/* Return value for given key */ String get(String key); }

Additional assumptions: 
● The map accepts only the String type 
● there is no collision in the map, i.e. the value under the given key is overwritten 
● computational complexity is not important, but it is worth paying attention to 
● any implementation of an already existing Map cannot be used for implementation 
● implementation should be tested
