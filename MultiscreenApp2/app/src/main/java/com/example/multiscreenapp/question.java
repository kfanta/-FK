package com.example.multiscreenapp;

public class question {
    private String title;
    private String question;
    private String choice;
    private String secondChoice;
    private String thirdChoice;

    public question(String title, String question, String choice, String secondChoice, String thirdChoice) {
        this.title = title;
        this.question = question;
        this.choice = choice;
        this.secondChoice = secondChoice;
        this.thirdChoice = thirdChoice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        this.secondChoice = secondChoice;
    }

    public String getThirdChoice() {
        return thirdChoice;
    }

    public void setThirdChoice(String thirdChoice) {
        this.thirdChoice = thirdChoice;
    }
}
