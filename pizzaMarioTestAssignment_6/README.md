## Assignment 6

You can finde assignment [her](https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Assignments/06%20TDD%20assignment.pdf)

We should practice Getting into the Test-driven development, TDD does have some benefits:

- This will make sure we don't forget to write the test
- This allows the programmer to know exactly what their code should output
- Writing a test before each code increases the test coverage of the program to 5%, thus reducing the likelihood of an error in future development.
- TDD make possible to see whether each piece of code written meets expectations or whether new code is a problem with older software components. Or not.

For this assignment you need tomcat server, you can download it [her](https://tomcat.apache.org/download-80.cgi). you will also need a chromedriver (I use version 72) which you can download [her](http://chromedriver.chromium.org/). 

## What the test do:
Whit Serenium and Mockito mock admin, admin orders a Hawaii pizza. 

Mock a object means simulate a object uses because sometimes the method we want to test depends on other objects, such as a database that requires several minutes to actually load its data. There may be a problem with the network or the Internet and the database information may get errors and thousands of other problems. When we engage with these dependencies in the testing process, the philosophy of testing becomes questionable. To get the job done, we create a dummy object that behaves similar to the actual object. This speeds up the testing process and focuses on program capabilities and testing Instead of engaging with dependencies.

## Test resualt:
![Capture](https://user-images.githubusercontent.com/20173643/70856658-0b0b8280-1ee1-11ea-89be-412b596a989a.PNG)
![pitzashop](https://user-images.githubusercontent.com/20173643/70856663-13fc5400-1ee1-11ea-8f31-61e4d27ba028.PNG)
![Run](https://user-images.githubusercontent.com/20173643/70856665-16f74480-1ee1-11ea-92a9-9dda57764ca1.PNG)
![Selenium](https://user-images.githubusercontent.com/20173643/70856666-19f23500-1ee1-11ea-9cdb-a23cf682cbf6.PNG)


