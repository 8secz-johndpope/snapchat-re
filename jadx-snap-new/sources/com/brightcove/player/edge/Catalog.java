package com.brightcove.player.edge;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import java.util.HashMap;
import java.util.Map;

@ListensFor(events = {})
@Emits(events = {"error", "account"})
public class Catalog extends AbstractComponent {
    public static final String DEFAULT_EDGE_BASE_URL = "https://edge.api.brightcove.com/playback/v1";
    private String a;
    private String b;
    private String c;

    public Catalog(EventEmitter eventEmitter, String str, String str2) {
        this(eventEmitter, str, str2, DEFAULT_EDGE_BASE_URL);
    }

    public Catalog(EventEmitter eventEmitter, String str, String str2, String str3) {
        super(eventEmitter, Catalog.class);
        this.a = str;
        this.b = str2;
        this.c = str3;
        HashMap hashMap = new HashMap();
        hashMap.put("value", str);
        eventEmitter.emit(EventType.ACCOUNT, hashMap);
    }

    public void findPlaylistByID(String str, PlaylistListener playlistListener) {
        findPlaylistByID(str, null, playlistListener);
    }

    public void findPlaylistByID(String str, Map<String, String> map, PlaylistListener playlistListener) {
        new GetPlaylistTask(this.eventEmitter, this.c, map, this.a, this.b).getById(str, playlistListener);
    }

    public void findPlaylistByReferenceID(String str, PlaylistListener playlistListener) {
        findPlaylistByReferenceID(str, null, playlistListener);
    }

    public void findPlaylistByReferenceID(String str, Map<String, String> map, PlaylistListener playlistListener) {
        new GetPlaylistTask(this.eventEmitter, this.c, map, this.a, this.b).getByReferenceId(str, playlistListener);
    }

    public void findVideoByID(String str, VideoListener videoListener) {
        findVideoByID(str, null, videoListener);
    }

    public void findVideoByID(String str, Map<String, String> map, VideoListener videoListener) {
        new GetVideoTask(this.eventEmitter, this.c, map, this.a, this.b).getById(str, videoListener);
    }

    public void findVideoByReferenceID(String str, VideoListener videoListener) {
        findVideoByReferenceID(str, null, videoListener);
    }

    public void findVideoByReferenceID(String str, Map<String, String> map, VideoListener videoListener) {
        new GetVideoTask(this.eventEmitter, this.c, map, this.a, this.b).getByReferenceId(str, videoListener);
    }
}
