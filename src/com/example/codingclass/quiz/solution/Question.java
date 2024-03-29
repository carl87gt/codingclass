package com.example.codingclass.quiz.solution;

public class Question {

    private String question;
    private String answer;
    private String questionType;   // should be string or number

    Question (String question){
        this.question = question;
    }

    // todo: create constructor that takes question and questionType
    // todo: hint!!!  Question(String question, String questionType)
    Question (String question, String questionType){
        this.question = question;
        this.questionType = questionType;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // todo: add getter and setter for questionType
    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

}
