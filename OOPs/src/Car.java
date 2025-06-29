public class Car {
    private String make = " Maruti " ;
    private String model = " Model ZXi";
    private String color = "White";
    private  int doors;
    private boolean convertible ;

    public String getMake() {
return make ;    }

    public void setMake(String make) {
        if ( make == null ) make = "unknown";
        String lowercasemake = make.toLowerCase();
        switch (lowercasemake){
            case "holden", "porsche" ,"tesla" -> this.make = make ;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getColor() {
        return  color;
    }

    public String getModel() {
        return  model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void discribeCar() {
        System.out.println( doors + " -Doors"
        + color + " "  +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
