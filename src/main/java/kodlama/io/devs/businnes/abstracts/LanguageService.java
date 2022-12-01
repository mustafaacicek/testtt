package kodlama.io.devs.businnes.abstracts;


import kodlama.io.devs.businnes.requests.CreateLanguageRequest;
import org.springframework.stereotype.Service;

@Service
public interface LanguageService {
    void add(CreateLanguageRequest createLanguageRequest);

}
