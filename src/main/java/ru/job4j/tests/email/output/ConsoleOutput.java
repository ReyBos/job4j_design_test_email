package ru.job4j.tests.email.output;

public class ConsoleOutput implements Output {
    @Override
    public void println(Object ob) {
        System.out.println(ob);
    }

    @Override
    public void print(Object ob) {
        System.out.print(ob);
    }
}
