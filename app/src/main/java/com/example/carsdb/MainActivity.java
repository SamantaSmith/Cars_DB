package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("CarsCount", String.valueOf(databaseHandler.getCarsCount()));

        /*databaseHandler.addCar(new Car(" GOVNOVOZ ", "30 000$"));
        databaseHandler.addCar(new Car(" GOVNOVOZ1 ", "40 000$"));
        databaseHandler.addCar(new Car(" GOVNOVOZ2 ", "50 000$"));
        databaseHandler.addCar(new Car(" GOVNOVOZ3 ", "60 000$"));*/

        List<Car> carList = databaseHandler.getAllCars();

        /*Car deleCar = databaseHandler.getCar(1);
        databaseHandler.deleteCar(deleCar);*/

        for (Car car : carList) {

            Log.d("CarInfo", car.getId() + car.getName() + car.getPrice());}


        /*
        car.setName("NE_GOVNOVOZ");
        car.setPrice("80 000$");

        databaseHandler.updateCar(car);

        Log.d("CarInfo", car.getId() + car.getName() + car.getPrice());*/




        }
    }

