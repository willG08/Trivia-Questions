package edu.weber.cs3230.questions;

// TODO: use Question as the super class
public class NumericQuestion extends Question
{
    // TODO: define its own private member variable "answer" of double type
    private double answer;

    // TODO: add a setter for "answer"
    public void setAnswer(double answer) {
        this.answer = answer;
    }


    /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was within 0.01 of the answer, false otherwise
     */
    @Override
    public boolean checkAnswer(String response)
    {
        // TODO: finish implementing this method to return true if the response and the
        //  expected answer differ by no more than 0.01, accept the response as correct,
        //  otherwise return false.
        //create double for response
        double responseDouble = Double.parseDouble(response);

        //check if the answer is within the specified margin
        if(answer == responseDouble || answer+0.01 == responseDouble || answer-0.01 == responseDouble) return true;

        //otherwise return false
        return false;
    }
}
