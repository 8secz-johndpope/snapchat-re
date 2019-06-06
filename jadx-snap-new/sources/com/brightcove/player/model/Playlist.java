package com.brightcove.player.model;

import com.brightcove.player.util.ErrorUtil;
import java.util.List;
import java.util.Map;

public class Playlist extends MetadataObject {
    private List<Video> b;

    public static final class Fields {
        public static final String NAME = "name";
        public static final String SHORT_DESCRIPTION = "shortDescription";
    }

    public Playlist(Map<String, Object> map) {
        super(map);
    }

    public Playlist(Map<String, Object> map, List<Video> list) {
        super(map);
        if (list != null) {
            this.b = list;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.VIDEOS_REQUIRED));
    }

    public Integer getCount() {
        return Integer.valueOf(this.b.size());
    }

    public List<Video> getVideos() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Playlist{");
        String str = "name";
        if (this.a.get(str) != null) {
            stringBuilder.append("name: ");
            stringBuilder.append(this.a.get(str));
        }
        str = "shortDescription";
        if (this.a.get(str) != null) {
            stringBuilder.append(" shortDescription: ");
            stringBuilder.append(this.a.get(str));
        }
        stringBuilder.append(" videos: ");
        List list = this.b;
        stringBuilder.append(list != null ? list.size() : 0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
