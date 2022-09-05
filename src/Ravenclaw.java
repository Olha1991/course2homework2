public class Ravenclaw  extends Hogwarts{
    private int r1;
    private int r2;
    private int r3;

    public Ravenclaw(String name, int witchcraft, int transgression, int r1, int r2, int r3) {
        super(name, witchcraft, transgression);
        this.r1 =r1;
        this.r2 =r2;
        this.r3 =r3;
        checkingValues(new int[]{r1, r2, r3});

        System.out.println(" Мудрость = " + r1 + " баллов, остроумие = " + r2 + " баллов, творчество = " + r3 + " баллов.");
    }

    public void checkingValues (int[] r){
        int [] values = {r1, r2, r3};

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0 || values[i] > 100) {
                throw new RuntimeException("Значение превышено");
            }
        }
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public static void comparison2StudentsR (Ravenclaw student1,Ravenclaw student2){
        int sumPower1 = student1.r1 + student1.r2 + student1.r3;
        int sumPower2 = student2.r1 + student2.r2 + student2.r3;
        if (sumPower1 > sumPower2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sumPower1 < sumPower2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println("Силы " + student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}

