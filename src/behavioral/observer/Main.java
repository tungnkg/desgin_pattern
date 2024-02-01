package behavioral.observer;

import behavioral.observer.notifier.EmailNotifier;
import behavioral.observer.notifier.FacebookNotifier;
import behavioral.observer.notifier.PhoneNotifier;
import behavioral.observer.notifier.YoutubeNotifier;

public class Main {
    public static void main(String[] args){
        VideoData videoData = new VideoData();
        EmailNotifier emailNotifier = new EmailNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);
        PhoneNotifier phoneNotifier = new PhoneNotifier(videoData);

        videoData.setTittle("Vlog đầu tiên của kênh!");

        videoData.removeObserver(phoneNotifier);
        System.out.println("------------------------------------");
        videoData.setDescription("Mọi người nhớ ủng họ mình nha");

        FacebookNotifier facebookNotifier = new FacebookNotifier(videoData);

        System.out.println("------------------------------------");
        videoData.setFileName("Nhớ like and sub giúp mình nhé kk");



    }
}
