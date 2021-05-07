package com.zalatukha.patterns.command.impl;

import com.zalatukha.patterns.command.Command;

public class PaymentCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Customer made an payment");
    }
}
