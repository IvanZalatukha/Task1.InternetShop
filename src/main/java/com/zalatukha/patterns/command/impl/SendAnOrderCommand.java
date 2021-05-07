package com.zalatukha.patterns.command.impl;

import com.zalatukha.patterns.command.Command;

public class SendAnOrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Sending an order to the customer..");
    }
}
