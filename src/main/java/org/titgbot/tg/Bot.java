package org.titgbot.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramLongPollingBot {

    @Autowired
    private UpdateProcessor updateProcessor;

    @Override
    public void onUpdateReceived(Update update) {
        updateProcessor.process(update);
    }

    @Override
    public String getBotUsername() {
        return "TiTgBot";
    }

    @Override
    public String getBotToken() {
        return "";
    }
}