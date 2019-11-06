/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hosal- PC
 */
class B extends A {
    private int z;
    public void getJumlah(){
        System.out.println("jumlah:"+ (x+y+z));
    }
    public void setZ(int z){
        this.z = z; }

    public void setX(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}