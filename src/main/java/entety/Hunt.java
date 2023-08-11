package entety;

import interfaces.Quest;

public class Hunt implements Quest {
public String name;

    public Hunt(String name, double revard) {
        this.name = name;
        this.revard = revard;
    }

    public double revard;

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
