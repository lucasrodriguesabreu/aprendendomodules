package saudacao;

import goodbye.GoodBye;
import hello.HelloWorld;

public class Main {
    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();
        hello.diga();

        GoodBye bye = new GoodBye();

        bye.diga();
    }
}