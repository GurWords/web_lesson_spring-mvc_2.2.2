package web.model;

public class Car {
    String name;
    int series;
    int size;
    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public static class Builder{
        Car car;
        public Builder(){
            car = new Car();
        }
        public Builder withName(String name){
            car.name = name;
            return this;
        }
        public Builder withSeries(int series){
            car.series = series;
            return this;
        }
        public Builder withSize(int size){
            car.size = size;
            return this;
        }
        public Car build(){
            return car;
        }
    }
}
