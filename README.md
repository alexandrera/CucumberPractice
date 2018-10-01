 -- Setup instructions for windows -- 

1. Install Chocolatey

https://chocolatey.org/install

Command to install chocolatey (command prompt):

@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"

2. Cucumber

Before we begin, you will need the following:

Java SE (Java 9 is not yet supported by Cucumber)

Maven - version 3.3.1 or higher

Eclipse (a good alternative if you don’t use IntelliJ)

Cucumber Eclipse

Use chocolatey to install the items above if you don't have them (command prompt):

C:\> choco install jdk8

C:\> choco install maven

C:\> choco install eclipse

3. Add the file selenium-server-standalone-3.14.0.jar and chromedriver.exe in the (C:) drive

Selenium Server: https://goo.gl/FCSwwD

Chromedriver: 	 https://chromedriver.storage.googleapis.com/index.html?path=2.42/

4. Clone the project into a folder

-- Instruction to run --

5. Open folder on command prompt and use: 

mvn test

or

Scenario outline: mvn test -Dcucumber.options="--tags @outline"

Scenario: 		  mvn test -Dcucumber.options="--tags @smoke"

-- Why --

Language:
I have chosen java due to its massive adoption and to be the one I have most familiarity.
Page Object due to its maintainability and JUnit because it's the default used by cucumber.

Feature file (Gherkin):
There is one feature, there are two scenarios and one background.
The background is in charge of creating the precondition of the test (Login).
The scenario outline is used with parameters, so with the same test we can test two conditions.
The single scenario is to test specific action. 

-- Explanation --

Frameworks and Structure:
Besides cucumber was obligatory in this test, it is a effective way to document, test and share the software  expectations in terms of behaviour (acceptance criteria and quality). 
This project is built using Cucumber (Gherkin) along with Selenium Framework and JUnit in order to simulate user interaction with web application. The selenium framework is structured with the Page Object class, where all screen elements are stored along with methods to be called by JUnit at step definitions class. Maven is in charge to compile and run the tests from POM file in the root project directory.

A good way to see this project is:
Maven > Gherkin (Human Language) > Step Definition (JUnit + Page Object + Selenium Webdriver) > Browser driver > Http requests > Web App
