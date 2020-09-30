package org.titgbot.tg.command;

import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
public abstract class CommandHandler {
    public abstract String getCommand();
    protected abstract void executeCommand(Update update);
    public void execute(Update update) {
        log.info("Processing of {}", getCommand());
        executeCommand(update);
    }
}