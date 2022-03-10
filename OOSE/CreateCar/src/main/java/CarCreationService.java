public class CarCreationService {

    public Car CreateTesla(String Model){

        Car car = new Car();
        car.setModel(Model);
        car.setMake("Tesla");
        return car;
    }


    public Car CreateFord(String Model){

        Car car = new Car();
        car.setModel(Model);
        car.setMake("Ford");
        return car;
    }

}