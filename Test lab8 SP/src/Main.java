import  entities.media_player.MediaPlayer;
import entities.media_player.MediaPlayerImpl;
import entities.playable_element.gif.GIFImpl;
import entities.playable_element.song.SongImpl;
import entities.playable_element.video.VideoImpl;
import entities.playlist.Playlist;
import entities.playlist.PlaylistImpl;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl("Winamp");
        Playlist playlist = new PlaylistImpl("Chill");

        playlist.add(new SongImpl("Own It", 3000));
        playlist.add(new VideoImpl("Pirates of the Caribbeain", 20000));
        playlist.add(new SongImpl("Smells like Teen Spirit ", 4000));
        playlist.add(new GIFImpl("DogDoge", 500));

        mediaPlayer.add(playlist);

        System.out.println("Dimensiunea playlist-ului este de : " + mediaPlayer.getCurrentPlaylistSize() + " KB");
    }
}