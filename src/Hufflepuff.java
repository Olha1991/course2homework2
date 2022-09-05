public class Hufflepuff extends Hogwarts{

    private int h1;
    private int h2;
    private int h3;

    public Hufflepuff(String name, int witchcraft, int transgression, int h1, int h2, int h3) {
        super(name, witchcraft, transgression);
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        checkingValues(new int[]{h1, h2, h3});

        System.out.println(" Трудолюбие = " + h1 + " баллов, верность = " + h2 + " баллов, честь = " + h3 + "баллов.");
    }

    public void checkingValues (int[] h){
        int [] values = {h1, h2, h3};

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0 || values[i] > 100) {
                throw new RuntimeException("Значение превышено");
            }
        }
    }


    public int getH1() {
        return h1;
    }

    public void setH1(int h1) {
        this.h1 = h1;
    }

    public int getH2() {
        return h2;
    }

    public void setH2(int h2) {
        this.h2 = h2;
    }

    public int getH3() {
        return h3;
    }

    public void setH3(int h3) {
        this.h3 = h3;
    }

    public void sumPoints1Hufflepuff (){
        int sum1 = h1 + h2 + h3;
        System.out.print("У " + getName() + " сумма баллов равна " + sum1);
    }
    public void sumPoints2Hufflepuff () {
        int sum2 = h1 + h2 + h3;
        System.out.println(", а у " + getName() + " – " + sum2);
    }

    public static void comparison2StudentsH (Hufflepuff student1, Hufflepuff student2){
        int sumPower1 = student1.h1 + student1.h2 + student1.h3;
        int sumPower2 = student2.h1 + student2.h2 + student2.h3;
        if (sumPower1 > sumPower2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sumPower1 < sumPower2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println("Силы " + student1.getName() + " и " + student2.getName() + " равны.");
        }
    }

}
