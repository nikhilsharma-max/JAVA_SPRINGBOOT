package com.cfs.BookMyShow.repository;

import com.cfs.BookMyShow.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    boolean existByEmail(String email);

    boolean existByPhone(String phone);

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByPhone(String Phone);

}
