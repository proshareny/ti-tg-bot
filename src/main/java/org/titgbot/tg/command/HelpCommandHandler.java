package org.titgbot.tg.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Component
public class HelpCommandHandler extends CommandHandler {

    @Override
    public String getCommand() {
        return "/help";
    }

    @Override
    public void executeCommand(Update update) {

    }
}