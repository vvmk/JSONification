# JSONification

* **Objective**
  * Use the [Jackson](https://github.com/FasterXML/jackson) library to marshall and unmarshall java objects to/from JSON

* **Instructions:**
	 	 First, include the [Jackson Maven Dependency](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind). You may need to do some independant research. 
	This json [prettifier](http://prettifier.net/json/) will make your life easier.
    	* Write a method `getMapper()` that returns a JsonObjectMapper object
    	* Test it


    + I. **Create** a Java Object with 2 fields (i.e. a `User` with a `String name` and `Date joinedOn`
       * Use JsonObjectMapper to serialize the data to a **json string**
       * Write the string to a file
       * Your test will need to be able to read the file

    + II. **Read** a json String from a text file
        * Deserialize/unmarshall it to a json object
        * Your test will need to write a test file, and sufficiently test the **java object** returned

    + III. Read a json String from a text file, **Update** the value of one of the fields (i.e. change a user's `name` or `bio` props)
        * Write updated object to a file (beware append flag if using the same file)
        * Test will need to read the file for the change (test the **json object**  not the <s>java object</s>)
    }

    + IV. Refactor the original java object to include an additional field that is some subclass of `Collection`
        * Serialize the new object to json (write it to file and test)  
        * Read the json from file and deserialize it to java.
        * Write functionality to add entries to the `Collection`
        * Serialize the object and write it to file (test the updated object
        * **you may update previous methods but do so on a separate branch**
        
    + V. Create an `Object` that will hold at least 3 instances of your previous `Object` (i.e. if your original class was `User`, maybe use `Channel`)
    	* Store your objects in some `Map`
    	* Serialize the map to json ( write to file, test)
       * Given a similar json object as an input, **Delete** one of the child objects and serialize back to json
       * write to file, test, etc.
    
    
    ### bonus
    	* protect (and test) your code against existing fields with value `null`
    	* properly handle all IO & JsonExceptions