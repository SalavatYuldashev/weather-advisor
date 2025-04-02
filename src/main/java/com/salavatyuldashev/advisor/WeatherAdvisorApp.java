package com.salavatyuldashev.advisor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WeatherAdvisorApp {
    private final static Logger log = LoggerFactory.getLogger(WeatherAdvisorApp.class);

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
