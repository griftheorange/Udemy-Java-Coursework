package com.griffinpoole;

public final class Moon extends HeavenlyBody {
    private String bodyType = "MOON";

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    public String getBodyType() {
        return bodyType;
    }
}
