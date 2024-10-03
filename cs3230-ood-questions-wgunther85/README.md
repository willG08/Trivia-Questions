# CS3230-Questions

## Given Starter Code
You are given the following starter code:
* `Question` class, designed to to model a question with a text and an answer.
* `ChoiceQuestion` class, a subclass based on `Question`, designed to to model a question with multiple choices.
* `NumericQuestion` class, a subclass based on `Question`, designed to to model a question with a numeric answer.
  
## Your Tasks
You need to implement the following items based on the given starter code:

### Complete `ChoiceQuestion` class
* Modify the `ChoiceQuestion` class and use `Question` as the Super class; add an `ArrayList` type instance variable `choices`; in the constructor, construct an empty `ArrayList` and assign it to `choices`; 
* in the `ChoiceQuestion` class, add a member function `addChoice(String choice, boolean correct)`, this method add the parameter `choice` to the ArrayList `choices`, if the `correct` parameter is true, call `setAnswer()` and use the choice number to set the correct answer; For example, if the second choice is the correct answer, call `setAnswer("2")` inside the `addChoice(String choice, boolean correct)` method.
* in the ChoiceQuestion class, override `display()` method to display the question text and the choices adhering to the specified output format mentioned in the code comment.

### Complete `NumericQuestion` class
* Modify the class `NumericQuestion` and use `Question` as the Super class. In this class, you need to define its own private member variable `answer`, but its type should be `double`. In inheritance, member variables cannot be overridden like member methods. The `answer` member variable in the `NumericQuestion` subclass is hiding the member variable answer in the `Question` superclass.
* You need to override the `checkAnswer(String response)` method based on the following logic: if the response and the expected answer differ by no more than `0.01`, accept the response as correct.

The inheritace hierarchy of different question types can be seen as follows:

![image](https://user-images.githubusercontent.com/8762787/189551697-d58771ca-d6e9-441e-83b6-7c0f7002f16d.png)

## Testing
Unit tests have been written to test your code. While crafting your solution, feel free to run tests at any point to verify the correctness of your code. To execute tests on your local machine, you can either right-click on the `src/test/java` package in the left pane and choose `Run All Tests`, or use the mvn test command from the IntelliJ Maven button on the right vertical bar, or open a command prompt or terminal, navigate to the project folder, and execute the command `mvn test`. You can run tests for a particular program by right-clicking on the corresponding test code and choosing to run the test. As an example, within IntelliJ, you can right-click on the `HelloWorldTest` file under the test directory and then select `Run HelloWorldTest`.

## Submission
Ensure that your source code is committed and pushed to GitHub.com. Additionally, adhere to any instructions provided on Canvas for the submission of any other necessary documents to fulfill the grading requirements. When you're prepared to upload your solution code to GitHub.com, proceed to commit and push your changes. Feel free to stage, commit, and push the code to GitHub as often as necessary. GitHub.com will autonomously execute tests on its platform to validate your code.
