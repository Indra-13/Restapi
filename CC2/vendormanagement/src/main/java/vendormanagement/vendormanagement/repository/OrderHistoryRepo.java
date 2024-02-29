package vendormanagement.vendormanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vendormanagement.vendormanagement.model.OrderHistory;

@Repository
public interface OrderHistoryRepo extends JpaRepository<OrderHistory,Long>{
    
}
