`Triangle.java`: View the class under test at `src/main/java/com/example`.

`TriangleTest.java`: View the JUnit Test at `test/main/java/com/example`

Execute to run the automated tests and generate the test coverage port by Jacoco plugin.

```
mvn package
```

To view the coverage report, execute

```
python -m http.server
```

Access the website at `localhost:8000`.

Navigate to `/target/site/jacoco/`. 


**Exercise:**: Add  test cases to `TriangleTest.java` to increase the test coverage.
