package com.brightcove.player.captioning;

import com.brightcove.player.model.Block;
import com.brightcove.player.model.Span;
import java.util.List;

public class BrightcoveClosedCaption extends Block {
    private List<List<Span>> j;
    private String k;

    public BrightcoveClosedCaption(int i, int i2, String str) {
        this.a = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
        this.k = str;
    }

    public BrightcoveClosedCaption(int i, int i2, List<List<Span>> list) {
        this.a = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
        this.j = list;
    }

    public String getCaption() {
        return this.k;
    }

    public List<List<Span>> getLines() {
        return this.j;
    }

    public void setLines(List<List<Span>> list) {
        this.j = list;
    }
}
