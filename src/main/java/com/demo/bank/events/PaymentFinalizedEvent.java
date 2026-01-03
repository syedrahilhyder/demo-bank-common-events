package com.demo.bank.events;

public record PaymentFinalizedEvent(
    String paymentId,
    String finalStatus,
    String reason
) {}
