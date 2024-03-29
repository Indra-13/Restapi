package com.example.d5pb3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d5pb3.model.Language;
import com.example.d5pb3.service.LanguageService;

@RestController
public class LanguageController {
    @Autowired
    LanguageService lService;

    @PostMapping("/language")
    public Language pLang(@RequestBody Language l)
    {
        return lService.postLang(l);
    }

    @GetMapping("/language")
    public List<Language> getLang()
    {
        return lService.getLang();
    }

    @GetMapping("/language/{languageId}")
    public Optional<Language> getLangId(@PathVariable int languageId)
    {
        return lService.getLangById(languageId);
    }

    @PutMapping("/language/{languageId}")
    public Language editLang(@RequestBody Language l,@PathVariable int languageId)
    {
        return lService.editLang(l, languageId);
    }

    @DeleteMapping("/language/{languageId}")
    public String delLang(@PathVariable int languageId)
    {
        return lService.delLang(languageId);
    }
}
