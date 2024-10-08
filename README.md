# Calculator
A basic calculator app created with Java. This mini-project conditions are from the ITAcademy Cibernarium.

## Goal
Create a program that replicates a simple calculator with the following conditions:
- basic operations: addition, subtraction, multiplication, division, modular
- square root and exponencials (power to)
- register in memory 1 variable
- summon registered variable
- delete registered variable
- constant values: pi, e 
- each step it must show result on screen

Optional steps: 
- absolute value
- algorithms
- radiants
- trigonomic functions

The original project was planned to just show the results on screen. I'd like to update the requirements with the following:
- Create a frontend UI
- Convert the app into an .exe file for other users

## Productivity Log
The issues that came up when developing:
  - The values in memory were erasing the previous values, particularly when chaining different operators together
  - The "result" value is a double, hence results returned always ended in '.0'. I wanted it a clean whole number if decimal wasn´t required
  - When creating the UI had to figure how to bind the correct keys on the keyboard to the app.
  - WHen exporting the app as an .exe file, it worked locally but not on other computers. Had to provida the Java library to be compressed with the app to work on other systems.

### Tasks
Following steps requried:
  - [x] addition
  - [x] subtraction
  - [x] multiplication
  - [x] division
  - [ ] modular
  - [x] square root
  - [x] exponentials
  - [ ] register in memory 1 variable
  - [ ] summon registered variable
  - [x] delete registered variable
  - [ ] constant values: pi
  - [ ] constant values: e
  - [x] each step it must show result on screen
  - [ ] absolute value
  - [ ] algorithms
  - [ ] radiants
  - [ ] trigonomic functions
  - [x] frontend UI
  - [x] Convert into .exe

## Revision & Updates

Current version has basic functions, a UI and an executable. V.1.0.2 is updated so the .exe works on other computers.

For future updates or revisions:

- Update UI using javafx sceneeditor for v.2.0.0
- Update UI using with css stylesheet for v.3.0.0
- Limit it to one instance of the .exe when its opened
