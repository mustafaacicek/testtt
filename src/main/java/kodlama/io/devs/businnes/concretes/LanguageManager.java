package kodlama.io.devs.businnes.concretes;

import kodlama.io.devs.businnes.abstracts.LanguageService;
import kodlama.io.devs.businnes.requests.CreateLanguageRequest;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;
import org.springframework.stereotype.Service;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setLanguageName(createLanguageRequest.getName());
        this.languageRepository.save(language);
    }


}
