package com.cfs.BookMyShow.repository;

import java.util.*;
import com.cfs.BookMyShow.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByCustomerPhoneOrderByBookedAtDesc(String CustomerName);

    Optional<Booking> findByIdAndCustomerPhone(Long id,String customerPhone);

    List<Booking> findByCustomerIdOrderByBookedAtDesc(Long customerId);

    Optional<Booking> findByIdAndCustomerId(Long id,Long customerId);


}

