package behavioral.observer.notifier;

import behavioral.observer.VideoData;
import behavioral.observer.base.Observer;
import behavioral.observer.base.Subject;

public class FacebookNotifier extends Observer {
    public FacebookNotifier(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void notify(Subject subject, Object args) {
        if(subject instanceof VideoData){
            System.out.println("Notify all subscribers via Facebook with new data" +
                    "\nTitle: " + (((VideoData) subject).getTittle() == null ?"":((VideoData) subject).getTittle())
                    + "\nDescription: " + (((VideoData) subject).getDescription() == null ?"":((VideoData) subject).getDescription())
                    + "\nFileName: " + (((VideoData) subject).getFileName() == null ?"":((VideoData) subject).getFileName())
                    +"\n"
            );
        }
    }
}
