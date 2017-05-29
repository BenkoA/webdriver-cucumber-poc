**WebDriver - Cucumber - JUnit - Allure integration (POC)**

Purpose of this project is to experiment with the above mentioned frameworks.
To install all the dependencies, kindly run:

```mvn clean install```

To execute the Feature tests (cucumber), kindly run the `runTests.java` file or create a Cucumber profile for it in your IDE.


To generate the XML files for the allure, kindly use:

```mvn test```

XML files are generated under 
```target > allure-results```

To generate the Allure Test Report from the previously generated XML files, kindly use


```mvn site```

Test reports are generated under the folder: 

```target > site > allure-maven-plugin.html```