# key-value-repl
A REPL CLI program used to put, fetch, and remove String values from a storage map, persisted from a text file.

---

This program allows the user to store, retrieve, and delete values from a storage map. The storage map data is persisted by a text file, ```key_values.txt```. The program starts by reading from this file to initialize any key-value pairs into the storage map. When the program ends, the text file is overwritten with the current key-value pairs present in the storage map.

The syntax for each command is as follows:
- ```put key value``` > Puts the key-value pair into the storage map.
- ```fetch key``` > Fetches the value of the input key, if it exists in the storage map.
- ```remove key``` > Removes the key-value pair from the storage map, if it exists.
- ```exit``` > Quits the program.