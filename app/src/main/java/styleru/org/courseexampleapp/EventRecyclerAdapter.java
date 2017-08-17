package styleru.org.courseexampleapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Created by tetawex on 08.08.17.
 */

public class EventRecyclerAdapter extends BaseRecyclerAdapter<EventsItem, EventRecyclerAdapter.ViewHolder> {
    public EventRecyclerAdapter(Context context) {
        super(context);
    }

    @Override
    protected void bindSingleItem(ViewHolder viewHolder, EventsItem item) {
        //Биндим данные
        viewHolder.tvName.setText(item.getTitle());
        viewHolder.tvDescription.setText(item.getSubtitle());
        viewHolder.tvAddress.setText(item.getLocation());
        viewHolder.tvDateTime.setText(item.getDateTime());
        //Для даты и времени сначала используем форматирование
        /*String fullDateTimeString = new DateTime(item.getDateTime())
                .toString(DateTimeFormat.longDate());
        viewHolder.tvDateTime.setText(new DateTime(item.getDateTime())
                .toString()
                .substring(0, fullDateTimeString.length() - 8)
                + ", " + new DateTime(item).toString("HH:mm"));*/

        //Загружаем изображение во ImageView с помощью библиотеки
        Glide
                .with(context)
                .load(item.getImageUrl())
                .placeholder(R.color.cardview_dark_background)
                .into(viewHolder.ivBackground);
    }

    @Override
    protected ViewHolder createVH(View view) {
        return new ViewHolder(view);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.recycleritem_event;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
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
