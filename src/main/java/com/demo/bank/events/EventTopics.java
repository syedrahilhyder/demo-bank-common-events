package com.demo.bank.events;

public final class EventTopics {
  private EventTopics() {}

  public static final String PAYMENTS_EVENTS = "demo-bank.payments.events";
  public static final String LEDGER_EVENTS   = "demo-bank.ledger.events";
  public static final String AML_EVENTS      = "demo-bank.aml.events";
  public static final String NOTIFY_EVENTS   = "demo-bank.notify.events";

}
