package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "Russia", 456));
        carList.add(new Car("Toyota", "Japan", 358));
        carList.add(new Car("Hyundai", "Korea", 369));
        carList.add(new Car("Bmw", "Germany", 555));
        carList.add(new Car("Lifan", "China", 789));
    }

    @Override
    public List<Car> getCarListCount(int count) {
        if (count >= 5) {
            return carList;
        } else {
            List<Car> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                list.add(carList.get(i));
            }
            return list;
        }
    }

    @Override
    public List<Car> getCarListAll() {
        return carList;
    }
}
