package com.demo.bank.events;

public record LedgerPostedEvent(
    String ledgerEntryId,
    String paymentId,
    String debitAccount,
    String creditAccount,
    long amountMinor,
    String currency
) {}
