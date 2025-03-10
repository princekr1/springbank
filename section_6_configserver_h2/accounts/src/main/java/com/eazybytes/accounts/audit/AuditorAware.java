package com.eazybytes.accounts.audit;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditorAware implements org.springframework.data.domain.AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("account_ms");
    }
}
