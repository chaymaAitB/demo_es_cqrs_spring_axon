package org.chaymaab.demoescqrsspringaxon.commons.dtos;

import org.chaymaab.demoescqrsspringaxon.commons.enums.AccountStatus;

public record UpdateAccountStatusDTO(String accountId, AccountStatus accountStatus) {
}
