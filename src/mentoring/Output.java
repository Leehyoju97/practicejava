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

    private void printMax() {
        System.out.println("MAX!!");
    }

    private void noPrintMax() {
        System.out.println("NO MAX!!");
    }
}
