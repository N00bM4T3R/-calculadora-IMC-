import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       System.out.println("qual o nome do paciente ?");
       String nome = sc.nextLine();
       System.out.println("peso do paciente(KG):");
       Double peso = sc.nextDouble();
       System.out.println("qual a altura do paciente(M):");
       Double altura = sc.nextDouble();
        dados dd = new dados(peso, altura);

        if (dd.Cal(peso, altura) < 18.5) {
            System.out.println("peso: " + peso + " classificação: magreza|| obesidade grau : 0");
        }
        else if ( 18.5 <= dd.Cal(peso, altura ) && dd.Cal(peso, altura) <24.9 ) {
            
            System.out.println("peso: " + peso + " classificação: Normal || obesidade grau : 0");

        }
              else if (dd.Cal(peso, altura) > 25 && dd.Cal(peso, altura) < 29.9) {
                System.out.println("peso: " + peso + " classificação: sobrepeso || obesidade grau : I");

              }
                    else if (dd.Cal(peso, altura) > 30 && dd.Cal(peso, altura) < 39.9) {
                        System.out.println("peso: " + peso + " classificação: obesidade  || obesidade grau : II");
                    }
                         else if (dd.Cal(peso, altura) > 40) {
                            System.out.println("peso: " + peso + " classificação: obesidade grave  || obesidade grau : III");
                         }
        sc.close();

    } 
}
