package com.Dodon.Gatea.Saas.repository;

import com.Dodon.Gatea.Saas.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StockItemRepository extends JpaRepository<StockItem,Long> {

}
