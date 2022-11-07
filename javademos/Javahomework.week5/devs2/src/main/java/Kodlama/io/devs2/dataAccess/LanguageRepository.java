package Kodlama.io.devs2.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.devs2.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

}
