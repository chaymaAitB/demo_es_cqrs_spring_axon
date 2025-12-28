package org.chaymaab.demoescqrsspringaxon.commons.events;

public record AccountDebitedEvent(String accountId, double amount) {
}
