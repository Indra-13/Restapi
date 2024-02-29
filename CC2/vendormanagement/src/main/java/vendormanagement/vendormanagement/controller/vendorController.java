package vendormanagement.vendormanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import vendormanagement.vendormanagement.model.Vendor;
import vendormanagement.vendormanagement.service.VendorService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class vendorController {
    @Autowired 
    VendorService vendorService;

    @PostMapping("/vendor")
    public Vendor postdetails(@RequestBody Vendor vendor) {
        return vendorService.post(vendor);
    }

    @GetMapping("/vendors")
    public List<Vendor> getdetails() {
        return vendorService.get();
    }
    @GetMapping("/vendors/pages/{offset}/{pageNumber}")
    public List<Vendor> getpage(@PathVariable int offset,@PathVariable int pageNumber) {
        return vendorService.page(offset,pageNumber);
    }
    @GetMapping("/vendors/sort/{field}")
    public List<Vendor> getpage(@PathVariable String field) {
        return vendorService.sort(field);
    }
    @GetMapping("/vendors/query")
    public List<Vendor> getquery(@RequestParam String letter) {
        return vendorService.query(letter);
    }


}
