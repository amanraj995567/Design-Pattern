package Problems.MeetingScheduler.models;

import java.util.List;
import java.util.PrimitiveIterator;

public class Schedular {
    private  Calender calender;
    private List<MeetingRoom> rooms;
    private User user;

    private  static Schedular schedularInstance = null;
    private Schedular(){}

    public  static Schedular getInstance(){
        if(schedularInstance==null){
            schedularInstance = new Schedular();

        }
        return schedularInstance;
    }

    public  boolean scheduleMeeting(List<User>users , Interval interval){
        return true;
    }

    public boolean bookRoom(MeetingRoom room, int numberOfPerson, Interval interval){
        return true;
    }

    public boolean cancelMeeting(List<User>users , Interval interval){
        return true;
    }

    public  boolean releaseRoom(MeetingRoom room, Interval interval){
        return true;
    }



}
