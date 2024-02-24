`Triangle.java`: View the class under test at `src/main/java/com/example`.

`TriangleTest.java`: View the class under test at `test/main/java/com/example`

Execute to run the automated tests

```
mvn package
```

To view the Jacoco will generate the coverage report, execute

```
python -m http.server
```

Access the website at `localhost:8000`.

Navigate to `/target/site/jacoco/`. 


**Exercise:**: Add  test caess to `TriangleTest.java` to increase the test coverage.
