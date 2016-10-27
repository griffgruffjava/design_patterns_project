import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Finbar on 27/10/2016.
 */
public class MeetingRequest extends Request {

    private int roomNum;

    public MeetingRequest(int roomNum) {

        this.roomNum = roomNum;
        description = "Meeting Request for " + roomNum;
    }

}
