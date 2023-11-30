abstract public class Languages {
    Languages(){
        System.out.println("Python Programing");
    }
    abstract void programing();
    void branching() {
        System.out.println("Conditional");
    }
}
interface c{}
interface d{}
interface e{}
class Java extends Languages implements c,d,e {
    @Override
    void programing() {
        System.out.println("Java Programing");
    }
}
class Test2 {
    public static void main(String[] args) {
        Languages l = new Java();
        l.programing();
        l.branching();
    }
}
