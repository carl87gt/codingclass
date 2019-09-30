package com.example.codingclass.quiz.solution;

import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        Question[] questions = new Question[5];
        questions[0] = new Question("What is your name?", "string");
        questions[1] = new Question("what is your favourite color?", "string");
        questions[2] = new Question("what is your favourite sport?", "string");
        questions[3] = new Question("what is your favourite movie?", "string");
        //questions[4] = new Question("what is your age?");   // <-- should be a number!!!
        // todo . . . new constructor for question should let me do this
        questions[4] = new Question("what is your age?", "number");

        askQuestions(questions);
        printQusetionsWithAnswers(questions);
    }

    private void askQuestions(Question[] questions) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            askQuestion(scanner, questions[i]);
        }

    }

    private void askQuestion(Scanner scanner, Question question) {
        System.out.println(question.getQuestion());
        String answer = scanner.nextLine();

        // todo: check if answer matches question type
        // todo: if questionType is a number then they should give you a number
        // todo: hint!!!! try - catch around parseInt(answer)

        // new todo: this only checks the first time the question is answered
        // what if they answer it wrong the second time
        if("number".equals(question.getQuestionType())&& isNotANumber(answer)){
            System.out.println("-- Please enter you answer as a number --");
            System.out.println(question.getQuestion());
            answer = scanner.nextLine();
        }

        question.setAnswer(answer);
        System.out.println("");
    }

    private boolean isNotANumber(String answer){
        try {
            int num = Integer.parseInt(answer);
        } catch (NumberFormatException | NullPointerException nfe) {
            return true;
        }
        return false;
    }

    private void printQusetionsWithAnswers(Question[] questions){
        for (int i = 0; i < questions.length; i++) {
            System.out.println("*******************************");
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getAnswer());
        }
    }

}
