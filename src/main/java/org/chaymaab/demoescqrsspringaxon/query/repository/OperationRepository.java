package org.chaymaab.demoescqrsspringaxon.query.repository;

import org.chaymaab.demoescqrsspringaxon.query.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation,Long> {
    List<Operation> findByAccountId(String accountId);
}
