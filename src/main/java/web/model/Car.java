package web.model;

public class Car {

    private String model;

    private int series;

    private String engine;

    public Car(String model, int series, String engine) {
        this.model = model;
        this.series = series;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", engine='" + engine + '\'' +
                '}';
    }
}
