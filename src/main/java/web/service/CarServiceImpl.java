package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(Integer count) {
    //    count = Math.min(count, 5);
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
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
