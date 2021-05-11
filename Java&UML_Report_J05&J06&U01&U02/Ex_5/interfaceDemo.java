interface Vehicle{
    public void start(int parameter);
    public void stop(int parameter);
}

class Bike implements Vehicle{
    public void start(int parameter){
        System.out.println("The bike starts at "+parameter);
    }
    public void stop(int parameter){
        System.out.println("The bike stops at "+parameter);
    }
}

class Bus implements Vehicle{
    public void start(int parameter){
        System.out.println("The bus starts at "+parameter);
    }
    public void stop(int parameter){
        System.out.println("The bus stops at "+parameter);
    }
}

public class interfaceDemo {
    public static void main(String[] args){
        Bike bike=new Bike();
        bike.start(1);
        bike.stop(2);
        Bus bus=new Bus();
        bus.start(3);
        bus.stop(4);
    }
}