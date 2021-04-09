package lt.bit.java.intro.lt.bit.java.uzdavinys.mokinys;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.print("Student");

        Student s1 = new Student();
        s1.grupe = 4;
        s1.firstName = "Petras";
        s1.lastName = "Petraitis";

        Student s2 = new Student(3, "Jonas", "Jonaitis");

        Student[] masyvas = {
                s1,
                s2,
                new Student(6, "Antanas", "Antanaitis"),
                new Student(2, "Ona", "Onyte")
        };

        System.out.println(Arrays.toString(masyvas));
        Student tuscias;

        int i;
        for (i = 0; i < masyvas.length - 1; i++) ;
        for (int j = i + 1; j < masyvas.length; j++) {
            if (compareTo(masyvas[i], masyvas[j]) > 0) {
                tuscias = masyvas[i];
                masyvas[i] = masyvas[j];
                masyvas[j] = tuscias;
            }
        }
        System.out.println(i + ":" + Arrays.toString(masyvas));
    }

    static int compareTo(Student a, Student b) {
        // boolean r = a >b;

        //lyginame grupes

        if (a.grupe > b.grupe) return 1;
        else if (a.grupe > b.grupe) return -1;

        // a.grupe == b.grupe
        // lyginu pavarde,nes grupe yra lygios
        int r = a.lastName.compareTo(b.lastName);
        if (r != 0) return -r;

        // jei r == 0 ,t.y jei lastName lugios
        r = a.firstName.compareTo(b.firstName);
        return r;
    }
}


class Student {
    int grupe;
    String firstName;
    String lastName;

    public Student() {

    }

    public Student(int grupe, String firstName, String lastName) {
        this.grupe = grupe;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return grupe + " " + firstName + " " + lastName + " ";
    }
    // static void compare(int a, int b) {
    //     boolean r = a >b;
    //     return;
    // }

}

