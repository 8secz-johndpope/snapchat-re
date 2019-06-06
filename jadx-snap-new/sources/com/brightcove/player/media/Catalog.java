package com.brightcove.player.media;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventEmitterImpl;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.model.Playlist;
import com.brightcove.player.model.Video;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ListensFor(events = {"error"})
@Emits(events = {"findPlaylist", "findVideo"})
@Deprecated
public class Catalog implements Component {
    public static final String PLAYLIST_ID = "playlistID";
    public static final String PLAYLIST_REFERENCE_ID = "playlistReferenceID";
    public static final String VIDEO_ID = "videoID";
    public static final String VIDEO_REFERENCE_ID = "videoReferenceID";
    private EventEmitter a = new EventEmitterImpl();
    private MediaService b;

    class a implements EventListener {
        private PlaylistListener a;

        public a(PlaylistListener playlistListener) {
            this.a = playlistListener;
        }

        public final void processEvent(Event event) {
            List<String> list = (List) event.properties.get(Event.ERRORS);
            if (list == null || list.isEmpty()) {
                this.a.onPlaylist((Playlist) event.properties.get(Event.PLAYLIST));
                return;
            }
            for (String onError : list) {
                this.a.onError(onError);
            }
        }
    }

    class b implements EventListener {
        private VideoListener a;

        public b(VideoListener videoListener) {
            this.a = videoListener;
        }

        public final void processEvent(Event event) {
            List<String> list = (List) event.properties.get(Event.ERRORS);
            if (list == null || list.isEmpty()) {
                this.a.onVideo((Video) event.properties.get(Event.VIDEO));
                return;
            }
            for (String onError : list) {
                this.a.onError(onError);
            }
        }
    }

    public Catalog(String str) {
        this.b = new MediaService(this.a, str);
    }

    public Catalog(String str, String str2) {
        this.b = new MediaService(this.a, str, str2);
    }

    public void findPlaylistByID(String str, PlaylistListener playlistListener) {
        findPlaylistByID(str, null, playlistListener);
    }

    public void findPlaylistByID(String str, Map<String, String> map, PlaylistListener playlistListener) {
        HashMap hashMap = new HashMap();
        hashMap.put(PLAYLIST_ID, str);
        if (map != null) {
            hashMap.put(MediaService.OPTIONS, map);
        }
        this.a.request(EventType.FIND_PLAYLIST, hashMap, new a(playlistListener));
    }

    public void findPlaylistByReferenceID(String str, PlaylistListener playlistListener) {
        findPlaylistByReferenceID(str, null, playlistListener);
    }

    public void findPlaylistByReferenceID(String str, Map<String, String> map, PlaylistListener playlistListener) {
        HashMap hashMap = new HashMap();
        hashMap.put(PLAYLIST_REFERENCE_ID, str);
        if (map != null) {
            hashMap.put(MediaService.OPTIONS, map);
        }
        this.a.request(EventType.FIND_PLAYLIST, hashMap, new a(playlistListener));
    }

    public void findVideoByID(String str, VideoListener videoListener) {
        findVideoByID(str, null, videoListener);
    }

    public void findVideoByID(String str, Map<String, String> map, VideoListener videoListener) {
        HashMap hashMap = new HashMap();
        hashMap.put(VIDEO_ID, str);
        if (map != null) {
            hashMap.put(MediaService.OPTIONS, map);
        }
        this.a.request(EventType.FIND_VIDEO, hashMap, new b(videoListener));
    }

    public void findVideoByReferenceID(String str, VideoListener videoListener) {
        findVideoByReferenceID(str, null, videoListener);
    }

    public void findVideoByReferenceID(String str, Map<String, String> map, VideoListener videoListener) {
        HashMap hashMap = new HashMap();
        hashMap.put(VIDEO_REFERENCE_ID, str);
        if (map != null) {
            hashMap.put(MediaService.OPTIONS, map);
        }
        this.a.request(EventType.FIND_VIDEO, hashMap, new b(videoListener));
    }

    public EventEmitter getEventEmitter() {
        return this.a;
    }

    public void setEventEmitter(EventEmitter eventEmitter) {
        this.a = eventEmitter;
    }
}
