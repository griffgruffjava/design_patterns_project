import java.time.LocalDate;
import java.util.List;

/**
 * Created by Finbar on 27/10/2016.
 */
public class LeaveRequest extends Request {

    private Employee employee;

    public LeaveRequest(Employee employee) {

        this.employee = employee;
        description = "Leave Request for " + employee.getName();
    }
}
