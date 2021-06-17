package br.com.antonio.neves;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> temperatura_semestre = new ArrayList<>();

        double soma_temp = 0.0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a temperatura do mês " + i);
            double temp = in.nextDouble();
            temperatura_semestre.add(temp);
            soma_temp += temp;
        }

        System.out.println(temperatura_semestre);
        double media_temp_sem = (soma_temp / temperatura_semestre.size());
        System.out.println("A média da temperatura nos 6 meses foi de " + media_temp_sem + " oC");

        System.out.println("---------------------------------------------------------");

        System.out.println("Os meses que tiveram a temperatura acima da média semestral foram: ");

        for (double temp : temperatura_semestre) {
            if (temp > media_temp_sem) {
                int index = temperatura_semestre.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println("JANEIRO - com temperatura de " + temp + " oC");
                        break;
                    case 1:
                        System.out.println("FEVEREIRO - com temperatura de " + temp + " oC");
                        break;
                    case 2:
                        System.out.println("MARÇO - com temperatura de " + temp + " oC");
                        break;
                    case 3:
                        System.out.println("ABRIL - com temperatura de " + temp + " oC");
                        break;
                    case 4:
                        System.out.println("MAIO - com temperatura de " + temp + " oC");
                        break;
                    case 5:
                        System.out.println("JUNHO - com temperatura de " + temp + " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
