package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Accounts extends BaseEntity{

    @Id
    private Long accountNumber;
    @Column
    private String accountType;
    @Column
    private String branchAddress;
    @Column
    private Long customerId;

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public Long getCustomerId() {
        return customerId;
    }
}
