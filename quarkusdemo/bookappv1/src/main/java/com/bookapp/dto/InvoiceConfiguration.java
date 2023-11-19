package com.bookapp.dto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.*;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApplicationScoped
public class InvoiceConfiguration {
    @ConfigProperty(name = "invoice.vatRate", defaultValue = "10")
    private int  vatRate;
    @ConfigProperty(name = "invoice.allowedDiscount", defaultValue = "true")
    private boolean  allowedDiscount;
    @ConfigProperty(name = "invoice.terms")
    private String  terms;
    @ConfigProperty(name = "invoice.penalties")
    private String  penalties;
}
