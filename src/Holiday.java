import java.time.LocalDate;

/**
 * Created by t00175569 on 27/10/2016.
 */
public class Holiday extends RequestDecorator{

    Request request;
    LocalDate date;
    int weight = 1;

    public Holiday(Request request, LocalDate date){
        this.request= request;
        this.date= date;
    }

    @Override
    public String getDescription() {
        return request.getDescription() + "\nLeave Type = Holiday\nLeave Date = " + date;
    }

    public int getWeight(){
        return weight;
    }
}
