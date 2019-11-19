/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import beans.Participant;
import beans.User;

/**
 *
 * @author Admin
 */
public class Config {
    private static User user = null;

    private static Participant[] participants = null;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Config.user = user;
    }

    public static Participant[] getParticipants() {
        return participants;
    }

    public static void setParticipants(Participant[] participants) {
        Config.participants = participants;
    }


}
