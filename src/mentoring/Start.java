package mentoring;

public class Start {

    public static void run() {
        Car car = new Car(Input.inputData());
        Person person = new Person(car);
        Output output = new Output(person);
        output.print();
    }
}
