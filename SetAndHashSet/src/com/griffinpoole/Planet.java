package com.griffinpoole;

public final class Planet extends HeavenlyBody {
    private String bodyType = "PLANET";

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    public String getBodyType() {
        return bodyType;
    }
}
