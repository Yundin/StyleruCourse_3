package styleru.org.courseexampleapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventsItem {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("status")
    @Expose
    private int state;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("attendants_count")
    @Expose
    private int attendantsCount;
    @SerializedName("view_attendants")
    @Expose
    private boolean viewAttendants;

    public EventsItem(String title, String subtitle,
                      String imageUrl, String dateTime,
                      String location) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.dateTime = dateTime;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAttendantsCount() {
        return attendantsCount;
    }

    public void setAttendantsCount(int attendantsCount) {
        this.attendantsCount = attendantsCount;
    }

    public boolean isViewAttendants() {
        return viewAttendants;
    }

    public void setViewAttendants(boolean viewAttendants) {
        this.viewAttendants = viewAttendants;
    }
}
