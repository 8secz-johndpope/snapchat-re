package defpackage;

import com.snap.core.db.column.PrivacyType;
import defpackage.fth.a;

/* renamed from: sft */
public enum sft implements fth {
    LAST_SERVER_ACKNOWLEDGED_DEVICE_TOKEN(a.a("")),
    DISABLE_NOTIFICATION_AUTO_BUNDLING(a.a(false)),
    NOTIFICATION_AVAILABLE_FRIEND_SUGGESTIONS(a.a(true)),
    NOTIFICATION_AVAILABLE_STORIES(a.a(true)),
    NOTIFICATION_USER_TAGGING(a.a(true)),
    NOTIFICATION_FRIENDS_BIRTHDAY(a.a(true)),
    NOTIFICATION_MEMORIES(a.a(true)),
    NOTIFICATION_CREATIVE_TOOLS(a.a(true)),
    NOTIFICATION_MESSAGE_REMINDER(a.a(true)),
    NOTIFICATIONS_ENABLE(a.a(true)),
    NOTIFICATION_PRIVACY(a.a(PrivacyType.EVERYONE)),
    NOTIFICATION_SOUND(a.a(true)),
    NOTIFICATION_RINGING(a.a(true)),
    NOTIFICATION_VIBRATION(a.a(true)),
    NOTIFICATION_LED(a.a(true)),
    NOTIFICATION_WAKE_SCREEN(a.a(true));
    
    private final a<?> delegate;

    private sft(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.NOTIFICATIONS;
    }
}
