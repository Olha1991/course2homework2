public class Gryffindor extends Hogwarts {
    private int g1;
    private int g2;
    private int g3;

    public Gryffindor(String name, int witchcraft, int transgression, int g1, int g2, int g3) {
        super(name, witchcraft, transgression);
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        checkingValues(new int[]{g1, g2, g3});


        System.out.println(" Благородство = " + g1 + " баллов, честь = " + g2 + " баллов, храбрость = " + g3 + " баллов.");
    }

    public void checkingValues(int[] g) {
        int[] values = {g1, g2, g3};

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0 || values[i] > 100) {
                throw new RuntimeException("Значение превышено");
            }
        }
    }

    public int getG1() {
        return g1;
    }

    public void setG1(int g1) {
        this.g1 = g1;
    }

    public int getG2() {
        return g2;
    }

    public void setG2(int g2) {
        this.g2 = g2;
    }

    public int getG3() {
        return g3;
    }

    public void setG3(int g3) {
        this.g3 = g3;
    }

    public void sumPoints1Gryffindor (){
        int sum1 = g1 + g2 + g3;
        System.out.print("У " + getName() + " сумма баллов равна " + sum1);
    }
    public void sumPoints2Gryffindor () {
        int sum2 = g1 + g2 + g3;
        System.out.println(", а у " + getName() + " – " + sum2);
    }
    public static void comparison2StudentsG (Gryffindor student1, Gryffindor student2) {
        int sumPower1 = student1.g1 + student1.g2 + student1.g3;
        int sumPower2 = student2.g1 + student2.g2 + student2.g3;
        if (sumPower1 > sumPower2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sumPower1 < sumPower2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println("Силы " + student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}






