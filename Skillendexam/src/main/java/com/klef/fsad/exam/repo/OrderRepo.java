package com.klef.fsad.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.exam.model.Ordermodel;

@Repository
public interface OrderRepo extends JpaRepository<Ordermodel, Integer>{

}
