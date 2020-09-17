public class Song {
    private String title;
    private Singer singer;
    private int duration;
    private int rating = 0;

    public Song(String title, Singer singer, int duration){
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }
    public void play(){rating++;}

    public String getTitle() {
        return title;
    }

    public Singer getSinger() {
        return singer;
    }

    public int getDuration() {
        return duration;
    }
}
        