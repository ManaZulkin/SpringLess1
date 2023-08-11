package entety;

import interfaces.Quest;

public class Serch implements Quest {
    public String name;
    public double revard;

    public Serch(String name, double revard) {
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
