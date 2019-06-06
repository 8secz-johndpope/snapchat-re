package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

@ListensFor(events = {"activityResumed", "audioTracks", "audioTracksDialogOk", "audioTracksDialogSettings", "fragmentResumed", "enterTvMode", "willChangeVideo"})
public class AudioTracksButtonController extends AbstractButtonController {
    static final String d = "AudioTracksButtonController";
    boolean e;
    int f;
    int g;
    int h;
    int i;
    EventListener j = new EventListener() {
        public final void processEvent(Event event) {
            if (AudioTracksButtonController.this.e) {
                ((ButtonState) AudioTracksButtonController.this.getStateList().get(AudioTracksButtonController.this.getManagedState())).getHandler().onClick(AudioTracksButtonController.this.getButton());
            }
        }
    };

    class a implements OnClickListener {
        private a() {
        }

        /* synthetic */ a(AudioTracksButtonController audioTracksButtonController, byte b) {
            this();
        }

        public final void onClick(View view) {
            Log.d(AudioTracksButtonController.d, "Showing the audio tracks dialog.");
            if (AudioTracksButtonController.this.c.isPlaying()) {
                AudioTracksButtonController.this.c.pause();
                AudioTracksButtonController audioTracksButtonController = AudioTracksButtonController.this;
                audioTracksButtonController.f = audioTracksButtonController.eventEmitter.once(EventType.AUDIO_TRACKS_DIALOG_OK, new EventListener() {
                    public final void processEvent(Event event) {
                        AudioTracksButtonController.this.c.start();
                        AudioTracksButtonController.this.eventEmitter.off(EventType.AUDIO_TRACKS_DIALOG_SETTINGS, AudioTracksButtonController.this.g);
                    }
                });
                audioTracksButtonController = AudioTracksButtonController.this;
                audioTracksButtonController.g = audioTracksButtonController.eventEmitter.once(EventType.AUDIO_TRACKS_DIALOG_SETTINGS, new EventListener() {
                    public final void processEvent(Event event) {
                        AudioTracksButtonController.this.h = AudioTracksButtonController.this.eventEmitter.once(EventType.ACTIVITY_RESUMED, new EventListener() {
                            public final void processEvent(Event event) {
                                AudioTracksButtonController.this.c.start();
                                AudioTracksButtonController.this.eventEmitter.off(EventType.FRAGMENT_RESUMED, AudioTracksButtonController.this.i);
                            }
                        });
                        AudioTracksButtonController.this.i = AudioTracksButtonController.this.eventEmitter.once(EventType.FRAGMENT_RESUMED, new EventListener() {
                            public final void processEvent(Event event) {
                                AudioTracksButtonController.this.c.start();
                                AudioTracksButtonController.this.eventEmitter.off(EventType.ACTIVITY_RESUMED, AudioTracksButtonController.this.h);
                            }
                        });
                        AudioTracksButtonController.this.eventEmitter.off(EventType.AUDIO_TRACKS_DIALOG_OK, AudioTracksButtonController.this.f);
                    }
                });
            }
            AudioTracksButtonController.this.c.getAudioTracksController().showAudioTracksDialog();
        }
    }

    public AudioTracksButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface, Bundle bundle) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.audio_tracks, typeface);
        boolean z = false;
        OnClickListener aVar = new a(this, (byte) 0);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_audio_tracks, R.string.desc_audio_tracks, brightcoveControlBar.getImage(BrightcoveControlBar.AUDIO_TRACKS_IMAGE), aVar));
        addListener(EventType.AUDIO_TRACKS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                List list = (List) event.properties.get(Event.TRACKS);
                AudioTracksButtonController.this.e = list.isEmpty() ^ 1;
            }
        });
        if (bundle != null) {
            String str = Event.AUDIO_TRACKS_STATE;
            if (bundle.containsKey(str) && bundle.getBoolean(str)) {
                z = true;
            }
        }
        this.e = z;
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                AudioTracksButtonController audioTracksButtonController = AudioTracksButtonController.this;
                audioTracksButtonController.addListener(EventType.SHOW_PLAYER_OPTIONS, audioTracksButtonController.j);
            }
        });
        addListener(EventType.WILL_CHANGE_VIDEO, new EventListener() {
            public final void processEvent(Event event) {
                AudioTracksButtonController.this.e = false;
            }
        });
    }

    public int getManagedState() {
        return 0;
    }

    public int getVisibilityState() {
        return this.e ? 0 : 8;
    }
}
