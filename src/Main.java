
public class Main {
    public static void main(String[] args) {

        System.out.println("На факультете Gryffindor учатся: ");
        Gryffindor[] students1 = {
                new Gryffindor("Harry Potter", 89, 18, 16, 8, 43),
                new Gryffindor("Hermione Granger", 37, 56, 55, 35, 66),
                new Gryffindor("Ron Weasley", 23, 13, 78, 65, 34),
        };

        System.out.println();
        System.out.println("На факультете Slytherin учатся: ");
        Slytherin[] students2 = {
                new Slytherin("Draco Malfoy", 47, 45, 23, 13, 39, 57, 24),
                new Slytherin("Graham Montague", 46, 33, 8, 23, 15, 12, 54),
                new Slytherin("Gregory Goyle", 34, 23, 14, 25, 53, 5, 6),
        };

        System.out.println();
        System.out.println("На факультете  Hufflepuff учатся: ");
        Hufflepuff[] students3 = {
                new Hufflepuff("Zacharias Smith", 35, 57, 45, 3, 23),
                new Hufflepuff("Cedric Diggory", 76, 22, 67, 31, 8),
                new Hufflepuff("Justin Finch-Fletchley", 41, 33, 34, 67, 45),
        };

        System.out.println();
        System.out.println("На факультете  Ravenclaw учатся: ");
        Ravenclaw[] students4 = {
                new Ravenclaw("Cho Chang", 54, 87, 23, 45, 15),
                new Ravenclaw("Padma Patil", 25, 12, 34, 65, 9),
                new Ravenclaw("Marcus Belby", 16, 78, 33, 19, 20),
        };

        System.out.println();
        Gryffindor.comparison2StudentsG(students1[1], students1[2]);
        Slytherin.comparison2StudentsS(students2[1], students2[2]);
        Hufflepuff.comparison2StudentsH(students3[0], students3[1]);
        Ravenclaw.comparison2StudentsR(students4[2], students4[1]);
        Hogwarts.comparison2StudentsHogwarts(students1[0], students2[0]);


    }




}