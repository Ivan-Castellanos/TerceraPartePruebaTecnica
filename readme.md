# Tercera Parte Prueba Tecnica - Ivan Castellanos
***


I solved this challenge with Java + Selenium + TestNG since those are the
technologies I am the most familiar with. Using the Page object model to order both clases and tests.
On the logging aspect I used log4j2 with a properties file of a previous personal project.


>**Important**: This project is made to run on Google Chrome Version 114.0.5735.90 (Official Build) (arm64)
since that´s the included web-driver on the resources package.

<h3>Project Idea:</h3>

The first idea of this challenge was to test the in-house page of December Labs, asserting the title of the webpage and presence of the navigation bar as first task.
Then we proceed to click the button to get to the Austin December Labs web page 
to assert its title and url. For the next step we open the calendar and check if it's displayed, 
then we close it and assert that the calendar popup is no longer exhibited.

<h3>Classes and Tests distribution:</h3>

I used the page object model since I think is a more efficient and understandable way of writing tests,
not to mention its scalability if it needs to add more tests over time.
The selected structure divided pages with their locators and methods in the main.java.org.project.pageobjects package
while leaving the test in the tests.java.org.project package where we found a BaseTest class with the basic structure of set up and after test method.
The web-driver, configuration for logger, and post executions logs are found in the resources package.


## Other Parts of the technical challenge 

- [First Part](https://docs.google.com/spreadsheets/d/18gUHXKXDtqBV-t3oEFQotHtBXly_4RvEnUMOxiuR8VM/edit?usp=sharing)
- [Second Part](https://drive.google.com/drive/folders/1BHWl1jK5sXIIAhcckT0Na0bo7kLNkS7l?usp=sharing)
- [Fourth Part](https://github.com/Ivan-Castellanos/CuartaPartePruebaTecnica)
