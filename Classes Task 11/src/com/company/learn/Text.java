package com.company.learn;

public class Text {

    private String content = "";
    private String headline;

    public Text (Sentence sentence){
        content = sentence.getValue();
        this.headline = getHeadline();
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void addContent(Word word) {
        content += " " + word.getValue();
    }

    public String getContent() {
        return content;
    }

}
