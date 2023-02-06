/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo11;

/**
 *
 * @author LENOVO
 */
public class percobaan5 {
    public static void main(String[] args) {
        int bil = 10;
        
        try{
            System.out.println(bil / 0);
        }
        catch(ArithmeticException e){
            System.out.print("Pesan Error: ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e){
            System.out.println("Ini menghandle error yang terjadi");
        }   
    }
}
