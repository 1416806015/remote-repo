package d19_abstract2;

import java.sql.Struct;

public abstract class Animal {
    private String name;

    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
