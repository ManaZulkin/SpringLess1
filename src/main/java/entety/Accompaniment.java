package entety;

import interfaces.Quest;

public class Accompaniment implements Quest {
    public String name;
    public double revard;

    public Accompaniment(String name, double revard) {
        this.name = name;
        this.revard = revard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRevard() {
        return revard;
    }

    public void setRevard(double revard) {
        this.revard = revard;
    }

}
