package com.sanket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanket.entity.Information;


@Repository
public interface InformationRepository extends JpaRepository<Information, Integer>{

}
