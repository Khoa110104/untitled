package oop.designpattern.observer;

public class TestObserver {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        EmailNotifier emailNotifier = new EmailNotifier(videoData);
        PhoneNotifier phoneNotifier = new PhoneNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);
        emailNotifier.Notify(videoData, emailNotifier);

        System.out.println("--------------------------------------------");
        videoData.setTitle("Observer Design Pattern");
        videoData.detachObserver(youtubeNotifier);

        System.out.println("--------------------------------------------");
        videoData.setDescription("Khoa's video");


    }
}
