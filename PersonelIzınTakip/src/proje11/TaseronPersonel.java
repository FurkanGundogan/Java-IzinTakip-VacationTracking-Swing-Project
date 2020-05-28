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
public class TaseronPersonel extends Personel{
    
    public TaseronPersonel(){
    
    }
    public TaseronPersonel(String ad,String soyad,int id,int maas,String birimadı){
      this.ad=ad;
      this.soyad=soyad;
      this.id=id;
      this.maasMiktar=maas;
      this.birimadı=birimadı;
       this.izinGünleri.add("Cumartesi");
    this.izinGünleri.add("Pazar");
    }

    
}
