import java.util.ArrayList;

public class Singer extends Person {
    String description;
    ArrayList<Album> Albums = new ArrayList<Album>();

    public Singer(String name, String description) {
        super(name);
        this.description = description;
    }

    public Album createAlbum(String title, String description, Song ...songs){
        Album album = new Album(title, description, this, songs);

        Albums.add(album);

        return album;
    }

    public ArrayList<Album> getAlbums() {
        return Albums;
    }
}
