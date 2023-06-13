package org.example.model.Test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class Test {

    @SerializedName("question")
    @Expose
    private HashMap<Integer, Question> question;

    public HashMap<Integer, Question> getQuestion() {
        return question;
    }

    public void setQuestion(HashMap<Integer, Question> questions) {
        this.question = questions;
    }
}
