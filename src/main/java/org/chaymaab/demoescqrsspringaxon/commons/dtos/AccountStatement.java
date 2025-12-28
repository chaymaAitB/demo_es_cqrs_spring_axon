package org.chaymaab.demoescqrsspringaxon.commons.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.chaymaab.demoescqrsspringaxon.query.entities.Account;
import org.chaymaab.demoescqrsspringaxon.query.entities.Operation;

import java.util.List;
@AllArgsConstructor @Getter
public class AccountStatement {
    private Account account;
    private List<Operation> operations;
}
