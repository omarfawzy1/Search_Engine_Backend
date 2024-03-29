package com.team2.search_engine.data.repository;

import com.team2.search_engine.data.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// The combined repository of custom repository and the jpa repository
@Repository
public interface SearchRepository extends CustomPurchaseOrderRepository, JpaRepository<PurchaseOrder, String> {
}
