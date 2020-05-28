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
public class TaseronSirket {
     
    
    String[] ekipAdları={"Ekip 1","Ekip 2","Ekip 3"};
    ArrayList<TaseronPersonel> t1=new ArrayList<>();
    ArrayList<TaseronPersonel> t2=new ArrayList<>();
    ArrayList<TaseronPersonel> t3=new ArrayList<>();
    
    public TaseronSirket(){
    t1=ekip1Ekle();
    t2=ekip2Ekle();
    t3=ekip3Ekle();
    }
   
     ArrayList<TaseronPersonel> ekip1Ekle(){
     TaseronPersonel p1=new TaseronPersonel("Hakan", "Yıldırım", 91,5000,"Asci");
     TaseronPersonel p2=new TaseronPersonel("Rıdvan", "Gökcen", 92,5000,"Muhasebe");
     TaseronPersonel p3=new TaseronPersonel("Selin", "Kavak", 93,5000,"Tasarimci");
     ArrayList<TaseronPersonel> a1=new ArrayList<>();
     a1.add(p1);
     a1.add(p2);
     a1.add(p3);
     return a1;
    }
      ArrayList<TaseronPersonel> ekip2Ekle(){
     TaseronPersonel p1=new TaseronPersonel("Ecem", "Arel", 94,5000,"Asci");
     TaseronPersonel p2=new TaseronPersonel("Aylin", "Solmaz", 95,5000,"Avukat");
     TaseronPersonel p3=new TaseronPersonel("Rıfkı", "Polat", 96,5000,"Tasarimci");
     ArrayList<TaseronPersonel> a1=new ArrayList<>();
     a1.add(p1);
     a1.add(p2);
     a1.add(p3);
     return a1;
    }
      ArrayList<TaseronPersonel> ekip3Ekle(){
     TaseronPersonel p1=new TaseronPersonel("Nihat", "Aydın", 97,5000,"Asci");
     TaseronPersonel p2=new TaseronPersonel("Deniz", "Tasdelen", 98,5000,"Avukat");
     TaseronPersonel p3=new TaseronPersonel("Erdil", "Yılmaz", 99,5000,"Muhasebe");
     ArrayList<TaseronPersonel> a1=new ArrayList<>();
     a1.add(p1);
     a1.add(p2);
     a1.add(p3);
     return a1;
    }
     
     
     
}
