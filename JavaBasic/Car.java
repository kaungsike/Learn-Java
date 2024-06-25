package JavaBasic;

public class Car {
    String type;
    String model;
    int sinc;

    Car(String type,String model){
        this.type = type;
        this.model = model;
    }
    Car(String type){
        this.type = type;
    }

    Car(int sinc){
        this.sinc = sinc;
    }

    void showInfo(){
        System.out.println("Type "+ type);
        System.out.println("Model "+ model);
    }

}
