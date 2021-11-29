/*
 * File: App.java
 * Created Date: 2021-11-29 08:20:34
 * Author:Szűcs Norbert
 * Github: https://github.com/Szucs-Norbert
 *
 *         
 * -----
 * Last Modified: 2021-11-29
 * Modified By: Szűcs Norbert
 * -----
 * Copyright (c) 2021 Szűcs Norbert
 * Group: Szoft II/N
 * 
 * GNU GPL v2
 */

public class App {
    public static void main(String[] args) throws Exception {
        Kalori kalori = new Kalori();
        kalori.getDatas();
        System.out.println("Férfi kalória:");
        System.out.println(kalori.calcKaloriaFerfi());
        System.out.println("Nő kalória:");
        System.out.println(kalori.calcKaloriaNo());

        System.out.println("Hello, World!");  
    
    }
}
