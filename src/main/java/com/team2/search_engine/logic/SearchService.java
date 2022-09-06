package com.team2.search_engine.logic;

import com.team2.search_engine.data.repository.SearchRepository;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    private SearchRepository searchRepository ;
    public SearchService(SearchRepository searchRepository) {

        this.searchRepository = searchRepository;


    }

    public SearchField Parse(String msg){

        Class type;
        String field,operator, value;

        SearchField searchField = new SearchField(type, field, operator, value);

        return searchField;
    }

}
