package util;

import beans.Participant;
import beans.User;
import config.Initialization;

import java.util.Scanner;

public class CompetitionUtil {
    public static Participant registerParticipant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ishtirakchinin adini daxil edin:");
        String name = sc.nextLine();

        System.out.println("Ishtirakchinin soyadini daxil edin:");
        String surname = sc.nextLine();

        System.out.println("Ishtirakchinin yashini daxil edin:");
        int age = sc.nextInt();

        Participant participant = new Participant(name, surname, age);

        return participant;
    }

    public  static Participant[] registerParticipants(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ishtirakchilarin sayini daxil edin:");
        int count = sc.nextInt();
        Participant[] participants = new Participant[count];
        for (int i = 0; i<count;i++){
            Participant participant = registerParticipant();
            participants[i] = participant;
        }
        System.out.println("Butun ishtirakchilar ugurla daxil edildi!");
        Initialization.config.setParticipants(participants);
        return participants;
    }

    public static void increaseParticipants(){
        Scanner sc = new Scanner(System.in);
        Participant[] participantsOld = Initialization.config.getParticipants();
        if (participantsOld == null){
            System.out.println(" Oops!\n" +
                    "Ishtirakchilari daxil etmeden sayini artirmaq mumkun deyil.\n" +
                    "Ilk once mininumu 1 ishtirakchi daxiledin.");
            return;
        }
        System.out.println("Neche nefer ishtirakchi elave etmek isteyirsiniz?");
        int increaseCount = sc.nextInt();

        Participant[] participantsNew = new Participant[participantsOld.length+increaseCount];

        for (int i = 0; i<participantsOld.length;i++){
            participantsNew[i] = participantsOld[i];
        }
        for (int i =participantsOld.length; i<participantsNew.length;i++){
            participantsNew[i] = registerParticipant();
        }
        System.out.println("Butun ishtirakchilar ugurla elave edildi!");
        Initialization.config.setParticipants(participantsNew);
    }

    public static void printParticipants(Participant[] participants){
        if(participants == null || participants.length == 0){
            return;
        }
        for (int i = 0; i<participants.length; i++){
            Participant p = participants[i];
            System.out.println(p);
        }
    }

    public static void printParticipants(){
        printParticipants(Initialization.config.getParticipants());
    }

    public static void startCompetition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1`den 5`e qeder bir reqem sechin (1 ve 5 daxil olmaqla):");
        int selectedNumber = sc.nextInt();
        int  systemNumber = (int) Math.round(Math.random()*5);

        if(selectedNumber == systemNumber){
            increasePoint();
            System.out.println("Tebrikler! :) Siz qalib geldiniz! Sizin xaliniz: "+Initialization.config.getUser().getPoint());
            System.out.println("Sistem terefinden sechilmish reqem: "+systemNumber);
        }else{
            System.out.println("Teessuf! :( Siz uduzdunuz! Sizin xaliniz: "+Initialization.config.getUser().getPoint());
            System.out.println("Sistem terefinden sechilmish reqem: "+systemNumber);
        }
    }

    public static void increasePoint(){
        User user = Initialization.config.getUser();
        user.setPoint(user.getPoint()+10);
    }

    public static void printPoint(){
        System.out.println("Sizin xaliniz: "+Initialization.config.getUser().getPoint());
    }
}
