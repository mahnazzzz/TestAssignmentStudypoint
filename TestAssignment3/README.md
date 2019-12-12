# Assignment 3

Include some code smells:
"Smells are certain structures in the code that indicate violation of fundamental design principles and negatively impact design quality"

## Class-level smells:

- Large class: a class that has grown too large.
- Feature envy: a class that uses methods of another class excessively.
- Lazy class / freeloader: a class that does too little.
- Too many parameters: a long list of parameters is hard to read
- Excessive return of data: a function or method that returns more than what each of its callers need
- Excessively long line of code (or God Line): A line of code which is too long, making the code difficult to read


## Configuring The JaCoCo Maven Plugin
We use the JaCoCo Maven plugin for two purposes:

It provides us an access to the JaCoCo runtime agent which records execution coverage data.
It creates code coverage reports from the execution data recorded by the JaCoCo runtime agent.

Configure the JaCoCo Maven plugin by following these steps:

- Add the JaCoCo Maven plugin to the plugins section of our POM file.
- Configure the code coverage report for unit tests.
- Configure the code coverage report for integration tests.
```bash
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.7.5.201505241946</version>
</plugin>
```


