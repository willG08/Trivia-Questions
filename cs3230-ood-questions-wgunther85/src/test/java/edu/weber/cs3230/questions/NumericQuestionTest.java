package edu.weber.cs3230.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumericQuestionTest {
    @Test
    public void checkAnswer_CorrectResponseWithinTolerance_ReturnsTrue() {
        NumericQuestion numericQuestion = new NumericQuestion();
        numericQuestion.setAnswer(10.50);

        assertTrue(numericQuestion.checkAnswer("10.49"));
        assertTrue(numericQuestion.checkAnswer("10.50"));
        assertTrue(numericQuestion.checkAnswer("10.51"));
    }

    @Test
    public void checkAnswer_IncorrectResponseOutsideTolerance_ReturnsFalse() {
        NumericQuestion numericQuestion = new NumericQuestion();
        numericQuestion.setAnswer(15.75);

        assertFalse(numericQuestion.checkAnswer("15.73"));
        assertFalse(numericQuestion.checkAnswer("15.77"));
    }

}