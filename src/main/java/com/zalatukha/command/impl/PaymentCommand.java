package com.zalatukha.command.impl;

import com.zalatukha.command.Command;

public class PaymentCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Customer made an payment");
    }
}
