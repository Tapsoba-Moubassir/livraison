package com.massid.livraison.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.massid.livraison.repos.DemandeRepository;
import com.massid.livraison.entities.Demande;

@RestController
@RequestMapping("/demande")
public class DemandeRestController {

	@Autowired
	DemandeRepository demandeRepository;
	
	//Fonction pour recuperer l'ensemble de toutes les demandes
	@GetMapping()
	public List<Demande> getAllDemande(){
		return this.demandeRepository.findAll();
		
	}
	
	//fonction pour la sauvegarde d'une demande
	@PostMapping()
	public Demande createDemande(@RequestBody Demande demande) {
		return this.demandeRepository.save(demande);
	}
	
	//fonction pour retouner une demande specifique de demande à partir de son ID
	@GetMapping("/{id}")
	public Demande getOneDemande(@PathVariable Long id) {
		return this.demandeRepository.findById(id).get();
	}
	
	//fonction pour mettre a jour le statut d'une demande
	@PutMapping("/{id}")
	public Optional<Demande> updateDemande(@PathVariable Long id, @RequestBody Demande newdemande) {
		return this.demandeRepository.findById(id).map(demande ->{
			demande.setStatut(newdemande.getStatut());
			return demandeRepository.save(demande);
		});
	}
	
	//Fonction pour mettre a jour une demande
	@PutMapping()
	public Demande updateDemande(@RequestBody Demande demande) {
		return this.demandeRepository.save(demande);
	}
	
	//fonction pour rechercher les demande selon la date d'operation
	@GetMapping("/sort/{date_operation}")
	public List<Demande> getDemandeByDate(@PathVariable String date_operation){
		return demandeRepository.findByDateOperation(date_operation);
	}
	
	
	
}
