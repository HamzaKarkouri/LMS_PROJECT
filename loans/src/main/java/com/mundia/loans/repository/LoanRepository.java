package com.mundia.loans.repository;

import com.mundia.loans.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUserId(Long userId);
    List<Loan> findByBookId(Long bookId);
    List<Loan> findByReturnDateIsNull(); // Active loans
}
