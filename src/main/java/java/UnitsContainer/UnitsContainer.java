package java.UnitsContainer;

import java.model.Unit;
import java.util.*;

/**
 * Created by nofuruct on 18.05.15.
 */
public class UnitsContainer {

    private List<Unit> units;

    public UnitsContainer() {
        if(units == null) {
            new HashSet<Unit>();
        }


    }


    public Unit getValueById(int id) {
        Iterator iterator = units.iterator();
        Unit unit = (Unit) iterator.next();
        while(iterator.hasNext()){
        units
        }


    }

    public void addValue(Unit unit){
        units.add(unit);
    }

    public void removeValue(Unit unit){
        units.remove(unit);
    }


}
