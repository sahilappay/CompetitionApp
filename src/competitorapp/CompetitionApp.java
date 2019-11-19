/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitorapp;

import util.MenuUtil;
import util.UserUtil;
import beans.*;

/**
 *
 * @author Admin
 */
public class CompetitionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User user = UserUtil.requireInputsAndLogin(3,true);
        System.out.println("Salam, "+user.getUsername()+"!");
        MenuUtil.showMenu();
    
    }  
}
