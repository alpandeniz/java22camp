package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	
	@Autowired 
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if(language.getName().isBlank()) {
			throw new Exception("Programlama dili boş bırakılamaz!");
		}
		
		for(Language dbLanguage : languageRepository.getList()) {
			if(dbLanguage.getName().equals(language.getName())) {
				throw new Exception("Bu dil zaten mevcut!");
			}
			if(dbLanguage.getId() == language.getId()) {
				throw new Exception("Id tekrar edemez!");
			}
		}
		languageRepository.add(language);
		
	}

	@Override
	public void delete(int id) throws Exception {
for(Language dbLanguage : languageRepository.getList()) {
	if(dbLanguage.getId() != id ) {
		throw new Exception("Böyle bir nesne yok...");
	}
	
	languageRepository.delete(dbLanguage);
}
	}

	@Override
	public void update(Language language) throws Exception {
			if(language.getName().isBlank()) {
				throw new Exception("Programlama dili boş bırakılamaz!");
			}
			
			for(Language dbLanguage : languageRepository.getList()) {
				if(dbLanguage.getName().equals(language.getName())) {
					throw new Exception("Bu dil zaten mevcut!");
				}
				if(dbLanguage.getId() == language.getId()) {
					throw new Exception("Id tekrar edemez!");
				}
			}
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getList();
	}

	@Override
	public Language getLanguageById(int id) {
		
		return languageRepository.getById(id);
	}
	
}
