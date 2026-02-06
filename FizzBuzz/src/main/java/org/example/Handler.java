package org.example;

public abstract class Handler {

    protected Handler nextHandler;

    public abstract String handle(int number);

    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return this;
    }
}
