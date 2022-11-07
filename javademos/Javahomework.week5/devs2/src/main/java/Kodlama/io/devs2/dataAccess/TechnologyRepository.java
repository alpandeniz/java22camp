package Kodlama.io.devs2.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.devs2.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
