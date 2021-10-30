package com.company;

public class Modeule2 {
    public void chemistry(){
        String chems[]={"Organic chemistry "," Physical chemistry "," Biochemistry"," Inorganic chemistry"," Polymoer chemistry"};
        System.out.println(" The books available in chemistry department are as follows");
        for(int i=0;i<chems.length;i++){
                System.out.println(chems[i]);
        }
    }
public void physics(){
    String phy[]={"Mechanics "," Dysnamics","Solid State Physics"," Astro Physics "," Electromagnetism"};
        System.out.println(" The books available in Physics  department are as follows");
        for(int i=0;i<phy.length;i++){
        System.out.println(phy[i]);
    }
}

    public void Biology(){
        String bio[]={"Zoology","Botany","Medical Science"," xyz"," abc"};
        System.out.println(" The books available in Physics  department are as follows");
        for(int i=0;i<bio.length;i++){
            System.out.println(bio[i]);
        }
    }



}
