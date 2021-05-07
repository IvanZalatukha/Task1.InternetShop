package com.zalatukha.patterns.command.impl;

import com.zalatukha.patterns.command.Command;

public class OrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Customer made an order");
    }

}
