package com.claseufpso.ejercicio1;
import people.Characther;

public class EJERCICIO1 {

    public static void main(String[] args) {
        Characther homero = new Characther("homero",30 ,'m' ,"a la grande le puse cuca");
        homero.saySomething();
        
        Characther bart = new Characther("bartolomeo",10 ,'m' ,"ay caramba");
        bart.saySomething();
        
        Characther apu = new Characther();
        apu.setName("apu");
        apu.setPhrase("vuelvas prontos");
        apu.saySomething();
        
    }
}
