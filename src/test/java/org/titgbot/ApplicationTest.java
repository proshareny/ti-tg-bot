package org.titgbot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.telegram.telegrambots.starter.TelegramBotInitializer;

@SpringBootTest
public class ApplicationTest {

    @MockBean
    private TelegramBotInitializer telegramBotInitializer;

    @Test
    public void contextLoads() {
    }
}