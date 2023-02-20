/*
 * You do not need to manipulate anythin in this class. 
 * Please analyze this code and answer the questions in Quiz.java
 */

public class Vehicle {
    int currentSpeed;
    String make;
    String model;

    int accelerate(){
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    String honk(){
        return "HONNNK";
    }

}
