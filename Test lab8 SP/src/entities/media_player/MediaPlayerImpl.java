package entities.media_player;

import entities.base.title.TitleImpl;
import entities.playlist.Playlist;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerImpl extends TitleImpl implements MediaPlayer {
    protected final List<Playlist> playlistList;

    public MediaPlayerImpl(String title, Playlist... playlists) {
        super(title);
        playlistList = new ArrayList<>(List.of(playlists));
    }

    public MediaPlayerImpl(String title, List<Playlist> playlistList) {
        super(title);
        this.playlistList = new ArrayList<>(playlistList);
    }

    @Override
    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    @Override
    public void add(Playlist playlist) {
        playlistList.add(playlist);
    }

    @Override
    public int getCurrentPlaylistSize() {
        try {
            return playlistList.get(0).getSizeInKB();
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }


}
