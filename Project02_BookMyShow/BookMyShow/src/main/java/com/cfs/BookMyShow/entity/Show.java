package com.cfs.BookMyShow.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="shows")
public class Show {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Theatre theatre;//Show ke respect mai theatre

    private LocalDateTime startAt;

    private LocalDateTime endsAt;

    private int totalSeats;

    private int availableSeats;

    private boolean active=true;

    @Version
    private Long version;

    public Show(Movie movie, Theatre theatre, LocalDateTime startAt, LocalDateTime endsAt, int totalSeats, int availableSeats) {
        this.movie = movie;
        this.theatre = theatre;
        this.startAt = startAt;
        this.endsAt = endsAt;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(LocalDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void reserve(int seats){
        if(seats<=0 || seats> availableSeats){
            throw new IllegalArgumentException("Not enough seat Available");
        }
        availableSeats-=seats;
    }

    public  void release(int seats){
        availableSeats = Math.min(totalSeats,availableSeats+seats);
    }
}
