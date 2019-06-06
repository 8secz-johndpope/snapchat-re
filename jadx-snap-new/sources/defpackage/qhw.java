package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import com.brightcove.player.media.CuePointFields;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.WithFriend;
import com.snap.messaging.chat.ui.view.SwipeableMessageLinearLayout;
import com.snapchat.android.R;

/* renamed from: qhw */
public abstract class qhw<TViewModel extends qks> extends zly<qfd, TViewModel> implements OnClickListener, OnLayoutChangeListener {
    private WithFriend a;
    private TextView b;

    /* Access modifiers changed, original: protected */
    public void a(qfd qfd, View view) {
        akcr.b(qfd, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.chat_message_time);
        akcr.a(findViewById, "itemView.findViewById(R.id.chat_message_time)");
        this.b = (TextView) findViewById;
        view.addOnLayoutChangeListener(this);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void onBind(TViewModel tViewModel, TViewModel tViewModel2) {
        akcr.b(tViewModel, MapboxEvent.KEY_MODEL);
        if ((akcr.a((Object) tViewModel, (Object) tViewModel2) ^ 1) != 0) {
            int i = 0;
            if (tViewModel instanceof qlb) {
                if (tViewModel2 instanceof qlb) {
                    i = akcr.a((qks) ((qlb) tViewModel).i.get(0), (qks) ((qlb) tViewModel2).i.get(0));
                }
            }
            if (i == 0 && (getItemView() instanceof SwipeableMessageLinearLayout)) {
                View itemView = getItemView();
                if (itemView != null) {
                    ((SwipeableMessageLinearLayout) itemView).setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.messaging.chat.ui.view.SwipeableMessageLinearLayout");
                }
            }
        }
        this.a = tViewModel.e;
        TextView textView = this.b;
        if (textView == null) {
            akcr.a(CuePointFields.TIME);
        }
        Context context = getItemView().getContext();
        WithFriend withFriend = this.a;
        if (withFriend == null) {
            akcr.a("messageRecord");
        }
        textView.setText(ihr.b(context, withFriend.timestamp()));
    }

    public final WithFriend b() {
        WithFriend withFriend = this.a;
        if (withFriend == null) {
            akcr.a("messageRecord");
        }
        return withFriend;
    }

    public final TextView c() {
        TextView textView = this.b;
        if (textView == null) {
            akcr.a(CuePointFields.TIME);
        }
        return textView;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        qks qks = (qks) getModel();
        if (qks != null) {
            onBind(qks, qks);
        }
    }

    public void onClick(View view) {
        akcr.b(view, "view");
        WithFriend withFriend = this.a;
        String str = "messageRecord";
        if (withFriend == null) {
            akcr.a(str);
        }
        if (withFriend.clientStatus() != MessageClientStatus.OK) {
            withFriend = this.a;
            if (withFriend == null) {
                akcr.a(str);
            }
            if (withFriend.clientStatus() != MessageClientStatus.FAILED) {
                return;
            }
        }
        zke eventDispatcher = getEventDispatcher();
        zmy model = getModel();
        if (model == null) {
            akcr.a();
        }
        eventDispatcher.a(new qgi((qks) model, view));
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zke eventDispatcher = getEventDispatcher();
        zmy model = getModel();
        if (model == null) {
            akcr.a();
        }
        eventDispatcher.a(new qgl((qks) model));
    }
}
