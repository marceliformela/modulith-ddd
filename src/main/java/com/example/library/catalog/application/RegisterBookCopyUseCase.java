package com.example.library.catalog.application;

import com.example.library.UseCase;
import com.example.library.catalog.domain.BarCode;
import com.example.library.catalog.domain.BookId;
import com.example.library.catalog.domain.Copy;
import com.example.library.catalog.domain.CopyRepository;
import jakarta.validation.constraints.NotNull;

@UseCase
public class RegisterBookCopyUseCase {
    private final CopyRepository copyRepository;

    public RegisterBookCopyUseCase(CopyRepository copyRepository) {
        this.copyRepository = copyRepository;
    }

    public void execute(@NotNull BookId bookId, @NotNull BarCode barCode) {
        copyRepository.save(new Copy(bookId, barCode));
    }
}
