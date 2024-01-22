/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tengku
 */
public class Model {
    private int jam;
    private int mnt;
    private int dtk;
    
    //Constructor
    public Model(int jam,int mnt,int dtk){
        this.jam = jam;
        this.mnt = mnt;
        this.dtk = dtk;
    }
    
    public Model(){
    }
    
    //Getter & Setter
    public int getJam(){
     return jam;
    }
    public void setJam(int jam){
        this.jam = jam;
    }
    public int getMenit(){
        return mnt;
    }
    public void setMenit(int mnt){
        this.mnt = mnt;
    }
    public int getDetik(){
        return dtk;
    }
    public void setDetik(int dtk){
        this.dtk = dtk;
    }
    
}
