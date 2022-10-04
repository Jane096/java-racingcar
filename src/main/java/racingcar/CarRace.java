package racingcar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarRace {
    private final List<Car> cars;

    public CarRace(int numberOfCars) {
        this.cars = Stream.generate(Car::new)
                .limit(numberOfCars)
                .collect(Collectors.toList());
    }

    public void race() {
        cars.forEach(Car::move);
    }

    public List<Car> getCars() {
        return cars;
    }
}