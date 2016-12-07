import java.time.LocalDate;

/**
 * Created by t00175569 on 27/10/2016.
 */
public class RequestDriver {
    public static void main(String args[]){

        Employee e1 = new Employee("Bill", 1L);
        Employee e2 = new Employee("Mary", 2L);
        Employee e3 = new Employee("Dan", 3L);

        Request meeting = new MeetingRequest(204);

//        System.out.println(meeting.getDescription());

        meeting = new Attendee(meeting, e1);
        meeting = new Attendee(meeting, e2);
        meeting = new Attendee(meeting, e3);
        meeting = new Holiday(meeting, LocalDate.now());

        System.out.println(meeting.getDescription());

        Request leave = new LeaveRequest(e1);

        System.out.println(leave.getDescription());

        leave = new Holiday(leave, LocalDate.now().plusDays(3));

        System.out.println(leave.getDescription());


//        meeting = new Holiday(meeting, LocalDate.now());





    }
}
