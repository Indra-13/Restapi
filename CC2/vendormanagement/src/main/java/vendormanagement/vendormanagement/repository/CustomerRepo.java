package vendormanagement.vendormanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vendormanagement.vendormanagement.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

    

    
}
