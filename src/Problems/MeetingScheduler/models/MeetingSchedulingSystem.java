package Problems.MeetingScheduler.models;

import java.util.List;

public class MeetingSchedulingSystem {
    private Schedular schedular;
    private List<User> users;

    private List<MeetingRoom>meetingRooms;

    private static MeetingSchedulingSystem instances= null;

    private MeetingSchedulingSystem (){}

    public static MeetingSchedulingSystem getInstance(){
        if(instances==null){
             instances = new MeetingSchedulingSystem();
        }
        return  instances;
    }


    public  void sendInvitaionNotification(List<User> users, Interval interval){

    }

    public void sendCancelNotification(List<User> users, Interval interval){

    }

    public void addRoom(MeetingRoom room){

    }

    public void removeRoom(MeetingRoom room){

    }
}
