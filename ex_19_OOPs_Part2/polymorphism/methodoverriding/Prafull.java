package ex_19_OOPs_Part2.polymorphism.methodoverriding;

public class Prafull extends Father {
    void p1(){
        System.out.println("Prafull - p1");
    }

    @Override
    void home(){
        System.out.println("Prafull - 3BHK");
    }

}
