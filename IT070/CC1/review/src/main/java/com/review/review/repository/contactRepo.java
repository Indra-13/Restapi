package com.review.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.review.model.contact;

@Repository
public interface contactRepo extends JpaRepository<contact,Long>{

    


    
}
