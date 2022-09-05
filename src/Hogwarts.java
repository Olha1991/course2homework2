import java.util.Objects;

public class Hogwarts {

    private String name;
    private int witchcraft;
    private int transgression;



    public Hogwarts(String name, int witchcraft, int transgression) {
        checkingValues1( witchcraft);
        checkingValues2(transgression);
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;

        System.out.print (name + " - Сила магии = " + witchcraft + " баллов и трансгрессия = " + transgression + " баллов.");
    }

    public void checkingValues1(int witchcraft) {
        if (witchcraft < 0 || witchcraft > 100) {
            throw new RuntimeException("Значение превышено");
        }
    }
   public void checkingValues2( int transgression) {
        if(transgression < 0 || transgression > 100){
            throw new RuntimeException("Значение превышено");
        }
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft() {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression() {
        this.transgression = transgression;
    }

    public static void comparison2StudentsHogwarts (Hogwarts student1, Hogwarts student2){
        int sumPower1 = student1.witchcraft + student1.transgression;
        int sumPower2 = student2.witchcraft + student2.transgression;
        if(sumPower1 > sumPower2){
            System.out.println(student1.name + " обладает бОльшей мощностью магии, чем " + student2.name);
        } else if (sumPower1 < sumPower2){
            System.out.println(student2.name + " обладает бОльшей мощностью магии, чем " + student1.name);
        } else {
            System.out.println("Силы " + student1.name + " и " + student2.name + " равны.");
        }


    }



    //Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
}
