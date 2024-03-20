abstract class ArithmeticOperation {
    abstract void operate();
}

class Addition extends ArithmeticOperation {
    void operate() {
        System.out.println("Addition");
    }
}

class Subtraction extends ArithmeticOperation {
    void operate() {
        System.out.println("Subtraction");
    }
}

class Multiplication extends ArithmeticOperation {
    void operate() {
        System.out.println("Multiplication");
    }
}

class Division extends ArithmeticOperation {
    void operate() {
        System.out.println("Division");
    }
}

class AbstractExample {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        add.operate();
        sub.operate();
        mul.operate();
        div.operate();
    }
}