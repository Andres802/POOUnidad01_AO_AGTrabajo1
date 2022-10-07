/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poounidad01_ao_agtrabajo1;

/**
 *
 * @author ochoa
 */
public class POOUnidad01_AO_AGTrabajo1 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 01.01");
        
        System.out.println("---------- CLASE AUTO ----------");
        
        System.out.println("1. Datos del primer Auto");
        
        var auto = new Autos();
        
        auto.Modelo = "Yaris";
        auto.Marca = "Toyota";
        auto.Año = 2008;
        auto.Color = "Blanco";
        
        System.out.println("- La marca del auto es " + auto.Marca + ", el modelo es " + auto.Modelo +" tiene el color "+ auto.Color+ " y es el año de " + auto.Año );
    
        
        System.out.println("2. Datos del segundo Auto");
        
        var auto1 = new Autos();
        
        auto1.Modelo = "X-TraiL";
        auto1.Marca = "Nisan";
        auto1.Año = 2019;
        auto1.Color="Plateado";
        
        System.out.println("- La marca del auto es " + auto1.Marca + ", el modelo es " + auto1.Modelo +" tiene el color "+ auto1.Color+ " y es el año de " + auto1.Año);
    
        
        System.out.println("3. Datos del tercer Auto");
        
         var auto2 = new Autos();
        
        auto2.Modelo = "Recon";
        auto2.Marca = "JEEP";
        auto2.Año = 2022;
        auto2.Color = "Verde Oscuro";
        
        System.out.println("- La marca del auto es " + auto2.Marca + ", el modelo es " + auto2.Modelo+" tiene el color "+ auto2.Color + " y es el año de " + auto2.Año);
    
        
        
        System.out.println("---------- CLASE PERROS ----------");
        
        System.out.println("1. El perro nuestro");
        var perro = new Perros();
        
        perro.Nombre = "Elsa";
        perro.edad = 3;
        perro.raza = "Runa";
        perro.peso = 20;
        
        System.out.println("-El perro se llama " + perro.Nombre + " que tiene "+perro.edad+ " años " + " la raza es " + perro.raza +" y su peso es " +perro.peso+" kg ");
    
        
        System.out.println("2. El perro de mi Tia");
    
        var perro1 = new Perros();
        
        perro1.Nombre = "Roco";
        perro1.edad = 5;
        perro1.raza = "Pastor Aleman";
        perro1.peso = 50;
        
        System.out.println("-El perro se llama " + perro1.Nombre + " que tiene "+perro1.edad+ " años " + " la raza es " + perro1.raza +" y su peso es " +perro1.peso+" kg ");
    
        System.out.println("3. El perro de mi Abuela");
    
        var perro2 = new Perros();
        
        perro2.Nombre = "Pelusa";
        perro2.edad = 9;
        perro2.raza = "Husky";
        perro2.peso = 50;
        
        System.out.println("-El perro se llama " + perro2.Nombre + " que tiene "+perro2.edad+ " años " + " la raza es " + perro2.raza +" y su peso es " +perro2.peso+" kg ");
    
        
        
        System.out.println("---------- CLASE COMPUTADORA ----------");
        
        System.out.println("1. Primera Computadora");
        
        var compu = new Computadoras();
        
        compu.Marcas = "HP";
        compu.Capacidad = "160 GB";
        compu.Color = "Azul";
        compu.tipo = "Laptop";
        
        System.out.println("- La marca de la computadora es " + compu.Marcas + " que tiene una capacidad de " + compu.Capacidad + " el color es " + compu.Color + " y la computadora es una " + compu.tipo);
        
        
        System.out.println("2. Segunda Computadora");
        
        var compu1 = new Computadoras();
        
        compu1.Marcas = "Macbook air";
        compu1.Capacidad = "80 GB";
        compu1.Color = "Blanco";
        compu1.tipo = "Laptop";
        
        System.out.println("- La marca de la computadora es " + compu1.Marcas + " que tiene una capacidad de " + compu1.Capacidad + " el color es " + compu1.Color + " y la computadora es una " + compu1.tipo);
    
        System.out.println("3. Tercera Computadora");
        
        var compu2 = new Computadoras();
        
        compu2.Marcas = "LG";
        compu2.Capacidad = "100 GB";
        compu2.Color = "Negro";
        compu2.tipo = "PC";
        
        System.out.println("- La marca de la computadora es " + compu2.Marcas + " que tiene una capacidad de " + compu2.Capacidad + " el color es " + compu2.Color + " y la computadora es una " + compu2.tipo);
   
        
        
        System.out.println("---------- CLASE PERSONAS ----------");
        
        System.out.println("1. Datos de identidad");
        
        var persona = new Personas();
        
        persona.Name = "Andres";
        persona.Edad = 20;
        persona.cedula = 756;
        persona.peso = 90;
        
        System.out.println(" El nombre es " + persona.Name+ " tiene "+persona.Edad + " años " + " su cedula es " + persona.cedula +" y su peso es " + persona.peso + "kg");
        
        System.out.println("2. Datos de identidad");
        
        var persona1 = new Personas();
        
        persona1.Name = "Xavier";
        persona1.Edad = 38;
        persona1.cedula =5757;
        persona1.peso = 95;
        
        System.out.println(" El nombre es " + persona1.Name+ " tiene "+persona1.Edad + " años " + " su cedula es " + persona1.cedula +" y su peso es " + persona1.peso + "kg");
        
        System.out.println("3. Datos de identidad");
        
        var persona2 = new Personas();
        
        persona2.Name = "Danielle";
        persona2.Edad = 25;
        persona2.cedula = 0656;
        persona2.peso = 120;
        
        System.out.println(" El nombre es " + persona2.Name+ " tiene "+persona2.Edad + " años " + " su cedula es " + persona2.cedula +" y su peso es " + persona2.peso + "kg");
        
    
        System.out.println("---------- CLASE JUGADORES ----------");
        
        System.out.println("1. Datos del primer Jugador");
    
        var jugador = new Jugadores();
        
        jugador.Nombre = "Lionel Messi";
        jugador.Nacionalidad = "Argentina";
        jugador.Edad = 37; 
        jugador.Equipo = "PSG";
        
        System.out.println("- El jugador se llama " + jugador.Nombre + " tiene " + jugador.Edad + " años " + " su nacionalidad es " + jugador.Nacionalidad+ " y juega en el equipo de " + jugador.Equipo);
        
         System.out.println("2. Datos del segundo Jugador");
    
        var jugador1 = new Jugadores();
        
        jugador1.Nombre = "Ering Haaland";
        jugador1.Nacionalidad = "Noruega";
        jugador1.Edad = 22; 
        jugador1.Equipo = "Manchester City";
        
        System.out.println("- El jugador se llama " + jugador1.Nombre + " tiene " + jugador1.Edad + " años " + " su nacionalidad es " + jugador1.Nacionalidad+ " y juega en el equipo de " + jugador1.Equipo);
        
         System.out.println("3. Datos del tercer Jugador");
    
        var jugador2 = new Jugadores();
        
        jugador2.Nombre = "Darwin Nuñes";
        jugador2.Nacionalidad = "Uruguay";
        jugador2.Edad = 25; 
        jugador2.Equipo = "Livepool";
        
        System.out.println("- El jugador se llama " + jugador.Nombre + " tiene " + jugador.Edad + " años " + " su nacionalidad es " + jugador.Nacionalidad+ " y juega en el equipo de " + jugador.Equipo);
        
        
        
        System.out.println("---------- CLASE BIBLIOTECA ----------");
        
        System.out.println("1. Primer Libro");
        
        var libro = new Bibliotecas();
        
        libro.nombL = "El señor de los anillos";
        libro.año = 1954;
        libro.autor = "J. R. R. Tolkien";
        libro.tipo = "Literatura";
        
        System.out.println("- El libro se llama " + libro.nombL + " fue creador por " + libro.autor + " en el año " + libro.año + " y el libro es basado en " + libro.tipo);
        
        System.out.println("2.Segundo Libro");
        
        var libro1 = new Bibliotecas();
        
        libro1.nombL = "Marvel";
        libro1.año = 1966;
        libro1.autor = "Stan Lee";
        libro1.tipo = "Comic";
        
        System.out.println("- El libro se llama " + libro1.nombL + " fue creador por " + libro1.autor + " en el año " + libro1.año + " y el libro es basado en " + libro1.tipo);
        
        System.out.println("3. Tercer Libro");
        
        var libro2 = new Bibliotecas();
        
        libro2.nombL = " Historia Universal";
        libro2.año = 2002;
        libro2.autor = " Camila Kenend";
        libro2.tipo = "Historico";
        
        System.out.println("- El libro se llama " + libro2.nombL + " fue creador por " + libro2.autor + " en el año " + libro2.año + " y el libro es basado en " + libro2.tipo);
    }
    
}
