# Dmytro's project

#### for C.T.Co

### Tools that was used :

- Selenide;
- Cucumber;
- jUnit5;
- AssertJ;

### For automation task I've chosen selenide instead of selenium because it's easier

to implement:

- Webriver configuration not needed;
- Easy to pick browser (Chrome,Firefox,Opera);
- You can work with elements directly including condition;
- No need to create Actions \ WebDriwerWait;
- No need to initialize elements;
- No need to pass driver;

#### To Run test - use 'mvn clean test'

### For task with 'DatePicker'
datePicker.feature is added.
As it's written at BDD - there won't be any difficulties 
to convert it into test suite.

###Answering questions from DatePicker task
- Please create TC design to cover this functionality - done in datePicker.feature;
- Please define high-level automation strategy (short overview) - done in datePicker.feature;
- Please list most likely problems you could expect during such functionality testing:

###Problems
- 1st 'problem' - I didn't get the point 'On GUI the original value entered by User is shown'. 
Does it means that only on DB full date is available? if yes - last step of feature file would be:
connect to DB, get converted date and compare. If its displayed on GUI - last step of feature file would be:
compare expected with values from GUI;

- 2nd 'problem' - different output pattern used ('MMMM dd yyyy' & 'dd MMMM yyyy');
- to get expected result - tester needs to write all conditions


