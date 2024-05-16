/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;
 import java.util.FormattableFlags;
import java.util.Scanner;


/**
 *
 * @author HH
 */

   
public class LaoDong {
    private int maLD;
    private String tenLD;
    private int songaycong;
    private final long dongiangaycong = 100000;
    
    
    public LaoDong(int maLD, String tenLD, int songaycong) {
        this.maLD = maLD;
        this.tenLD = tenLD;
        this.songaycong = songaycong;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap ma LD: ");
        this.maLD = s.nextInt();
        s.nextLine();
        System.out.printf("Nhap ten LD: ");
        this.tenLD = s.nextLine();
        System.out.printf("Nhap so ngay cong: ");
        this.songaycong = s.nextInt();
        
    }

    public String getTenLD() {
        return this.tenLD.toUpperCase();
    }
    
    public long tinhluong(){
        if(this.songaycong >= 25) return this.songaycong * this.dongiangaycong + 1000000;
        else if(this.songaycong >=15 && this.songaycong < 25) return this.songaycong * this.dongiangaycong + 700000;
        else return this.songaycong * this.dongiangaycong;
    }
    
    
    
    public void printitle(){
        System.out.println("\t\t\tTHONG TIN NGUOI LAO DONG\n\n");
        System.out.printf("%10s%20s%15s%20s%15s\n","Ma LD","Ten LD","So ngay cong","Don gia ngay cong","Luong");
    }
    
    public void printdata(){
        System.out.printf("%10d%20s%15d%20d%15d\n",maLD,getTenLD(),songaycong,dongiangaycong,tinhluong());
    }
    
    
    
}

    
