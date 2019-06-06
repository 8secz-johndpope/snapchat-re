package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

public class PlayerOptionsButtonController extends AbstractButtonController {
    boolean d;
    boolean e;
    private OnClickListener f = new OnClickListener() {
        public final void onClick(View view) {
            PlayerOptionsButtonController.this.eventEmitter.emit(EventType.SHOW_PLAYER_OPTIONS);
        }
    };

    public PlayerOptionsButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.player_options, typeface);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_player_options, R.string.desc_player_options, brightcoveControlBar.getImage(BrightcoveControlBar.CLOSED_CAPTIONS_IMAGE), this.f));
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                PlayerOptionsButtonController.this.d = true;
            }
        });
        addListener(EventType.AUDIO_TRACKS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                List list = (List) event.properties.get(Event.TRACKS);
                PlayerOptionsButtonController.this.e = list.isEmpty() ^ 1;
                PlayerOptionsButtonController.this.getButton().setVisibility(PlayerOptionsButtonController.this.getVisibilityState());
            }
        });
        addListener(EventType.CAPTIONS_LANGUAGES, new EventListener() {
            public final void processEvent(Event event) {
                List list = (List) event.properties.get(Event.LANGUAGES);
                PlayerOptionsButtonController playerOptionsButtonController = PlayerOptionsButtonController.this;
                boolean z = (list == null || list.isEmpty()) ? false : true;
                playerOptionsButtonController.e = z;
                PlayerOptionsButtonController.this.getButton().setVisibility(PlayerOptionsButtonController.this.getVisibilityState());
            }
        });
    }

    public int getManagedState() {
        return 0;
    }

    public int getVisibilityState() {
        return (this.d && this.e) ? 0 : 8;
    }
}
