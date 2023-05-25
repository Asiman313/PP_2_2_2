package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private ArrayList<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "Black", "Germany"));
        cars.add(new Car("Mitsubishi", "Gray", "Japan"));
        cars.add(new Car("Lada", "White", "Russia"));
        cars.add(new Car("Mercedes", "Black", "Germany"));
        cars.add(new Car("Honda", "White", "Japan"));
    }

    @Override
    public List<Car> countCars(Integer count) {
        if (count == null || count == 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
