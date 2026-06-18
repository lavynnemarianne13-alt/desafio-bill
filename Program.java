import java.util.Scanner;

public class Program{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        Bill bill=new Bill();

        System.out.print("Sexo: ");
        bill.gender=sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.berr=sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink=sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecure=sc.nextInt();

        System.out.println("RELATORIO ");
        System.out.printf("CONSUMO = R$%.2f\n", bill.feeding());
        if (bill.feeding() < 30){
            System.out.printf("COUVERT = R$%.2f\n", bill.cover());
        }else{
            System.out.println("INSENTO DE COUVERT");
        }
        System.out.printf("INGRESSO = R$%.2f\n", bill.ticket());
        System.out.printf("VALOR A PAGAR = R$%.2f\n", bill.total());
        
        sc.close();
	}
}