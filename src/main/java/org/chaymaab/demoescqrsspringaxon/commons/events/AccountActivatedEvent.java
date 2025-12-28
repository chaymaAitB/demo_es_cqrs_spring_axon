package org.chaymaab.demoescqrsspringaxon.commons.events;

import org.chaymaab.demoescqrsspringaxon.commons.enums.AccountStatus;

public record AccountActivatedEvent(String accountId, AccountStatus accountStatus) {
}
