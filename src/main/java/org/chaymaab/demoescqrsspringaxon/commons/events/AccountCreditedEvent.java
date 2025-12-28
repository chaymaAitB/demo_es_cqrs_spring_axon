package org.chaymaab.demoescqrsspringaxon.commons.events;

public record AccountCreditedEvent(String accountId, double amount) {
}
