/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HH
 */
public class Test {
    static LaoDong[] x = new LaoDong[5];
    static Scanner s = new Scanner(System.in);
    
    private static void fakedata(){
        x[0] = new LaoDong(1, "Nguyen Van Chien", 5);
        x[1] = new LaoDong(2, "Nguyen Van A", 15);
        x[2] = new LaoDong(3, "Nguyen Van B", 10);
        x[3] = new LaoDong(4, "Nguyen Van C", 30);
        x[4] = new LaoDong(5, "Nguyen Van D", 20);
            
    }
    
    private static void update(){
        boolean found = false;
        System.out.printf("\n\nVui long nhap ten lao dong can sua: ");
        String str;
        str = s.nextLine();
        String st = str.toUpperCase();
        for(int i =0;i<5;i++){
            if(st.equals(x[i].getTenLD())){
                System.out.println("Vui long sua thong tin lao dong");
                x[i].nhap();
                found = true;
            }
        }
        if(found ==false){
            System.out.println("khong co thong tin\n\n");
        }
       
    }
    
    private static void Luongcaonhat(){
        System.out.println("Lao dong co luong cao nhat la");
        x[0].printitle();
        Comparator<LaoDong> l = Comparator.comparingLong(LaoDong::tinhluong);
        Arrays.sort(x,l);
        for(int i=4;i>=0;i--){
            if(x[i].tinhluong()==x[4].tinhluong()){
                x[i].printdata();
            }
        }
    }
    
   
       
  
    public static void main(String[] args) {
        fakedata();
        x[0].printitle();
        for(int i =0;i<5;i++){
            x[i].printdata();
        }
        update();
   //     fakedata();
       Luongcaonhat();
        
    }
    
}
