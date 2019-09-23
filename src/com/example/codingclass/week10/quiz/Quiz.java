package com.example.codingclass.week10.quiz;

import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        Question[] questions = new Question[5];
        questions[0] = new Question("What is your name?");
        questions[1] = new Question("what is your favourite color?");
        questions[2] = new Question("what is your favourite sport?");
        questions[3] = new Question("what is your favourite movie?");
        questions[4] = new Question("what is your age?");   // <-- should be a number!!!
        // todo . . . new constructor for question should let me do this
        // questions[4] = new Question("what is your age?", "number");

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

        question.setAnswer(answer);
        System.out.println("");
    }

    private void printQusetionsWithAnswers(Question[] questions){
        for (int i = 0; i < questions.length; i++) {
            System.out.println("*******************************");
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getAnswer());
        }
    }


}
