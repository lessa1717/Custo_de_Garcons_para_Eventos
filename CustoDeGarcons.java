
import java.util.Scanner;
public class CustoDeGarcons {




        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int qtdGarcom, qtdHoras;
            double custoTotal, custoHoras;

            System.out.println("Por favor digite a quantidade de garçons que você vai precisar: ");
            qtdGarcom = sc.nextInt();
            System.out.println("Por favor digite a quantidade de horas que você vai precisar: ");
            qtdHoras = sc.nextInt();

            custoHoras = (qtdGarcom*10.50);
            custoTotal = (custoHoras*qtdHoras);

            System.out.println("O seu custo para esse evento será de : " + custoTotal + " de acordo os dados que você inseriu!");
        }
    }


