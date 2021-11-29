/*
 * File: Input.java
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

import java.util.Scanner;

public class Input {
    static Scanner scanner;
    public static double input(String message) {
        scanner = new Scanner(System.in);
        System.out.print(message + ": ");
        double num = scanner.nextDouble();
        return num;
    }
}

