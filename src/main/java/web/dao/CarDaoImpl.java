package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCars(int count) {

        if (count >= 5) {
            return getAllCars();
        } else {
            return getAllCars().stream().limit(count).collect(Collectors.toList());
        }
    }


    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(0, new Car("car1", 7, "V8"));
        carList.add(1, new Car("car2", 2, "V8"));
        carList.add(2, new Car("car3", 5, "V12"));
        carList.add(3, new Car("car4", 5, "V6"));
        carList.add(4, new Car("car5", 3, "V6"));
        return carList;
    }
}
