package com.team2.search_engine.data.model;

import com.team2.search_engine.data.entity.PurchaseOrder;

// Predicate
public class SearchField {
    private final Class<?> type; // table
    private final String field; // type
    private final String operator; // operate
    private final String value; // target

    public SearchField(String type, String field, String operator, String value) {
        this.type = determineClassType(type);
        this.field = covertSearchType(field);
        this.operator = operator;
        this.value = value;
    }

    private String covertSearchType(String field) {
        if (field.matches("[Bb][a-zA-Z ]*[Tt]")) {
            return "bu";
        } else if (field.matches("[Rr][a-zA-Z ]*[Tt]")) {
            return "rd";
        }
        return field;
    }


    public Class<?> determineClassType(String type) {
        return PurchaseOrder.class;
    }

    public Class<?> getType() {
        return this.type;
    }

    public String getField() {
        return this.field;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getValue() {
        return this.value;
    }
}
