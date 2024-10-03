package edu.weber.cs3230.questions;
import java.util.ArrayList;


// Class to model a question with multiple choices.
public class ChoiceQuestion extends Question
{
   // TODO: add an ArrayList type instance variable named "choices"
   private ArrayList<String> choices;
   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      // TODO: construct an empty ArrayList and assign it to "choices"
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      // TODO: this method add the parameter choice to the ArrayList choices,
      //  if the correct parameter is true, call setAnswer() and use the choice
      //  number to set the correct answer; For example, if the third choice is
      //  the correct answer, call setAnswer("3") inside this method.
      //add choice to the choices arraylist
      choices.add(choice);
      //initialize choice number
      int choiceNum = 0;

      //check if the answer is correct
      if(correct == true){
         //store the choice number
         choiceNum = choices.size();
         //call set answer
         setAnswer(Integer.toString(choiceNum));
      }



   }

   public void display()
   {
      // TODO: display the question text and the choices.
      /* If choices contain "Java, C++, Python, C#", and correct answer is Java,
      expected output from this method:
      *1) Java
      2) C++
      3) Python
      4) C#
       */

      // Display the question text
      super.display();
      //stores question number
      int questionNum = 0;

      //display the choices
      for(int i=0; i<choices.size(); i++){
         //calculate question number
         questionNum = i+1;
         //print out the questions
         System.out.println(questionNum + ") " + choices.get(i) + "\n");
      }






   }

}

