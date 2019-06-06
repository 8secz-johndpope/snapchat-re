package com.brightcove.player.captioning;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.brightcove.player.captioning.tasks.LoadCaptionsTask;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.CaptionType;

@ListensFor(events = {})
@Emits(events = {})
public class LoadCaptionsService extends AbstractComponent {
    private ContentResolver a;

    public LoadCaptionsService(EventEmitter eventEmitter, ContentResolver contentResolver) {
        super(eventEmitter, LoadCaptionsService.class);
        if (eventEmitter != null) {
            this.a = contentResolver;
            return;
        }
        throw new IllegalArgumentException("must provide an EventEmitter");
    }

    @SuppressLint({"NewApi"})
    public void loadCaptions(Uri uri, String str) {
        if (uri != null) {
            CaptionType fromString = CaptionType.fromString(str);
            if (fromString == null) {
                str = uri.getPath();
                fromString = (str.endsWith(".ttml") || str.endsWith(".dfxp") || str.endsWith(".xml")) ? CaptionType.TTML : str.endsWith(".vtt") ? CaptionType.WEBVTT : CaptionType.UNKNOWN;
            }
            if (fromString != null) {
                LoadCaptionsTask loadCaptionsTask = new LoadCaptionsTask(this.eventEmitter, this.a, fromString);
                if (VERSION.SDK_INT >= 11) {
                    loadCaptionsTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri});
                    return;
                } else {
                    loadCaptionsTask.execute(new Uri[]{uri});
                    return;
                }
            }
            throw new IllegalArgumentException("unknown caption type");
        }
        throw new IllegalArgumentException("must provide a valid Uri");
    }
}
