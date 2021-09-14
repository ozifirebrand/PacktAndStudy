package ExercisingFromPacktAndOnline;

public class Container {
    private class InnerContent {
        public void print() {
            System.out.println("This is an inner class.");
        }
    }

    void printContent() {
        InnerContent what = new InnerContent();
        what.print();
    }
}


class InnerClassImplementation {

    public static void main(String[] args) {
        Container container = new Container();
        container.printContent();
    }
}