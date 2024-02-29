package vendormanagement.vendormanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import vendormanagement.vendormanagement.model.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor,Long>{
   
    List<Vendor> findByVendorNameStartsWith(String vendorName);

    
}
