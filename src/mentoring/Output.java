package mentoring;

public class Output {
    private Person person;

    public Output(Person person) {
        this.person = person;
    }

    public void print() {
        if(person.isMaxCarSpeed()) {
            printMax();
        } else{
            noPrintMax();
        }
    }

    public void printMax() {
        System.out.println("MAX!!");
    }

    public void noPrintMax() {
        System.out.println("NO MAX!!");
    }
}
