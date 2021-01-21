package com.example.refactor;

import com.google.gson.annotations.SerializedName;

public class Plays {
    String hamlet;

    @SerializedName("as-like")
    String asLike;

    String othello;


    public String getHamlet() {
        return hamlet;
    }

    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }

    public String getAsLike() {
        return asLike;
    }

    public void setAsLike(String asLike) {
        this.asLike = asLike;
    }

    public String getOthello() {
        return othello;
    }

    public void setOthello(String othello) {
        this.othello = othello;
    }
}
