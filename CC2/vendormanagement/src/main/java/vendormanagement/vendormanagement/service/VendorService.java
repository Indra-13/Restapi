package vendormanagement.vendormanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vendormanagement.vendormanagement.model.Vendor;
import vendormanagement.vendormanagement.repository.VendorRepo;

@Service
@SuppressWarnings("null")
public class VendorService {
    @Autowired
    VendorRepo vendorRepo;
    

    public Vendor post(Vendor vendor)
    {
        return vendorRepo.save(vendor);
    }
    public List<Vendor> get()
    {
        return vendorRepo.findAll();
    }
    public List<Vendor> page(int offset,int pagenumber)
    {
        return vendorRepo.findAll(PageRequest.of(offset,pagenumber)).getContent();
    }
    public List<Vendor> sort(String field)
    {
        return vendorRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<Vendor> query(String name)
    {
        return vendorRepo.findByVendorNameStartsWith(name);
    }   
    
}
