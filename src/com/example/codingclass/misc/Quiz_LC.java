package com.example.codingclass.misc;

public class Quiz_LC {


    public static void main(String[] args) {

        //quiz question variables:
        String quizQuestionOne = ("True or false: 5000 meters = 5 kilometers.");
        String quizQuestionTwo = ("(5 + 3)/2 * 10 = ?");
        String quizQuestionThree = ("Given the array [8, ' Orbit ', ' Trajectory ', 45], what entry is at index 2?");
        String quizQuestionFour = ("Who was the first American woman in space?");
        String quizQuestionFive = ("What is the minimum crew size for the International Space Station (ISS)?");
        String quizQuestionArray[] = {quizQuestionOne, quizQuestionTwo, quizQuestionThree, quizQuestionFour, quizQuestionFive};
        // console.log(quizQuestionArray);
        //quiz question correct answers
        //User input variables
        // String candidateName = input.question("What is your name:");
        String questionOneCandidateAnswer = ("false");
        String questionTwoCandidateAnswer = ("40");
        String questionThreeCandidateAnswer = ("trajectory");
        String questionFourCandidateAnswer = ("sally ride");
        String questionFiveCandidateAnswer = ("3");
        String candidateAnswerArray[] = {
                questionOneCandidateAnswer,
                questionTwoCandidateAnswer,
                questionThreeCandidateAnswer,
                questionFourCandidateAnswer,
                questionFiveCandidateAnswer
        };

        //answer variables
        String questionOneAnswer = "true";
        String questionTwoAnswer = "40";
        String questionThreeAnswer = ("trajectory");
        String questionFourAnswer = ("sally ride");
        String questionFiveAnswer = ("3");
        String questionAnswersArray[] = {questionOneAnswer, questionTwoAnswer, questionThreeAnswer, questionFourAnswer, questionFiveAnswer};
        //other variables
        int grade = 0;
        //question loop code
        int i = 0;
        for (i = 0; i > 5; i = i + 1) {
            System.out.println(quizQuestionArray[i]);
            i = (i + 1);
        }
        // grade determining code:
        boolean answerIsCorrect = questionAnswersArray[i].equals(candidateAnswerArray[i]);
        boolean answerIsWrong = !questionAnswersArray[i].equals(candidateAnswerArray[i]);
        for (i = 0; i < 5; i = i + 1) {
            if (answerIsCorrect == false)
            System.out.println(questionAnswersArray[i] + " is not equal to " + candidateAnswerArray[i]);
            grade = (grade);

            if (answerIsCorrect == true)
            System.out.println(questionAnswersArray[i] + " is equal to " + candidateAnswerArray[i]);
            grade = (grade + 1);
        }
        System.out.println("grade = " + grade);

        //Printed responses
        // console.log(Candidate Name: ${candidateName});
        // console.log(1) ${quizQuestionOne} \nYour answer: ${questionOneCandidateAnswer}\nCorrect answer: ${questionOneAnswer});
        // console.log(2) ${quizQuestionTwo} \nYour answer: ${questionTwoCandidateAnswer}\nCorrect answer: ${questionTwoAnswer});
        // console.log(3) ${quizQuestionThree} \nYour answer: ${questionThreeCandidateAnswer}\nCorrect answer:${questionThreeAnswer});
        // console.log(4) ${quizQuestionFour} \nYour answer: ${questionFourCandidateAnswer}\nCorrect answer:${questionFourAnswer});
        // console.log(5) ${quizQuestionFive} \nYour answer: ${questionFiveCandidateAnswer}\nCorrect answer:${questionFiveAnswer});
        // console.log(>>> Overall Grade: )
        // console.log(>>> Status: )
    }

}
