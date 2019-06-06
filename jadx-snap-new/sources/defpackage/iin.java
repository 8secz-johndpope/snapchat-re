package defpackage;

import com.snapchat.android.R;

/* renamed from: iin */
public enum iin {
    UNKNOWN(R.drawable.neon_feed_icon_received_opened_chat_grey),
    WAITING_TO_SEND(R.color.transparent),
    PENDING(R.drawable.neon_feed_icon_sent_unopened_grey),
    FAILED(R.drawable.neon_feed_icon_exclamation_red),
    FAILED_NON_RECOVERABLE(R.drawable.neon_feed_icon_exclamation_grey),
    SNAP_SENT_SOUND(R.drawable.neon_feed_icon_sent_unopened_purple),
    SNAP_SENT_NO_SOUND(R.drawable.neon_feed_icon_sent_unopened_red),
    SNAP_SENT_AND_OPENED_SOUND(R.drawable.neon_feed_icon_sent_opened_purple),
    SNAP_SENT_AND_OPENED_NO_SOUND(R.drawable.neon_feed_icon_sent_opened_red),
    SNAP_SENDING(R.drawable.neon_feed_icon_sent_unopened_grey),
    SNAP_SENT_AND_SCREENSHOTTED_SOUND(R.drawable.neon_feed_icon_opened_screenshot_purple),
    SNAP_SENT_AND_REPLAYED_AND_SCREENSHOTTED_SOUND(R.drawable.neon_feed_icon_opened_screenshot_purple),
    SNAP_SENT_AND_SCREENSHOTTED_NO_SOUND(R.drawable.neon_feed_icon_opened_screenshot_red),
    SNAP_SENT_AND_REPLAYED_AND_SCREENSHOTTED_NO_SOUND(R.drawable.neon_feed_icon_opened_screenshot_red),
    SNAP_SENT_AND_SCREEN_RECORDED_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_purple),
    SNAP_SENT_AND_REPLAYED_AND_SCREEN_RECORDED_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_purple),
    SNAP_SENT_AND_SCREEN_RECORDED_NO_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_red),
    SNAP_SENT_AND_REPLAYED_AND_SCREEN_RECORDED_NO_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_red),
    SNAP_SENT_AND_REPLAYED_SOUND(R.drawable.neon_feed_icon_replay_purple),
    SNAP_SENT_AND_REPLAYED_NO_SOUND(R.drawable.neon_feed_icon_replay_red),
    SNAP_RECEIVED_AND_VIEWED_SOUND(R.drawable.neon_feed_icon_received_opened_snap_purple),
    SNAP_VIEWED_AND_REPLAY_AVAILABLE_SOUND(R.drawable.neon_feed_icon_received_opened_snap_purple),
    SNAP_RECEIVED_AND_VIEWED_NO_SOUND(R.drawable.neon_feed_icon_received_opened_snap_red),
    SNAP_VIEWED_AND_REPLAY_AVAILABLE_NO_SOUND(R.drawable.neon_feed_icon_received_opened_snap_red),
    SNAP_RECEIVED_AND_SCREENSHOTTED_SOUND(R.drawable.neon_feed_icon_received_opened_snap_purple),
    SNAP_RECEIVED_AND_SCREENSHOTTED_NO_SOUND(R.drawable.neon_feed_icon_received_opened_snap_red),
    SNAP_RECEIVED_AND_SCREEN_RECORDED_SOUND(R.drawable.neon_feed_icon_received_opened_snap_purple),
    SNAP_RECEIVED_AND_SCREEN_RECORDED_NO_SOUND(R.drawable.neon_feed_icon_received_opened_snap_red),
    SNAP_RECEIVED_AND_REPLAYED_SOUND(R.drawable.neon_feed_icon_replay_purple),
    SNAP_RECEIVED_AND_REPLAYED_NO_SOUND(R.drawable.neon_feed_icon_replay_red),
    SNAP_RECEIVED_AND_REPLAYED_AND_SCREENSHOTTED_SOUND(R.drawable.neon_feed_icon_opened_screenshot_purple),
    SNAP_RECEIVED_AND_REPLAYED_AND_SCREENSHOTTED_NO_SOUND(R.drawable.neon_feed_icon_opened_screenshot_red),
    SNAP_RECEIVED_AND_REPLAYED_AND_SCREEN_RECORDED_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_purple),
    SNAP_RECEIVED_AND_REPLAYED_AND_SCREEN_RECORDED_NO_SOUND(R.drawable.neon_feed_icon_opened_screen_recording_red),
    SNAP_RECEIVED_AND_NOT_VIEWED_SOUND(R.drawable.neon_feed_icon_received_unopened_snap_purple),
    SNAP_RECEIVED_AND_NOT_LOADED_SOUND(R.drawable.neon_feed_icon_received_unopened_snap_purple),
    SNAP_RECEIVED_AND_NOT_VIEWED_NO_SOUND(R.drawable.neon_feed_icon_received_unopened_snap_red),
    SNAP_RECEIVED_AND_NOT_LOADED_NO_SOUND(R.drawable.neon_feed_icon_received_unopened_snap_red),
    SNAP_RECEIVED_AND_NOT_VIEWED_BIRTHDAY_SOUND(R.drawable.neon_feed_icon_received_unopened_birthday_snap_purple),
    SNAP_RECEIVED_AND_NOT_LOADED_BIRTHDAY_SOUND(R.drawable.neon_feed_icon_received_unopened_birthday_snap_purple),
    SNAP_RECEIVED_AND_NOT_VIEWED_BIRTHDAY_NO_SOUND(R.drawable.neon_feed_icon_received_unopened_birthday_snap_red),
    SNAP_RECEIVED_AND_NOT_LOADED_BIRTHDAY_NO_SOUND(R.drawable.neon_feed_icon_received_unopened_birthday_snap_red),
    CHAT_SENT(R.drawable.neon_feed_icon_sent_unopened_blue),
    CHAT_ADD(R.drawable.neon_feed_icon_sent_unopened_blue),
    CHAT_RENAME(R.drawable.neon_feed_icon_sent_unopened_blue),
    CHAT_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_blue),
    CHAT_ADD_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_blue),
    CHAT_RENAME_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_blue),
    CHAT_RECEIVED(R.drawable.neon_feed_icon_received_unopened_chat),
    CHAT_ADDED(R.drawable.neon_feed_icon_received_unopened_chat),
    CHAT_RENAMED(R.drawable.neon_feed_icon_received_unopened_chat),
    CHAT_WELCOME(R.drawable.neon_feed_icon_received_unopened_chat),
    CHAT_BIRTHDAY_RECEIVED(R.drawable.neon_feed_icon_received_unopened_birthday_chat),
    CHAT_BIRTHDAY_ADDED(R.drawable.neon_feed_icon_received_unopened_birthday_chat),
    CHAT_BIRTHDAY_RENAMED(R.drawable.neon_feed_icon_received_unopened_birthday_chat),
    CHAT_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_chat_blue),
    CHAT_ADDED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_chat_blue),
    CHAT_RENAMED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_chat_blue),
    CHAT_SENDING(R.drawable.neon_feed_icon_sent_unopened_grey),
    CHAT_SCREENSHOT(R.drawable.neon_feed_icon_unopened_screenshot_blue),
    CHAT_SCREENSHOT_AND_OPEN(R.drawable.neon_feed_icon_opened_screenshot_blue),
    CHAT_MEDIA_SAVE_RECEIVED(R.drawable.neon_feed_icon_received_unopened_chat),
    CHAT_MEDIA_SAVE_RECEIVED_AND_OPEN(R.drawable.neon_feed_icon_received_opened_chat_blue),
    CHAT_MEDIA_SAVE_SENT(R.drawable.neon_feed_icon_sent_opened_blue),
    CASH_EXPIRED_AND_NOT_RETRIABLE(R.drawable.neon_feed_icon_received_opened_chat_green),
    CASH_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_chat_green),
    CASH_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_green),
    CASH_REFUNDED(R.drawable.neon_feed_icon_refunded_unopened_cash),
    CASH_SENT(R.drawable.neon_feed_icon_sent_unopened_green),
    CASH_RECEIVED(R.drawable.neon_feed_icon_received_unopened_cash),
    INCOMING_AUDIO_CALL_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_call_blue),
    INCOMING_AUDIO_CALL_RECEIVED_AND_NOT_VIEWED(R.drawable.neon_feed_icon_received_unopened_call),
    INCOMING_VIDEO_CALL_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_received_opened_videochat_blue),
    INCOMING_VIDEO_CALL_RECEIVED_AND_NOT_VIEWED(R.drawable.neon_feed_icon_received_unopened_videochat),
    OUTGOING_AUDIO_CALL_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_call_blue),
    OUTGOING_AUDIO_CALL_SENT_AND_NOT_OPENED(R.drawable.neon_feed_icon_sent_unopened_call),
    OUTGOING_VIDEO_CALL_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_videochat_blue),
    OUTGOING_VIDEO_CALL_SENT_AND_NOT_OPENED(R.drawable.neon_feed_icon_sent_unopened_videochat),
    MISSED_AUDIO_CALL_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_missed_opened_call_blue),
    MISSED_AUDIO_CALL_RECEIVED_AND_NOT_VIEWED(R.drawable.neon_feed_icon_missed_unopened_call),
    MISSED_VIDEO_CALL_RECEIVED_AND_VIEWED(R.drawable.neon_feed_icon_missed_opened_videochat_blue),
    MISSED_VIDEO_CALL_RECEIVED_AND_NOT_VIEWED(R.drawable.neon_feed_icon_missed_unopened_videochat),
    MISSED_AUDIO_CALL_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_call_blue),
    MISSED_AUDIO_CALL_SENT_AND_NOT_OPENED(R.drawable.neon_feed_icon_sent_unopened_call),
    MISSED_VIDEO_CALL_SENT_AND_OPENED(R.drawable.neon_feed_icon_sent_opened_videochat_blue),
    MISSED_VIDEO_CALL_SENT_AND_NOT_OPENED(R.drawable.neon_feed_icon_sent_unopened_videochat),
    GROUP_CREATED(R.drawable.neon_feed_icon_received_unopened_chat),
    GROUP_MEMBER_JOINED(R.drawable.neon_feed_icon_received_unopened_chat),
    GROUP_NAME_UPDATED(R.drawable.neon_feed_icon_received_unopened_chat),
    NEW_FRIEND(R.drawable.neon_feed_icon_received_opened_chat_grey),
    DEFERRED_ADD_FRIEND_DEEP_LINK(R.drawable.neon_feed_icon_received_opened_chat_grey),
    CONTENT_INVITE_FAILED(R.drawable.neon_feed_icon_exclamation_grey),
    CONTENT_INVITE_SENT(R.drawable.neon_feed_icon_sent_unopened_grey);
    
    public final int iconRes;

    private iin(int i) {
        this.iconRes = i;
    }

    public final boolean a() {
        return b() || c();
    }

    public final boolean b() {
        int i = iio.a[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean c() {
        int i = iio.b[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean d() {
        switch (iio.c[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final boolean e() {
        switch (iio.d[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final boolean f() {
        return d() || b();
    }

    public final boolean g() {
        int i = iio.e[ordinal()];
        return i == 1 || i == 2;
    }

    public final boolean h() {
        return ((iin) this) == FAILED;
    }

    public final boolean i() {
        switch (iio.g[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public final boolean j() {
        return a() || i();
    }
}
