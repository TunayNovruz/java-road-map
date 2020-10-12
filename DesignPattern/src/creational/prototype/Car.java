/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.prototype;

public class Car implements Cloneable {
    public String model;
    public int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    Car(Car car) {
        if (car != null) {
            this.model = car.model;
            this.year = car.year;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

   /*
   public Car clone(){
        return new Car(this);
    }
    */

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
