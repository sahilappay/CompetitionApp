/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import beans.Participant;
import beans.User;
import util.FileUtil;


import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Config implements Serializable {

    private  User user = null;

    private  Participant[] participants = null;

    public Config() {
    }

    public Config(User user) {
        this.user = user;
    }

    public  User getUser() {
        return user;
    }

    public  void setUser(User user) {
        this.user = user;
        Initialization.refreshConfig();
    }

    public  Participant[] getParticipants() {
        return participants;
    }

    public  void setParticipants(Participant[] participants) {
        this.participants = participants;
        Initialization.refreshConfig();
    }


}
