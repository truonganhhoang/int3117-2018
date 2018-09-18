# Junit test for BigInteger

## Author
- Bui Cong Minh
- 15021622

## Requirements:
- junit 3 or 4
- java 1.8

## Running:
**Note: These commands are only tested and valid on Ubuntu 16.04**
- Compile files `javac -cp .:/usr/share/java/junit.jar BigIntegerTest.java`
    - You can replace `/usr/share/java/junit.jar` with your path to the junit library
    - replace `junit.jar` with `junit4.jar` if you wish to use junit4
- Running test: `java -cp .:/usr/share/java/junit.jar junit.textui.TestRunner BigIntegerTest`
    - use `java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore BigIntegerTest` with junit4