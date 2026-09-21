package com.cfs.BookMyShow.repository;

import com.cfs.BookMyShow.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
import java.time.LocalDateTime;

public interface ShowRepository extends JpaRepository<Show,Long>{
    boolean existsByMovieIdAndTheatreIdAndStartAt(Long movieId, LocalDateTime startAt);

    @Query("select s  from Show s join  fetch s.movie m join fetch s.theatre t"+
     "where s.active = true and m.active = true and t.city =:city"+
    "and s.startAt>=:from and s.startAl< :to order by s.startAl")
    List<Show> findActiveShows(String city, LocalDateTime from, LocalDateTime to);
}
