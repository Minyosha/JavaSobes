package hw_1.number_2;


//В классе Lorry для "Moveable, Stopable" использовать "implements" и добавить "@Override void open()".
//        Так же можно заменить "extends Car" на " extends LightWeightCar".
//        В классе Car заменить Engine на String.
//        Нет psvm, которая запустит программу, соберет данные и что-то сделает


abstract class Car {
    public String engine;
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
