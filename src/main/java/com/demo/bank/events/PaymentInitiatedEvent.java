package com.demo.bank.events;

public record PaymentInitiatedEvent(
    String paymentId,
    String kind,
    String customerId,
    long amountMinor,
    String currency,
    String reference
) {}
