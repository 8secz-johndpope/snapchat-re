package com.brightcove.player.model;

import com.brightcove.player.captioning.BrightcoveClosedCaption;
import java.util.List;
import java.util.Map;

public class TTMLDocument extends CaptionsDocument {
    private Map<String, StyledElement> c;
    private Block d;

    public TTMLDocument(Map<String, Region> map, Map<String, StyledElement> map2, Block block, List<BrightcoveClosedCaption> list) {
        if (map == null || map2 == null || block == null || list == null) {
            throw new IllegalArgumentException("must provide collections for regions, styles, body and captions");
        }
        this.a = map;
        this.c = map2;
        this.d = block;
        this.b = list;
    }

    public Block getBody() {
        return this.d;
    }

    public Map<String, StyledElement> getStyles() {
        return this.c;
    }
}
