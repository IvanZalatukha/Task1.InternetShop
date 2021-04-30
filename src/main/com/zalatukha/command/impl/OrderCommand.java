package main.com.zalatukha.command.impl;

import main.com.zalatukha.command.Command;

public class OrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Customer made an order");
    }

}
