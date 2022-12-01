package kodlama.io.devs.controller;

import kodlama.io.devs.businnes.abstracts.LanguageService;
import kodlama.io.devs.businnes.requests.CreateLanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;


    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }

}
