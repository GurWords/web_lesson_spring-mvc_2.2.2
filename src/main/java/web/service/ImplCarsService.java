package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ImplCarsService implements CarsService {
    private static ImplCarsService instance = null;

    private ImplCarsService(){}

    public static ImplCarsService getInstance() {
        if (instance == null) {
            instance = new ImplCarsService();
        }
        return instance;
    }

    @Override
    public List<Car> SelectAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car.Builder()
                .withName("car1")
                .withSeries(1)
                .withSize(1)
                .build());
        carList.add(new Car.Builder()
                .withName("car2")
                .withSeries(2)
                .withSize(2)
                .build());
        carList.add(new Car.Builder()
                .withName("car3")
                .withSeries(3)
                .withSize(3)
                .build());
        carList.add(new Car.Builder()
                .withName("car4")
                .withSeries(4)
                .withSize(4)
                .build());
        carList.add(new Car.Builder()
                .withName("car5")
                .withSeries(5)
                .withSize(5)
                .build());
        return carList;
    }
}
