TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

part ii:
q24. a special type of map that uses hashes instead of keys? a map is similar to an arraylist, in that it contains values in one object, except a map assigns the values to keys, which are strings instead of integers
q25. same type could be used for both parameters (<String, String>)
     containsValue(Object value)
     merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
     put(K key, V value)
     putIfAbsent(K key, V value)
     remove(Object key, Object value)
     replace(K key, V value)
     replace(K key, V oldValue, V newValue)
q26. size()
q28. it gets replaced like reassigning a variable
q29. both exist at the same time
q30. containsKey(Object key)
     for example in the phonebook:
     return containsKey("John Doe");
     if it does it would return true, else false
q31. returns null
q32. keySet()