package com.madv.moikar.domain;

public enum BoxType {
    SMALL ("Бокс только для леговых и SUV"),
    MEDIUM ("Средний"),
    BIG ("Большой"),
    AUTO ("Автоматический"),
    SELF ("Самообслуживание");

    private String comment;
    BoxType(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
