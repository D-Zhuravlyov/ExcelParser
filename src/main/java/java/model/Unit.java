package java.model;

import java.util.Arrays;

/**
 * Created by nofuruct on 18.05.15.
 */
public class Unit {

    private int id;

    private String name;

    private double[] values;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getValues() {
        return values;
    }

    public void setValues(double[] values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unit unit = (Unit) o;

        if (id != unit.id){
            return false;
        }
        if (!name.equals(unit.name)){
            return false;
        }
        if (!Arrays.equals(values, unit.values)){
            return false;
        }

        return true;
    }
}

