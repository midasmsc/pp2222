package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getCarList(Integer count) {
        if (count < 0) {
            return carList;
        }
        return carlist.stream()
                .limit(count)
                .toList();
    }

    private final List<Car> carlist = new ArrayList<>(List.of(
            new Car("Tesla", "White", 2018),
            new Car("Mercedes", "Black", 2020),
            new Car("Haval", "Blue", 2023),
            new Car("BMW", "Gray", 1995),
            new Car("Toyota", "Red", 2015)
    ));
}
