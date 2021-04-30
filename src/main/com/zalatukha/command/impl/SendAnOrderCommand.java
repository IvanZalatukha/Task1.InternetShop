package main.com.zalatukha.command.impl;

import main.com.zalatukha.command.Command;

public class SendAnOrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Sending an order to the customer..");
    }
}
