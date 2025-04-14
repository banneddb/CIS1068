import java.util.ArrayList;

class Vid {
    String title;
    String uploader;
    int views;
    int likes;
    int dislikes;
    double duration;
    ArrayList<String> commentsArray = new ArrayList<>();

    public Vid(String vidTitle, String vidUploader, double vidDuration) {
        this.title = vidTitle;
        this.uploader = vidUploader;
        this.duration = vidDuration;   
    }

    public void play() {
        System.out.println("Now playing: " + title);
    }
    public void like() {
        likes++;
    }
    public void dislike() {
        dislikes++;
    }
    public void addComment(String comment) {
        commentsArray.add(comment); 
    }
    public String toString() {
        return
        "Title: " + title
        + ", Uploader: " + uploader 
        + ", Duration: " + duration + " minutes"
        + ", Views: " + views
        + ", Likes: " + likes
        + ", Dislikes: " + dislikes
        + ", Comments: " + commentsArray;

    }
}
