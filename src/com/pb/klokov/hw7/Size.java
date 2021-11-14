package com.pb.klokov.hw7;

public enum Size {
    XXS("Детский размер",32),
    XS("Взрослый размер", 34),
    S("Взрослый размер",36),
    M("Взрослый размер", 38),
    L("Взрослый размер",40);

    String description;
    Integer euroSize;

    String getDescription(Object size) {
        return description;
            }

    Integer getEuroSize(Object size) {
        return euroSize;
    }

    Size(String description, Integer euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

}


