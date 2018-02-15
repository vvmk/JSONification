# JSONification [WIP]


"Write me a JSON lab" -Kris

**To be clear** this is not the lab spec but a guide/notes for myself while creating it

### lab objectives
* most popular JSON lib for java
* demonstrate the ~5 most common operations
* don't have to write tests
* tryhard: write tests
* tryhard: write project spec 

### Jackson <s>or Gson</s>
* import [Jackson](http://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind) maven dependency  
* 

### ~5 most common JSON operations
* CRUD 
    + **create** a JSONObject from java Object
        + at least 2 nesting layers
        + at least one array
    + **read** JSON string from an incoming source and parse it to JSONObject
        + check for null 
        + at least one array
        + compare JSON objects based on a nested field 
    + **update** the previously read object
        + change at least 3 values
    + **delete** values from previously read object
        + remove an array
        + remove an object
        
* Jackson Annotations are fair game
* change field name/ ignore properties on serialization
* 

#### considerations
* store JSON data
* touch arrays and objects
* nested data
* why is JSON important