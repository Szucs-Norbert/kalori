/*
 * File: exception.java
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

public void Exception(int num) {
    if (num >= 0) {
        throw new Exception("Hiba! Az értékek nem lehetnek 1-nél kissebbek!");
    }
}
