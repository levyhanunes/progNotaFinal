package Exercicio3.Desafio3.application;

//imports
import java.util.Locale; //locale
import java.util.Scanner; //scanner
import Exercicio3.Desafio3.entities.Student; //student


public class Program {

    //inicio do prog
    public static void main(){
        Locale.setDefault(Locale.US); //import locale
        Scanner sc = new Scanner(System.in); //import scanner

        Student student = new Student();


        //input nome
        System.out.println("Digite o Nome");
        student.name = sc.nextLine();

        //input grade1
        System.out.println("Nota grade 1");
        student.grade1 = sc.nextDouble();

        //input grade 2
        System.out.println("Nota grade 2");
        student.grade2 = sc.nextDouble();

        //input grade 3
        System.out.println("Nota grade 3");
        student.grade3 = sc.nextDouble();

        //logica out resultado
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close(); //close scanner
    }
}
