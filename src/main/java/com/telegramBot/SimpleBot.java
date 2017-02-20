package com.telegramBot;


import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Michael Rudyy on 19.02.2017.
 */
public class SimpleBot extends TelegramLongPollingBot{

    @Override
    public void onUpdateReceived(Update update) {

        /*
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                    .setChatId(update.getMessage().getChatId())
                    .setText(update.getMessage().getText());
            try {
                sendMessage(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        */

        SendMessage message = new SendMessage().setChatId(update.getMessage().getChatId()).setText("BeBeBE");
        try {
            sendMessage(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "test_bot_for_BotFather_bot";
    }

    @Override
    public String getBotToken() {
        return "347772269:AAFAIrec6-oxl-K4jawaS8JYkhXXapDFvGE";
    }


    //static TelegramBot bot = TelegramBotAdapter.build("347772269:AAFAIrec6-oxl-K4jawaS8JYkhXXapDFvGE");





}
