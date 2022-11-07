package Kodlama.io.devs2.business.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.devs2.business.abstracts.TechnologyService;
import Kodlama.io.devs2.business.requests.CrateTechnologyRequest;
import Kodlama.io.devs2.business.requests.DeleteTechnologyRequest;
import Kodlama.io.devs2.business.requests.UpdateTechnologyRequest;
import Kodlama.io.devs2.business.responses.technologyResponses.GetAllTechnologyResponse;
import Kodlama.io.devs2.dataAccess.LanguageRepository;
import Kodlama.io.devs2.dataAccess.TechnologyRepository;
import Kodlama.io.devs2.entities.concretes.Language;
import Kodlama.io.devs2.entities.concretes.Technology;

public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRespository;
	private Language language;
	
	

	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRespository) {
		
		this.technologyRepository = technologyRepository;
		this.languageRespository = languageRespository;
	}
	

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<>();
		for(Technology technology : technologies) {
			GetAllTechnologyResponse response = new GetAllTechnologyResponse();
			response.setName(technology.getName());
			response.setLanguageName(technology.getLanguages().getName());
			responses.add(response);
		}
		return responses;
	}

	@Override
	public void add(CrateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		Language language = languageRespository.findById(createTechnologyRequest.getLanguageId()).get();
		technology.setName(createTechnologyRequest.getName());
		technology.setLanguages(language);
		technologyRepository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
		
	}

	@Override
	public void update( UpdateTechnologyRequest updateTechnologyRequest, int id) {
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setLanguages(language);
		technologyRepository.save(technology);
	}

}
