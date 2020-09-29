package org.titgbot.tg;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.titgbot.tg.command.CommandHandler;

@Slf4j
@Component
public class UpdateProcessor {

    private final Map<String, CommandHandler> commandsMap;

    public UpdateProcessor(List<CommandHandler> commands) {
        commandsMap = commands
            .stream()
            .collect(Collectors.toMap(CommandHandler::getCommand, Function.identity()));
    }

    public void process(Update update) {
        log.info("Got update: {}", update);
        Optional.ofNullable(commandsMap.get(update.getMessage().getText()))
            .ifPresentOrElse(command -> command.execute(update),
                () -> log.warn("Unknown command: {}", update.getMessage().getText()));
    }
}