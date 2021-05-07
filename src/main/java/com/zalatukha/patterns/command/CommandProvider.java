package com.zalatukha.patterns.command;


import com.zalatukha.patterns.command.impl.OrderCommand;
import com.zalatukha.patterns.command.impl.PaymentCommand;
import com.zalatukha.patterns.command.impl.SendAnOrderCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private static CommandProvider instance;

    public static CommandProvider getInstance() {
        if (instance == null) {
            instance = new CommandProvider();
        }
        return instance;
    }

    private final Map<CommandValue, Command> commandMatching = new HashMap<>();

    private CommandProvider() {
        commandMatching.put(CommandValue.ORDER, new OrderCommand());
        commandMatching.put(CommandValue.PAYMENT, new PaymentCommand());
        commandMatching.put(CommandValue.SENDANORDER, new SendAnOrderCommand());
    }

    public Command getCommand(CommandValue type) {
        Command command;
        try {
            command = commandMatching.get(type);

        } catch (NullPointerException e) {
            throw new NullPointerException("There is no such command");
        }
        return command;
    }

}
