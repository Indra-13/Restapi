package com.review.review.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.review.model.contact;
import com.review.review.repository.contactRepo;

@Service
public class contactService {
    @Autowired
    contactRepo contactrepo;
    contact changes;
    
    @SuppressWarnings("null")
    public contact add_details(contact c)
    {
        return contactrepo.save(c);
    }
    public List<contact> get_detail()
    {
        return contactrepo.findAll();
    }
    @SuppressWarnings("null")
    public Optional<contact> getById(Long id)
    {
        return contactrepo.findById(id);
    }
    @SuppressWarnings("null")
    public contact update_details(Long contactid,contact c)
    {
        if(c!=null)
        {
        changes= contactrepo.findById(contactid).orElse(null);
        changes.setName(c.getName());
        changes.setEmail(c.getEmail());
        changes.setMessage(c.getMessage());
        changes.setPhoneNumber(c.getPhoneNumber());
        return contactrepo.saveAndFlush(changes);
        }
        else{
            return null;
        } 
    }
    @SuppressWarnings("null")
    public void delete_details(Long id)
    {
        contactrepo.deleteById(id);
    }
    
}
