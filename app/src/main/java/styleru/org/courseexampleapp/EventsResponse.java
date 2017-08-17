package styleru.org.courseexampleapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tetawex on 06.03.17.
 */

public class EventsResponse {
    @Expose
    @SerializedName("data")
    private List<EventsItem> data;

    public List<EventsItem> getData() {
        return data;
    }

    public void setData(List<EventsItem> data) {
        this.data = data;
    }
}
