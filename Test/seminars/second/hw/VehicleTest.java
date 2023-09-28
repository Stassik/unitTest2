package seminars.second.hw;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
//
//     - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)

    Car car = new Car("Bmw", "X4", 2012);
    Motorcycle moto = new Motorcycle("Hyundai", "Click", 2008);
    @BeforeEach
    @Test
    void carInstanceOfVehicleTest () {
        assertInstanceOf(Vehicle.class, car);
    }
//     - проверка того, объект Car создается с 4-мя колесами
    
    @Test
    void carNumWheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

//     - проверка того, объект Motorcycle создается с 2-мя колесами

    @Test
    void motoNumWheelsTest() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
//     - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void carSpeedTest(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
//     - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())

    @Test
    void motoSpeedTest(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
//     - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void carStopTest(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

//     - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)

    @Test
    void motoStopTest(){
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}