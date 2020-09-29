package org.titgbot.tg.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Component
public class StartCommandHandler extends CommandHandler {

    @Override
    public String getCommand() {
        return "/start";
    }

    @Override
    public void execute(Update update) {
        log.info("Processing of {}", getCommand());
    }
}