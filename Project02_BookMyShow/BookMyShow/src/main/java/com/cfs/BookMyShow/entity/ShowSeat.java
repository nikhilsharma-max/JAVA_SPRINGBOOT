package com.cfs.BookMyShow.entity;


import jakarta.persistence.*;

@Entity
@Table(name="show_seats",uniqueConstraints = @UniqueConstraint(name="uk_show_seat",columnNames = {"show_id","seatLabel"}))
public class ShowSeat {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Show show;

    private String seatLebel;

    private boolean reserved;

    public ShowSeat(){

    }

    public ShowSeat(Show show, String seatLebel) {
        this.show = show;
        this.seatLebel = seatLebel;
    }

    public boolean isReserved(){
        return reserved;
    }

    public String getSeatLebel(){
        return seatLebel;
    }

    public void reserve(){
        reserved = true;
    }

    public void release(){
        reserved = false;
    }
}
