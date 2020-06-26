package com.example.login.ui.login;

public class Question {
    private String Question;
    private String answerchoice1;
    private String answerchoice2;
    private String answerchoice3;
    private String answerchoice4;

    public String getTitle() {

        return Question;
    }

    public void setTitle(String Question) {
        this.Question = Question;
    }

    public String getResponse1() {
        return answerchoice1;
    }

    public void setResponse2(String answerchoice2) {
        this.answerchoice2 = answerchoice2;
    }

    public String getResponse3() {
        return answerchoice3;
    }

    public void setResponse2(String answerchoice4) {
        this.answerchoice4 = answerchoice4;
    }

    public String getResponse3() {
        return answerchoice4;
    }

    public void setResponse3(String response3) {
        this.answerchoice4 = answerchoice4;
    }

    public String getResponse4() {
        return response4;
    }

    public void setResponse4(String response4) {
        this.response4 = response4;
    }

    public Question(String title, String response1, String response2, String response3, String response4) {
        this.Question  = Question;
        this.response1 = response1;
        this.response2 = response2;
        this.response3 = response3;
        this.response4 = response4;

    }
}
