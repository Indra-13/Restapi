package vendormanagement.vendormanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderhistory")
public class OrderHistory {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long historyId;
    String projectName;
    @JsonFormat(pattern="yyyy-mm-dd",timezone = "UTC")
    String startDate;
    @JsonFormat(pattern="yyyy-mm-dd",timezone = "UTC")
    String endDate;
    long totalCost;
    public Long getHistoryId() {
        return historyId;
    }
    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public long getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }
    
    
}
