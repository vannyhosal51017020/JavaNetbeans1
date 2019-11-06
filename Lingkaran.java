/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author Hosal- PC
 */
 
import java.io.*;
public class Lingkaran {
  private double radius;
  public Lingkaran (double radius){
      this.radius=radius;
  }
  public void Luas(){
      double luas= 3.14*radius*radius;
      System.out.println("Luas lingkaran : "+luas);
  }
  public void Keliling(){
      double keliling= 2.0*3.14*radius;
      System.out.println("Keliling Lingkaran: "+keliling);
  }
  public static void main(String[] args)throws Exception{
      DataInputStream dis= new DataInputStream(System.in);
      System.out.print("input radius: ");
      String input= dis.readLine();
      double i= Double.parseDouble(input);
      Lingkaran A= new Lingkaran(i);
      A.Luas();
      A.Keliling();
  }
    }

