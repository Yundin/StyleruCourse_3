package styleru.org.courseexampleapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("allEvents")
    Call<EventsResponse> getEvents(@Body EventsRequest request);
}
