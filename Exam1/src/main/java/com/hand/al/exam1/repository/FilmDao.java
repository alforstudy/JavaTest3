package com.hand.al.exam1.repository;

import com.hand.al.exam1.pojo.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDao extends JpaRepository<Film,Integer> {
}
