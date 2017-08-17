package styleru.org.courseexampleapp;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static String baseUrl = "http://api.in.styleru.org/api/";
    private ApiInterface apiInterface;

    public ApiService()
    {
        this(baseUrl);
    }

    public ApiService(String baseUrl)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);  
    }

    public ApiInterface getApiInterface()
    {
        return apiInterface;
    }

}
