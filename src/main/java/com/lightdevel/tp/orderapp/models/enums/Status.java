package com.lightdevel.tp.orderapp.models.enums;

public enum Status {
    PLACED,	CONFIRMED,SHIPPED,	DELIVERED;

    public static Status fromString(String val) {
        for(Status s: Status.values()) {
            if (s.name().equals(val)) {
                return s;
            }
        }
        return PLACED;
    }
}
