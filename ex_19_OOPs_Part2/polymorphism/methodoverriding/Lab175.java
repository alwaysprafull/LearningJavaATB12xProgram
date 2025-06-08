package ex_19_OOPs_Part2.polymorphism.methodoverriding;

public class Lab175 {

    public static void main(String[] args) {
        Prafull p = new Prafull();
        p.home();
        p.p1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Prafull();
        f2.home();


    }

}
