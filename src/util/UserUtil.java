/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Participant;
import beans.User;
import java.util.Scanner;
import config.*;

/**
 *
 * @author Admin
 */
public class UserUtil {

    public static User login(String username, String password) {
        if ("Sahil".equals(username) && "12345".equals(password)) {
            User user = new User(username, password);
            return user;
        } else {
            throw new IllegalArgumentException("Istifadeci adi ve ya parol sehvdir!");
        }
    }

    public static User requireInputsAndLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Istifadeci adinizi daxil edin:");
        String username = sc.nextLine();
        System.out.println("Parolunuzu daxil edin:");
        String password = sc.nextLine();

        User user = login(username, password);
        Config.setUser(user);

        return user;
    }

    public static User requireInputsAndLogin(int tryCount, boolean throwException) {
        for (int i = 0; i < tryCount; i++) {
            try {
                User user = requireInputsAndLogin();
                return user;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Yeniden cehd edin!");
            }
        }
        if (throwException) {
            throw new IllegalArgumentException("Siz sistemden kenarlashdirildinz!");
        }
        return null;
    }
}
