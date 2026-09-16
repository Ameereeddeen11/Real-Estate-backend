package com.amir.backend.realestate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Property extends JpaRepository<Property, UUID> {
}