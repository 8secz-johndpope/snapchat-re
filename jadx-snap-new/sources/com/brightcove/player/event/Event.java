package com.brightcove.player.event;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public class Event {
    public static final String ACTIVITY = "activity";
    public static final String AD_ID = "adId";
    public static final String AD_TITLE = "adTitle";
    public static final String ALIGNMENT = "alignment";
    public static final String AUDIO_TRACKS_STATE = "audioTracksState";
    public static final String AUDIO_VARIANT = "audioVariant";
    public static final String BOOLEAN = "boolean";
    public static final String BUILD_VERSION = "buildVersion";
    public static final String CAPTIONS_STATE = "captionsState";
    public static final String CAPTION_FORMAT = "captionFormat";
    public static final String CAPTION_URI = "captionUri";
    public static final String CATALOG_URL = "catalogUrl";
    public static final String CONFIGURATION = "configuration";
    public static final String CUE_POINT = "cue_point";
    public static final String CUE_POINTS = "cue_points";
    public static final String CURRENT_VIDEO = "currentVideo";
    public static final String DEBUG = "debug";
    public static final String EMITTER = "emitter";
    public static final String END_TIME = "endTime";
    public static final String ERROR = "error";
    public static final String ERRORS = "errors";
    public static final String ERROR_CODE = "errorCode";
    public static final String ERROR_EXTRA = "errorExtra";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String FORWARD_BUFFER_SECONDS = "forwardBufferSeconds";
    public static final String FRAGMENT = "fragment";
    public static final String FROM_SEEK_POSITION = "fromSeekPosition";
    public static final String ID = "id";
    public static final String INDEX = "index";
    public static final String INSTANCE_STATE = "instanceState";
    public static final String LANGUAGES = "languages";
    public static final String LEFT_VOLUME = "leftVolume";
    public static final String LINE = "line";
    public static final String LINE_ANCHOR = "lineAnchor";
    public static final String LINE_TYPE = "lineType";
    public static final String LIST = "list";
    public static final String LOCALE_CODE = "localeCode";
    public static final String MAX_POSITION = "maxPosition";
    public static final String MEASURED_BPS = "measuredBps";
    public static final String MIN_POSITION = "minPosition";
    public static final String NEXT_VIDEO = "nextVideo";
    public static final String ORIGINAL_EVENT = "original";
    public static final String ORIGINAL_PLAYHEAD_POSITION = "originalPlayheadPosition";
    public static final String ORIGINAL_SEEK_POSITION = "originalSeekPosition";
    public static final String PERCENT_COMPLETE = "percentComplete";
    public static final String PLAYHEAD_POSITION = "playheadPosition";
    public static final String PLAYLIST = "playlist";
    public static final String PLUGIN_NAME = "pluginName";
    public static final String POSITION = "position";
    public static final String POSITION_ANCHOR = "positionAnchor";
    public static final String PROJECTION_FORMAT = "projectionFormat";
    public static final String RENDITION_HEIGHT = "renditionHeight";
    public static final String RENDITION_INDICATED_BPS = "renditionIndicatedBps";
    public static final String RENDITION_MIME_TYPE = "renditionMimeType";
    public static final String RENDITION_URL = "renditionUrl";
    public static final String RENDITION_WIDTH = "renditionWidth";
    public static final String REQUESTED_ORIENTATION = "requestedOrientation";
    public static final String REQUEST_TOKEN = "requestToken";
    public static final String RESPONSE_TIME_MS = "responseTimeMs";
    public static final String RIGHT_VOLUME = "rightVolume";
    public static final String SEEK_CONTROLS_VISIBILITY = "seekControlsVisibility";
    public static final String SEEK_DEFAULT = "seekDefault";
    public static final String SEEK_ON_HOLD_UPDATE_FREQ = "seekOnHoldUpdateFreq";
    public static final String SEEK_ON_HOLD_WAIT_TIME = "seekOnHoldWaitTime";
    public static final String SEEK_PERCENTAGE = "seekPercentage";
    public static final String SEEK_POSITION = "seekPosition";
    public static final String SEEK_PROGRESS = "seekProgress";
    public static final String SEEK_RELATIVE_ENABLED = "seekRelativeEabled";
    public static final String SEGMENT_DURATION = "segmentDuration";
    public static final String SELECTED_TRACK = "track";
    public static final String SIZE = "size";
    public static final String SKIP_CUE_POINTS = "skipCuePoints";
    public static final String SOURCE = "source";
    public static final String START_TIME = "startTime";
    public static final String SUPPORT_FRAGMENT = "supportFragment";
    public static final String TEXT = "text";
    public static final String TRACKS = "tracks";
    public static final String TTML_DOCUMENT = "ttmlDocument";
    public static final String UUID = "uuid";
    public static final String VALUE = "value";
    public static final String VIDEO = "video";
    public static final String VIDEO_DURATION = "duration";
    public static final String VIDEO_HEIGHT = "height";
    public static final String VIDEO_STILL = "video_still";
    public static final String VIDEO_WIDTH = "width";
    public static final String VOLUME = "volume";
    public static final String WEBVTT_DOCUMENT = "webvttDocument";
    private static final String a = "com.brightcove.player.event.Event";
    private static int e;
    private final String b;
    private boolean c = false;
    private boolean d = false;
    public final Map<String, Object> properties = new HashMap();

    public Event(String str) {
        this.b = str;
    }

    public static int getNextId() {
        int i = e;
        e = i + 1;
        return i;
    }

    public int getId() {
        return getIntegerProperty("id");
    }

    public int getIntegerProperty(String str) {
        if (this.properties.containsKey(str)) {
            Object str2;
            try {
                str2 = Integer.parseInt(this.properties.get(str2).toString());
                return str2;
            } catch (NumberFormatException unused) {
                String str3 = a;
                StringBuilder stringBuilder = new StringBuilder("Error converting value of <");
                stringBuilder.append(this.properties.get(str2));
                stringBuilder.append("> for key '");
                stringBuilder.append(str2);
                stringBuilder.append("'");
                Log.e(str3, stringBuilder.toString());
            }
        }
        return -1;
    }

    public String getType() {
        return this.b;
    }

    public boolean isPrevented() {
        return this.d;
    }

    public boolean isStopped() {
        return this.c;
    }

    public void preventDefault() {
        this.d = true;
    }

    public void stopPropagation() {
        this.c = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Event{");
        stringBuilder.append(this.b);
        stringBuilder.append(this.properties);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
