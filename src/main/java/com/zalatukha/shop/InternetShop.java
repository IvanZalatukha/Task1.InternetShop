package com.zalatukha.shop;

import com.zalatukha.command.Command;
import com.zalatukha.command.CommandProvider;
import com.zalatukha.command.CommandValue;

public class InternetShop {
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
