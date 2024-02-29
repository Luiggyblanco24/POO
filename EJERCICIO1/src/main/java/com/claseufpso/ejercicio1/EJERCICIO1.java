package com.claseufpso.ejercicio1;

public class EJERCICIO1 {

    public static void main(String[] args) {
        Characther homero = new Characther("homero",30 ,'m' ,"a la grande le puse cuca");
        homero.saySomething();
        
        Characther bart = new Characther("bartolomeo",10 ,'m' ,"ay caramba");
        bart.saySomething();
        
    }
    
    static class Characther{
        String name;
        int age;
        char gender;
        String phrase;

        public Characther(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase=phrase;
        }
        
        void saySomething(){
            System.out.println(this.phrase );
        
        }
    }
}
