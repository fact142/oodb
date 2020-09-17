import java.util.ArrayList;


public class MusicList {
    private String title;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private String description;
    private Person author;
    private int duration;
    private int amount;

    public MusicList(String title, String description, Person author, Song ...songs){
        this.title = title;
        this.description = description;
        this.author = author;
        ArrayList<Song> songList = new ArrayList<Song>();
        int amount = 0;
        int duration = 0;
        for(Song song: songs){
            songList.add(song);
            amount++;
            duration += song.getDuration();
        }
        this.songs = songList;
        this.amount = amount;
        this.duration = duration;
    }

    public String fromSec(int duration) {
        String str = "";
        int hours = duration / 3600;
        int minutes = (duration - hours * 3600) / 60;

        if (hours > 0 && hours != 11 && hours != 12 && hours != 13 && hours != 14) {
            switch (hours % 10) {
                case 1:
                    str = str + Integer.toString(hours) + " час ";
                    break;
                case 2:
                case 3:
                case 4:
                    str = str + Integer.toString(hours) + " часа ";
                    break;
                default:
                    str = str + Integer.toString(hours) + " часов ";
                    break;
            }
        } else if (hours > 0) {
            str = str + Integer.toString(hours) + " часов ";
        }
        if (minutes != 11 && minutes != 12 && minutes != 13 && minutes != 14) {
            switch (minutes % 10) {
                case 1:
                    str = str + Integer.toString(minutes) + " минута ";
                    break;
                case 2:
                case 3:
                case 4:
                    str = str + Integer.toString(minutes) + " минуты ";
                    break;
                default:
                    str = str + Integer.toString(minutes) + " минут ";
                    break;
            }
        } else {
            str = str + Integer.toString(hours) + " часов ";
        }
          return str;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongList() {
        return songs;
    }

    public String getDescription() {
        return description;
    }

    public Person getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public int getAmount() {
        return amount;
    }
}