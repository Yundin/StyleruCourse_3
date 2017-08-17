package styleru.org.courseexampleapp;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
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
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);  
    }

    public ApiInterface getApiInterface()
    {
        return apiInterface;
    }

}
