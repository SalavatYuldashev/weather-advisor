package com.salavatyuldashev.advisor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;


public class WeatherAdvisorApp {
    private static Logger log = LoggerFactory.getLogger(WeatherAdvisorApp.class);

    {
    }

    public static void main(String[] args) {
        log.info("Запуск приложения WeatherAdvisor...");
        try {
            log.info("Программа запущена");
        } catch (Exception e) {
            log.error("Ошибка{}", String.valueOf(e));
        }
    }
}
