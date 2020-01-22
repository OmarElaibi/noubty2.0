package com.chillhub.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chillhub.app.entities.Criticality;

@Repository
public interface EtatUrgentDAO extends JpaRepository<Criticality, Integer> {

}
