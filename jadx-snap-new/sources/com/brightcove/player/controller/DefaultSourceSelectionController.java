package com.brightcove.player.controller;

import android.os.Build.VERSION;
import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.EventUtil;
import java.util.Map;
import java.util.Set;

@ListensFor(events = {"selectSource"})
@Emits(events = {"sourceNotFound"})
public class DefaultSourceSelectionController extends AbstractComponent implements SourceSelector, Component {
    public static final String TAG = "DefaultSourceSelectionController";
    private final Integer a = Integer.valueOf(262144);
    private boolean b;

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(DefaultSourceSelectionController defaultSourceSelectionController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Video video = (Video) event.properties.get(Event.VIDEO);
            try {
                event.properties.put("source", DefaultSourceSelectionController.this.selectSource(video));
                DefaultSourceSelectionController.this.eventEmitter.respond(event);
            } catch (NoSourceFoundException unused) {
                String str = DefaultSourceSelectionController.TAG;
                StringBuilder stringBuilder = new StringBuilder("no usable Source could be found for Video: ");
                stringBuilder.append(video.toString());
                Log.e(str, stringBuilder.toString());
                EventUtil.emit(DefaultSourceSelectionController.this.eventEmitter, EventType.SOURCE_NOT_FOUND, video);
            }
        }
    }

    public DefaultSourceSelectionController(EventEmitter eventEmitter) {
        super(eventEmitter, DefaultSourceSelectionController.class);
        this.b = VERSION.SDK_INT >= 14;
        addListener(EventType.SELECT_SOURCE, new a(this, (byte) 0));
    }

    public Source findBestSourceByBitRate(SourceCollection sourceCollection, Integer num) {
        if (sourceCollection.getSources() == null || sourceCollection.getSources().size() == 0) {
            return null;
        }
        Source source = (Source) sourceCollection.getSources().iterator().next();
        int i = Integer.MAX_VALUE;
        for (Source source2 : sourceCollection.getSources()) {
            if (source2.getBitRate() != null && source2.getBitRate().intValue() > 0) {
                int abs = Math.abs(source2.getBitRate().intValue() - num.intValue());
                if (abs <= i) {
                    source = source2;
                    i = abs;
                }
            }
        }
        return source;
    }

    public Source selectSource(Video video) {
        if (video != null) {
            Map sourceCollections = video.getSourceCollections();
            if (sourceCollections == null || sourceCollections.size() == 0) {
                throw new NoSourceFoundException();
            }
            Source source;
            Set sources;
            if (this.b && sourceCollections.containsKey(DeliveryType.HLS)) {
                Set sources2 = ((SourceCollection) sourceCollections.get(DeliveryType.HLS)).getSources();
                if (sources2 != null && sources2.size() > 0) {
                    source = (Source) sources2.iterator().next();
                    if (source == null && sourceCollections.containsKey(DeliveryType.MP4)) {
                        source = findBestSourceByBitRate((SourceCollection) sourceCollections.get(DeliveryType.MP4), this.a);
                    }
                    if (source == null && sourceCollections.containsKey(DeliveryType.UNKNOWN)) {
                        sources = ((SourceCollection) sourceCollections.get(DeliveryType.UNKNOWN)).getSources();
                        if (sources != null && sources.size() > 0) {
                            source = (Source) sources.iterator().next();
                        }
                    }
                    if (source == null && source.getUrl() != null) {
                        return source;
                    }
                    throw new NoSourceFoundException();
                }
            }
            source = null;
            source = findBestSourceByBitRate((SourceCollection) sourceCollections.get(DeliveryType.MP4), this.a);
            sources = ((SourceCollection) sourceCollections.get(DeliveryType.UNKNOWN)).getSources();
            source = (Source) sources.iterator().next();
            if (source == null) {
            }
            throw new NoSourceFoundException();
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.VIDEO_REQUIRED));
    }
}
