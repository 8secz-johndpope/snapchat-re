package com.brightcove.player.model;

import com.brightcove.player.captioning.BrightcoveClosedCaption;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CaptionsDocument implements Serializable {
    protected Map<String, Region> a;
    protected List<BrightcoveClosedCaption> b;

    public List<BrightcoveClosedCaption> getCaptions() {
        return this.b;
    }

    public Map<String, Region> getRegions() {
        return this.a;
    }
}
