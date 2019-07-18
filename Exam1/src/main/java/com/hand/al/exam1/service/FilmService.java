package com.hand.al.exam1.service;

import com.hand.al.exam1.pojo.Film;
import com.hand.al.exam1.repository.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FilmService {

    @Autowired
    private FilmDao filmDao;
    public void save(Film film){
        filmDao.save(film);
    }
}
