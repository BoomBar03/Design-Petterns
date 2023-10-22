package components;

import cars.Car;

public class TripComputer {
    private Car car;
    public void setCar(Car car){
        this.car=car;
    }
    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("CAr is started");
        }
        else{
            System.out.println("CAr isnt't started");
        }
    }
}
