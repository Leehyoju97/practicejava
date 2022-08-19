package mentoring;

public class Output {
    private Car car;
    private Output output;

    public Output() {}

    public Output(int inputData) {
        car = new Car();
        car.setSpeed(inputData);
        output = new Output();
    }

    public void outputPrint() {
        Person person = new Person(car, output);
        System.out.println(person.findMaxCarSpeed());
    }

    public String printMax() {
        return "MAX!!!";
    }

    public String noPrintMax() {
        return "NO MAX!!!";
    }
}
