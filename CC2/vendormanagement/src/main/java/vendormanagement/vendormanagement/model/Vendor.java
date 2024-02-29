package vendormanagement.vendormanagement.model;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long vendorId;
    String vendorName;
    int noOfCustomers;
    Long earnings;
    String paymentStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="vendorId")
    List<Customer> customer=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="historyId")
    OrderHistory history;


    public OrderHistory getHistory() {
        return history;
    }


    public void setHistory(OrderHistory history) {
        this.history = history;
    }


    public Long getVendorId() {
        return vendorId;
    }


    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }


    public String getVendorName() {
        return vendorName;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public int getNoOfCustomers() {
        return noOfCustomers;
    }


    public void setNoOfCustomers(int noOfCustomers) {
        this.noOfCustomers = noOfCustomers;
    }


    public Long getEarnings() {
        return earnings;
    }


    public void setEarnings(Long earnings) {
        this.earnings = earnings;
    }


    public String getPaymentStatus() {
        return paymentStatus;
    }


    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    public List<Customer> getCustomer() {
        return customer;
    }


    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

}
