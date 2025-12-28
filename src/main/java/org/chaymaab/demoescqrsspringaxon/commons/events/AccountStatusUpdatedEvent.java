package org.chaymaab.demoescqrsspringaxon.commons.events;

import org.chaymaab.demoescqrsspringaxon.commons.enums.AccountStatus;

public record AccountStatusUpdatedEvent(String accountId, AccountStatus fromStatus, AccountStatus toStatus) {
}
