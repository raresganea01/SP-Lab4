package entities.playlist;

import entities.base.playlist_element.PlaylistElement;
import entities.base.title.TitleImpl;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl extends TitleImpl implements Playlist {
    protected final List<PlaylistElement> elements;

    public PlaylistImpl(String title, PlaylistElement... elements) {
        super(title);
        this.elements = new ArrayList<>(List.of(elements));
    }

    public PlaylistImpl(String title, List<PlaylistElement> elements) {
        super(title);
        this.elements = new ArrayList<>(elements);
    }

    @Override
    public int getSizeInKB() {
        return elements
                .stream()
                .map(PlaylistElement::getSizeInKB)
                .reduce(0, Integer::sum);
    }

    @Override
    public List<PlaylistElement> getElements() {
        return elements;
    }

    @Override
    public void add(PlaylistElement element) {
        elements.add(element);
    }
}
