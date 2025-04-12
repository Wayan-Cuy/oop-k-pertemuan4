/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydimensi;

import java.util.Scanner;

/**
 *
 * @author usetr
 */
public class ArrayDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "Wayan";
        nama[1] = "Susrama";
        nama[2] = "Saja";
        nama[3] = "Hebat";
        nama[4] = "Luar";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx =0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx)+": ");
            nama[idx] = inp.nextLine();
        }
        
        String NamaTeman = nama[2];
        System.out.printf("Data Teman: %s\n", nama[2]);
        
        for(int idx =0; idx<5; idx++ ){
            System.out.println("Data Teman ke-"+String.valueOf(idx)+": "+nama[idx]);
        }
        for (String nm : nama) {
            System.out.println(nm);
        }
    }
    
}
