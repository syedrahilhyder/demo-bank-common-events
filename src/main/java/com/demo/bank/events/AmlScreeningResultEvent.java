package com.demo.bank.events;

public record AmlScreeningResultEvent(
    String screeningId,
    String paymentId,
    String decision, // PASS | HOLD
    String message
) {}
