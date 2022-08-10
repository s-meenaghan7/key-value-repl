# key-value-repl
A REPL CLI program used to put and fetch values into a storage map.

---

This program allows the user to store and retrieve values from a storage map. The storage map data is persisted by a text file, ```key_values.txt```. The program starts by reading from this file to initialize any key-value pairs into the storage map. When the program ends, the text file is overwritten with the current key-value pairs in the storage map.

Two primary commands are used: the ```put``` and ```fetch``` commands. The ```exit``` command is also utilized to exit the program.

The syntax for each command is as follows:
- ```put key value``` > Puts the key-value pair into the storage map.
- ```fetch key``` > Fetches the value of the input key, if it exists in the storage map.
- ```exit``` > Quits the program.