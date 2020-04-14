package com.griffinpoole;

public final class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        return false;
    }
}
