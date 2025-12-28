package org.chaymaab.demoescqrsspringaxon.query.handlers;

import io.axoniq.axonserver.grpc.SerializedObject;
import io.axoniq.axonserver.grpc.event.Event;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.queryhandling.QueryHandler;
import org.chaymaab.demoescqrsspringaxon.commons.dtos.AccountStatement;
import org.chaymaab.demoescqrsspringaxon.query.dtos.AccountEvent;
import org.chaymaab.demoescqrsspringaxon.query.entities.Account;
import org.chaymaab.demoescqrsspringaxon.query.entities.Operation;
import org.chaymaab.demoescqrsspringaxon.query.queries.GetAccountStatement;
import org.chaymaab.demoescqrsspringaxon.query.queries.GetAllAccounts;
import org.chaymaab.demoescqrsspringaxon.query.queries.WatchEventQuery;
import org.chaymaab.demoescqrsspringaxon.query.repository.AccountRepository;
import org.chaymaab.demoescqrsspringaxon.query.repository.OperationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AccountQueryHandler {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;

    public AccountQueryHandler(AccountRepository accountRepository, OperationRepository operationRepository) {
        this.accountRepository = accountRepository;
        this.operationRepository = operationRepository;
    }
    @QueryHandler
    public List<Account> on(GetAllAccounts query){
        return accountRepository.findAll();
    }
    @QueryHandler
    public AccountStatement on(GetAccountStatement query){
        Account account = accountRepository.findById(query.getAccountId()).get();
        List<Operation> operations = operationRepository.findByAccountId(query.getAccountId());
        return new AccountStatement(account, operations);
    }

    @QueryHandler
    public AccountEvent on(WatchEventQuery query){
        return AccountEvent.builder().build();
    }


}
