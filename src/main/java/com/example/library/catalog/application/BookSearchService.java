package com.example.library.catalog.application;

import com.example.library.catalog.domain.Isbn;

public interface BookSearchService {
    BookInformation search(Isbn isbn);
}
