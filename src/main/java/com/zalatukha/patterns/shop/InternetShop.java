package com.zalatukha.patterns.shop;

import com.zalatukha.patterns.command.Command;
import com.zalatukha.patterns.command.CommandProvider;
import com.zalatukha.patterns.command.CommandValue;

import java.io.Serializable;

public class InternetShop implements Serializable {
    Command command;


    public void makeAnOrder() {
        command = CommandProvider.getInstance().getCommand(CommandValue.ORDER);
        command.execute();
    }

    public void payment() {
        command = CommandProvider.getInstance().getCommand(CommandValue.PAYMENT);
        command.execute();
    }

    public void sendVehicle() {
        command = CommandProvider.getInstance().getCommand(CommandValue.SENDANORDER);
        command.execute();
    }



}
