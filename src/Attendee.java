/**
 * Created by t00175569 on 27/10/2016.
 */
public class Attendee extends RequestDecorator {

    Request request;
    Employee employee;

    public Attendee(Request request, Employee employee){
        this.request = request;
        this.employee = employee;
    }


    @Override
    public String getDescription() {
        return request.getDescription() + "\nAttendee = " + employee.getName();
    }
}
