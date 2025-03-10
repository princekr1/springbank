package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "AccountType of EazyBank", example = "saving"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;

    @Schema(
            description = "BranchAddress of EazyBank", example = "123 Newyork"
    )
    @NotEmpty(message = "BranchAddress can not be null or empty")
    private String branchAddress;

    @Schema(
            description = "AccountNumber of EazyBank", example = "12334444"
    )
    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$[0-9]{10})", message = "AccountNumber must be of 10 digits")
    private Long accountNumber;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
