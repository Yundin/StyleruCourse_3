package styleru.org.courseexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventsFeedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EventRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_feed);

        adapter = new EventRecyclerAdapter(this);

        recyclerView = (RecyclerView) findViewById(R.id.rv_event_feed);
        recyclerView.setAdapter(adapter);


//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, true));
    }

    @Override
    protected void onStart() {
        super.onStart();

        List<EventsItem> events = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            events.add(new EventsItem("Ивент", "Лорем ипсум",
                    "http://www.businessdigezt.com/wp-content/uploads/2015/07/Businessman-Trophy.jpg",
                    "2008-06-15T21:15:07.0000000", "Кирпич 322"));
            events.add(new EventsItem("Ивент 2", "Лорем ипсумfefrbverversgvs",
                    "http://www.businessdigezt.com/wp-content/uploads/2015/07/Businessman-Trophy.jpg",
                    "2008-06-15T21:15:07.0000000", "Кирпич 122"));
        }
        adapter.setData(events);
        adapter.notifyDataSetChanged();
    }
}
