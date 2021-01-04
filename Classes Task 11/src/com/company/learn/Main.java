package com.company.learn;
/*
  Создать объект класса Текст, используя классы Предложение, Слово.
  Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Main {

    public static void main(String[] args) {
        Word word = new Word("Hello");
        Word word1 = new Word("world");
        Sentence sentence = new Sentence();
        sentence.addValue(word);
        sentence.addValue(word1);
        Text text = new Text(sentence);
        Word word2 = new Word("Java");
        text.addContent(word2);
        text.setHeadline("Java intro");
        System.out.println(text.getHeadline());
        System.out.println(text.getContent());
    }
}
