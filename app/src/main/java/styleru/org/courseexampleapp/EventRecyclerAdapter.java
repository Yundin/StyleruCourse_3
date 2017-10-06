package styleru.org.courseexampleapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class EventRecyclerAdapter
        extends RecyclerView.Adapter<EventRecyclerAdapter.ViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    private List<EventsItem> data;

    EventRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        data = new ArrayList<EventsItem>();
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Создаем вью и вьюхолдер из лэйаута
        View view = inflater.inflate(R.layout.recycleritem_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        EventsItem item = data.get(position);
        viewHolder.tvName.setText(item.getTitle());
        viewHolder.tvDescription.setText(item.getSubtitle());
        viewHolder.tvAddress.setText(item.getLocation());
        viewHolder.tvDateTime.setText(item.getDateTime());
        //Загружаем изображение в ImageView с помощью библиотеки
        Glide
                .with(context)
                .load(item.getImageUrl())
                .placeholder(R.color.cardview_dark_background)
                .into(viewHolder.ivBackground);
    }

    public List<EventsItem> getData() {
        return data;
    }

    public void setData(List<EventsItem> data) {
        this.data = data;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDescription;
        TextView tvDateTime;
        TextView tvAddress;
        ImageView ivBackground;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            tvDateTime = (TextView) itemView.findViewById(R.id.tv_date_time);
            tvAddress = (TextView) itemView.findViewById(R.id.tv_address);
            ivBackground = (ImageView) itemView.findViewById(R.id.iv_background);
        }
    }
}
