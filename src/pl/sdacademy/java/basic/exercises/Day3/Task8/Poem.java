package pl.sdacademy.java.basic.exercises.Day3.Task8;

import java.util.Objects;

public class Poem {
    Author author ;
    int stropheNumbers;

    public Poem(Author author, int strophNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public static void print(Author author, int strophNumbers){
        System.out.println("Author: " + author + " , stroph numbers: " + strophNumbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poem)) return false;
        Poem poem = (Poem) o;
        return getStropheNumbers() == poem.getStropheNumbers() && Objects.equals(author, poem.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, getStropheNumbers());
    }

    @Override
    public String toString() {
        return "Poem{" +
                "author=" + author +
                ", strophNumbers=" + stropheNumbers +
                '}';
    }

    public Author getCreator() {
        return author;
    }
}
