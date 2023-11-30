abstract public class Bank {
    abstract int interestRate();
}
class BOC extends Bank {
    @Override
    int interestRate() {
        return 8;
    }
}
class HNB extends Bank {
    @Override
    int interestRate() {
        return 10;
    }
}
class testRun {
    public static void main(String[] args) {
        Bank b;
        b = new BOC();
        System.out.println("Rate of Interest BOC " + b.interestRate() +"%");
        b = new HNB();
        System.out.println("Rate of Interest HNB " + b.interestRate() + "%");
    }
}
