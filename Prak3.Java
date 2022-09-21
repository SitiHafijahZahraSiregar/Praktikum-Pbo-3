package praktikum3_ara;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Praktikum3_Ara {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
       // System.out.print("Masukkan nilai : ");
        //int nilai = input.nextInt();
        
        //if(nilai >= 76){
          //  System.out.println("Anda Lulus!");
        //}else if(nilai >=71){
          //  System.out.println("Nilai anda B+");
        //}else{
          //  System.out.println("Nilai anda tidak memenuhi!");
        
        //if else huruf_mutu
        Scanner input = new Scanner(System.in);
        do{
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        char huruf_mutu;
        
        if(nilai >= 76){
            huruf_mutu = 'A';
            System.out.println(huruf_mutu);
        }else if(nilai >=71){
            huruf_mutu = 'B';
            System.out.println(huruf_mutu);
        }else if(nilai >=66){
            huruf_mutu = 'C';
            System.out.println(huruf_mutu);
        }else{
            huruf_mutu = 'D';
            System.out.println(huruf_mutu);
        }
        if (nilai >=100){
            System.out.println("Input Tidak Seusai");
        }      
         
        //switch case
        switch(huruf_mutu){
            case 'A':
                 System.out.println("Sangat Baik");
                 break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Huruf Mutu tidak sesuai");
        }  
        
        }while(true);
                      
    }
   
                
}
