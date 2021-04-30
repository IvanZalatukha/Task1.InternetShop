package com.zalatukha.command.impl;

import com.zalatukha.command.Command;

public class SendAnOrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Sending an order to the customer..");
    }
}
