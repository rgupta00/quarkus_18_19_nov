package com.bookapp.dto;

import io.smallrye.config.ConfigMapping;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperties;
@ApplicationScoped
@ConfigProperties(prefix = "invoice")
public class InvoiceConfiguration {
    Float vatRate;
    Boolean allowsDiscount;
    Float discountRate;
    String terms;
    String penalties;
}
