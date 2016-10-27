/**
 * Created by t00175569 on 27/10/2016.
 */
public class RequestDriver {
    public static void main(String args[]){

        Employee e1 = new Employee("Bill", 1L);
        Employee e2 = new Employee("Mary", 2L);
        Employee e3 = new Employee("Dan", 3L);

        Request meeting = new MeetingRequest(204);

        System.out.println(meeting.getDescription());

        meeting = new Attendee(meeting, e1);
        meeting = new Attendee(meeting, e2);
        meeting = new Attendee(meeting, e3);

        System.out.println(meeting.getDescription());


    }
}
