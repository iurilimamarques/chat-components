package com.chatcomponents;

public enum UserStatus {

    ENABLED("E", "User enabled"),
    DISABLED("D", "User disabled"),
    USER_VALIDATION("V", "User's email validation");

    private final String description;
    private final String value;

    private UserStatus(String value, String description) {
        this.description = description;
        this.value = value;
    }
}