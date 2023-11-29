package org.example;

public enum Position {
    Director("10"),
    Manager("5"),
    Security("1.5"),
    Pilot("3"),
    Stewardess("2"),
    Common_worker("1");
    private String Description;

    Position(String Description){
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }
}
