package com.example.library.lending.application;

import com.example.library.UseCase;
import com.example.library.lending.domain.Loan;
import com.example.library.lending.domain.LoanId;
import com.example.library.lending.domain.LoanRepository;

@UseCase
public class ReturnBookUseCase {

    private final LoanRepository loanRepository;

    public ReturnBookUseCase(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public void execute(LoanId loanId) {
        Loan loan = loanRepository.findByIdOrThrow(loanId);
        loan.returned();
    }
}
