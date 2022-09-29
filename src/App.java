 package lista2_6;
 import java.util.Scanner;

 public class main {
    
    public static void main(String[] args) {
    
     double c=0, t=0, p=0, tp=0;
     int d= 0, x=1, v=1;
     Scanner entrada = new Scanner (System.in);
     System.out.println(" Digite o valor da conta: ");
     c= entrada.nextDouble(); 
     System.out.println(" Digite o valor da dose: ");
     d= entrada.nextInt();
        do{
        System.out.println(" Deseja ouvir mais um modao: 1-Sim  2-Nao");
        v= entrada.nextInt();
          if(v==1){
            t= c+(d*x);
            p= 0.1*t;
            tp= p+t;
            System.out.println("Valor total:"+tp);
            System.out.println("Valor 10%:"+p);
            ++x;
            }
        }while (v==1);
    }   
}