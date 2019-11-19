package util;

import beans.Participant;
import config.Config;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Emeliyyati sechin:\n"
                    + "1.Ishtirakchilari daxil edin.\n"
                    + "2.Ishtirakchilarin sayini artir.\n"
                    + "3.Ishtirakchilara bax.\n"
                    + "4.Yarishmaya bashla.\n"
                    + "5.Xalima bax.\n"
                    + "6.Sistemden chix.\n"
                    + "7.Proqramdan chix.");
            int selectedMenu = sc.nextInt();
            if(selectedMenu == 1){
                Participant[] participants = CompetitionUtil.registerParticipants();
                CompetitionUtil.printParticipants(participants);
            }else if (selectedMenu == 2){
                CompetitionUtil.increaseParticipants();
            }else if (selectedMenu == 3){
                CompetitionUtil.printParticipants();
            }else if (selectedMenu == 4){
                CompetitionUtil.startCompetition();
            }else if (selectedMenu == 5){
                CompetitionUtil.printPoint();
            }else if (selectedMenu == 6){
                UserUtil.requireInputsAndLogin(3,true);
            }else if (selectedMenu == 7){
                System.out.println("Proqramdan chixildi!");
                System.exit(0);
            }else{
                System.out.println("Yalnish sechim!");
                continue;
            }

        }
    }
}
