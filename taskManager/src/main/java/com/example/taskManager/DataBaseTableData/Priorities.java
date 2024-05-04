package com.example.taskManager.DataBaseTableData;

public enum Priorities {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(5);
    private final int value;

    Priorities(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
