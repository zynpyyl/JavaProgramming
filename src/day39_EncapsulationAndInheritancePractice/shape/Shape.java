package day39_EncapsulationAndInheritancePractice.shape;

public class Shape {
    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("Name can not be null");
            System.exit(1);
        }
        if(name.isEmpty()){
            System.out.println("Name can not be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}



/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */