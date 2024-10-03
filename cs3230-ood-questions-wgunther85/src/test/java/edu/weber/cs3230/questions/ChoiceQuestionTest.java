package edu.weber.cs3230.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChoiceQuestionTest {
    @Test
    public void addChoice_CorrectChoiceAdded_ReturnsCorrectAnswer() {
        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion.setText("What is the capital of France?");
        choiceQuestion.addChoice("Berlin", false);
        choiceQuestion.addChoice("Paris", true);
        choiceQuestion.addChoice("Madrid", false);

        assertTrue(choiceQuestion.checkAnswer("2"));
    }

    @Test
    public void addChoice_MultipleChoicesWithCorrectOneAdded_ReturnsCorrectAnswer() {
        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion.setText("Which programming language is used for Android app development?");
        choiceQuestion.addChoice("Java", true);
        choiceQuestion.addChoice("Python", false);
        choiceQuestion.addChoice("C++", false);
        choiceQuestion.addChoice("Swift", false);

        assertFalse(choiceQuestion.checkAnswer("2"));
        assertFalse(choiceQuestion.checkAnswer("3"));
        assertFalse(choiceQuestion.checkAnswer("4"));
    }

    @Test
    public void addChoice_NoCorrectChoiceAdded_ReturnsEmptyAnswer() {
        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion.setText("Which color is associated with stop signs?");
        choiceQuestion.addChoice("Red", false);
        choiceQuestion.addChoice("Green", false);
        choiceQuestion.addChoice("Blue", false);

        assertFalse(choiceQuestion.checkAnswer("2"));
        assertFalse(choiceQuestion.checkAnswer("3"));
        assertFalse(choiceQuestion.checkAnswer("1"));
    }


}