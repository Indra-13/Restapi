package com.review.review.controller;

import org.springframework.web.bind.annotation.RestController;

import com.review.review.model.contact;
import com.review.review.service.contactService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class contactController {
    @Autowired
    contactService contactservice;
    
    @PostMapping("/add_details")
    public contact postdetails(@RequestBody contact id) {
        return contactservice.add_details(id);
    }
    @GetMapping("/getdetails")
    public List<contact> getdetails() {
        return contactservice.get_detail();
    }
    @GetMapping("/getbyid/{contactId}")
    public Optional<contact> getbyid(@PathVariable Long contactId) {
        return contactservice.getById(contactId);
    }
    @PutMapping("/updatedetails/{contactId}")
    public contact putdetails(@PathVariable Long contactId, @RequestBody contact c) {
        return contactservice.update_details(contactId,c);
    }
    @DeleteMapping("/deletedetails/{contactId}")
    public void deletedetails(@PathVariable Long contactId)
    {
        contactservice.delete_details(contactId);
    }
    
    
}
