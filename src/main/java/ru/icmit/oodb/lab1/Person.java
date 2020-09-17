import java.util.ArrayList;


public class Person {
    private String name;
    private ArrayList<MusicList> myPlaylists = new ArrayList<MusicList>();

    public Person(String name){
        this.name = name;
    }

    public MusicList createPlaylist(String title, String description, Song ...songs){
        MusicList playlist = new MusicList(title, description, this, songs);

        myPlaylists.add(playlist);

        return playlist;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MusicList> getMyPlaylists() {
        return myPlaylists;
    }
}
