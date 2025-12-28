package org.chaymaab.demoescqrsspringaxon.commons.events;

import org.chaymaab.demoescqrsspringaxon.commons.enums.AccountStatus;

public record AccountCreatedEvent(String accountId, double initialBalance, String currency, AccountStatus accountStatus) {
}
