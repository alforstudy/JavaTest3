package com.hand.al.exam1.listener;

import com.hand.al.exam1.config.Config;
import com.hand.al.exam1.pojo.Film;
import com.hand.al.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener {

    @Autowired
    private FilmService filmService;

    @Autowired
    private Config config;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationReadyEvent) {
            System.out.println("Context Start");
            Film film = new Film();
            System.out.println("Title:");
            System.out.println(config.getTitle());
            System.out.println("Description:");
            System.out.println(config.getDescription());
            System.out.println("Language_id:");
            System.out.println(config.getLanguage_id());
            film.setLanguage_id(config.getLanguage_id());
            film.setDescription(config.getDescription());
            film.setTitle(config.getTitle());
            filmService.save(film);
        } else if(event instanceof ApplicationPreparedEvent){
        } else if(event instanceof ContextClosedEvent){
            System.out.println("Context Stop");
        }

    }
}
