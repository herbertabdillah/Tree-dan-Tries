/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Node {
    String huruf;
    String arti;
    Node[] hurufSelanjutnya = new Node[26];
    public Node(){
        huruf = "$";
        arti = "$";
    }
    public static void insert(Node root, String kata, String arti){
        prosesMasukan(root, kata, arti, 0);
    }
    public static void prosesMasukan(Node root, String kata, String arti, int posisi){
        if(posisi == kata.length()){
            root.arti = arti;
            return;
        }
        int ascii = (int)kata.charAt(posisi) - 97;
        if(root.hurufSelanjutnya[ascii] == null){
            root.hurufSelanjutnya[ascii] = new Node();
        }
        root.hurufSelanjutnya[ascii].huruf = Character.toString(kata.charAt(posisi));
        
        prosesMasukan(root.hurufSelanjutnya[ascii], kata, arti, posisi + 1);
    }
    public static void tampilkan(Node root, String awalan){
        prosesTelusur(root, awalan);
    }
    public static void prosesTelusur(Node rootTelusur, String awalan){
        int posisi = 0;
        String sebelum = "";
        while(posisi < awalan.length()){
            rootTelusur = rootTelusur.hurufSelanjutnya[((int)awalan.charAt(posisi)) - 97];
            if(rootTelusur == null){
                System.out.println("kosong");
                return;
            }
            posisi++;
            sebelum = sebelum + rootTelusur.huruf;
        }
        prosesTampilkan(rootTelusur, awalan, posisi);
    }
    public static void prosesTampilkan(Node root, String awalan, int posisi){
        if(root.arti.equals("$") == false){
            System.out.println(awalan + " : " + root.arti);
        }
        for(int i = 0; i < 26; i++){
            if(root.hurufSelanjutnya[i] == null){
                continue;
            }
            prosesTampilkan(root.hurufSelanjutnya[i], awalan + root.hurufSelanjutnya[i].huruf, posisi + 1);
        }
    }
}
