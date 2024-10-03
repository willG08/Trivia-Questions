package edu.weber.cs3230.questions;

// Class to model a question with a text and an answer.
public class Question
{
   private String text;
   private String answer;

   // Constructs a question with empty question and answer.
   public Question()
   {
      text = "";
      answer = "";
   }

   public void setText(String questionText) {
      this.text = questionText;
   }

   public void setAnswer(String answer) {
      this.answer = answer;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equalsIgnoreCase(answer);
   }

   /**
    Adds text to the question text.
    @param questionText the text of this question
    */
   public void addText(String questionText)
   {
      questionText = questionText + questionText;
   }

   // Displays this question.
   public void display()
   {
      System.out.println(this.text);
   }

   public String getAnswer() {
      return answer;
   }
}
