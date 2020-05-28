/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje11;

import java.util.ArrayList;

/**
 *
 * @author WIN-7 PC
 */
public class Personel {
    String ad,soyad;
    int id,maasMiktar;
    String birimadı;
    
    boolean durum=false;
    ArrayList<String> izinGünleri=new ArrayList<>();
    ArrayList<String> resmiIzınler=new ArrayList<>();
    ArrayList<String> ekIzınler=new ArrayList<>();
    String mesai(){
        String mesai="Calisiyor"; 
        if (durum==true) {     
            mesai="İzinli";
        }
        return mesai;
    }

    public Personel() {
    }

    public Personel(String ad, String soyad,String birimadı,boolean durum) {
        this.ad = ad;
        this.soyad = soyad;
        this.birimadı=birimadı;
        this.durum = durum;
    }

    public void setMaasMiktar(int maasMiktar) {
        this.maasMiktar = maasMiktar;
    }

    public int getMaasMiktar() {
        return maasMiktar;
    }
    
    
}
