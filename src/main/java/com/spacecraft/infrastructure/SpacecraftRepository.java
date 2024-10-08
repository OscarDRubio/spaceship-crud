package com.spacecraft.infrastructure;

import com.spacecraft.domain.spacecraft.SpacecraftId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spacecraft.domain.spacecraft.Spacecraft;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface SpacecraftRepository extends JpaRepository<Spacecraft, SpacecraftId> {

    Page<Spacecraft> findByNameContaining(String keyword, Pageable pageable);
    boolean existsByName(String name);
}
