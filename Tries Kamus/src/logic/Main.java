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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node root = new Node();
        Node.insert(root, "eat", "makan");
        Node.insert(root, "ear", "kuping");
        Node.insert(root, "election", "pemilu");
        Node.insert(root, "easy", "gampang");
        Node.insert(root, "electronic", "elektronik");
        Node.insert(root, "abstract", "gajelas");
        Node.insert(root, "abort", "batal");
        Node.insert(root, "a", "kata sambung untuk huruf mati");
        Node.insert(root, "abroad", "di luar negeri");
        Node.insert(root, "abs", "anti lock braking system");
        Node.insert(root, "amazing", "menabjubkan");
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("__________________\nKAMUS");
            System.out.print("Masukan kata : ");
            String awalan = input.nextLine();
            Node.tampilkan(root, awalan);
        }
    }
    
}
