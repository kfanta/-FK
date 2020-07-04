package com.example.login.ui.login;

import com.example.login.R;

public class Question {
    private String question;
    private int pic1;
    private int pic2;
    private int pic3;
    private int pic4;


    public Question(String question, int pic1, int pic2, int pic3, int pic4) {
        this.question = question;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.pic4 = pic4;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPic1() {
        return pic1;
    }

    public void setPic1(int pic1) {
        this.pic1 = pic1;
    }

    public int getPic2() {
        return pic2;
    }

    public void setPic2(int pic2) {
        this.pic2 = pic2;
    }

    public int getPic3() {
        return pic3;
    }

    public void setPic3(int pic3) {
        this.pic3 = pic3;
    }

    public int getPic4() {
        return pic4;
    }

    public void setPic4(int pic4) {
        this.pic4 = pic4;
    }


}
