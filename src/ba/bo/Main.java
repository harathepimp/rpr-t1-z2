package ba.bo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Unesite broj n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int suma=0;
        //suma = sumaCifara(n);

        for(int i=1; i<n; i++){
            if(djeljiv(i, sumaCifara(i)) == true) System.out.println(i + " ");
        }
        //System.out.println("Suma cifara: " + suma);


    }
    public static int sumaCifara(int x){
        int suma=0;
        while(x>0){
            suma = suma + (x%10);
            x = x/10;
        }
        return suma;
    }
    public static boolean djeljiv(int x, int y){
        if((x%y)==0) return true;
        return false;
    }
}
