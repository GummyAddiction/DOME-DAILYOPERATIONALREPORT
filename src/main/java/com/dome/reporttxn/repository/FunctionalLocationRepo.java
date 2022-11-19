package com.dome.reporttxn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dome.reporttxn.model.FunctionalLocation;

@Repository
public interface FunctionalLocationRepo extends JpaRepository<FunctionalLocation, Long> {

}
