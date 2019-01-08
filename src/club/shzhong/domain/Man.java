package club.shzhong.domain;

public class Man {

    private Car car;

    public Man(Car car) {
        this.car = car;
    }

    public void driveCar() {

        System.out.println("i'm driving car");
    }
}
