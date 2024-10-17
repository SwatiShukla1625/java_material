package com.ss.demo.a3;

import com.sun.source.tree.AssignmentTree;

public class AssignConstructor {
    private String author;
    private String title;

    public AssignConstructor() {
        System.out.println("default constructor called");
    }

    public AssignConstructor(String title) {
        this.title = title;
        System.out.println("constructor with one parameter is called");
    }

    public AssignConstructor(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("constructor with two parameters is called");
    }

    public void printInfo() {
        System.out.println("title" + title + ", author " + author);
    }


    public static void main(String[] args) {
        AssignConstructor assign1 = new AssignConstructor();
        assign1.printInfo();

        AssignConstructor assign2 = new AssignConstructor("the java journey");
        assign2.printInfo();

        AssignConstructor assign3 = new AssignConstructor("the java journey ", "xyz");
        assign3.printInfo();

    }
}