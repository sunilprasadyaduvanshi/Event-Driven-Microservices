package com.eventdriven.repository;

import com.eventdriven.entity.LoanDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanDO, Long> {
}
