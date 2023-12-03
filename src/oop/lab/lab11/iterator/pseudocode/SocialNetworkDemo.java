package oop.lab.lab11.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SocialNetworkDemo {
    private static SocialNetwork network;
    private static SocialSpammer spammer;

    public static void main(String[] args) {
        System.out.println("BasicStatistics Iterator Drive:");
        config();
        sendSpamToFriends("linhdeptrai04@gmail.com");
        System.out.println("Send Spam To Friends Successfully!!!");
        System.out.println("\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        sendSpamToCoworkers("linhdeptrai04@gmail.com");
        System.out.println("Send Spam To Workers Successfully!!!");
        System.out.println("--------The End--------");
    }

    public static void config() {
        Scanner sc = new Scanner(System.in);
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("linhdeptrai04@gmail.com", "linhdeptrai04@gmail.com", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "mad_max@ya.com", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "bill@microsoft.eu", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "avanger@ukr.net", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "sam@amazon.com", "coworkers:linhdeptrai04@gmail.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "catwoman@yahoo.com", "friends:linhdeptrai04@gmail.com", "friends:sam@amazon.com"));
        data.add(new Profile("heybro@edu.vn", "nonever@hus.com", "friends:linhdeptrai04@gmail.com", "coworkers:linhdeptrai04@gmail.com"));
        System.out.println("Please choose 1 option: (Default is Facebook)");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = sc.nextLine();
        if (choice.equals("2")) {
            network = new LinkedIn(data);
        } else {
            network = new Facebook(data);
        }
        spammer = new SocialSpammer();
    }

    public static void sendSpamToFriends(String profileId) {
        System.out.println("\nIterating over friends...\n");
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "Very important message");
    }

    public static void sendSpamToCoworkers(String profileId) {
        System.out.println("\nIterating over coworkers...\n");
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "Very important message");
    }
}


