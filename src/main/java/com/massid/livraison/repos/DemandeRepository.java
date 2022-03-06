package com.massid.livraison.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.massid.livraison.entities.Demande;

public interface DemandeRepository extends JpaRepository<Demande, Long> {

}
