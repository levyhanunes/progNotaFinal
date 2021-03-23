package Exercicio3.Desafio3.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    //metodos

    //grade final
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    //quantificar pontos
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
}
