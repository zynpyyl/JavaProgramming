package week12;

public class Value {
    public int parameter;
    public boolean wasModified;
    public boolean wasConstructor;

    public Value(int parameter){
        this.parameter = parameter;
        wasConstructor=true;
    }
    public Value() {
    }

    public void setValue(int parameter){
        this.parameter=parameter;
        wasModified=true;
    }

    public boolean wasModified(){
        return wasModified;
    }
    public int getValue(){
         return parameter;
    }

    public String toString() {
        return "Value{" +
                "parameter=" + parameter +
                ", wasModified=" + wasModified +
                ", wasConstructor=" + wasConstructor +
                '}';
    }
}
/*
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
 it getVal returns the last value passed to setVal. Otherwise if the "single int parameter"
 constructor was used to create the object, getVal returns the value passed to that constructor.
 Otherwise getVal returns 0.
 */