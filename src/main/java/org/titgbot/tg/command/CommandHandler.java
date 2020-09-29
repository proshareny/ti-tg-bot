package org.titgbot.tg.command;

import org.telegram.telegrambots.meta.api.objects.Update;

public abstract class CommandHandler {
    public abstract String getCommand();
    public abstract void execute(Update update);
}