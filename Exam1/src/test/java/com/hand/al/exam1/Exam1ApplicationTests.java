package com.hand.al.exam1;

import com.hand.al.exam1.config.Config;
import com.hand.al.exam1.pojo.Film;
import com.hand.al.exam1.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exam1ApplicationTests {

    @Autowired
    private FilmService filmService;

    @Autowired
    private Config config;

    @Test
    public void contextLoads() {
        Film film = new Film();
        film.setLanguage_id(config.getLanguage_id());
        film.setDescription(config.getDescription());
        film.setTitle(config.getTitle());
        filmService.save(film);
    }



}
