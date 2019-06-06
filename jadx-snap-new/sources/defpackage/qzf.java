package defpackage;

import android.content.Context;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: qzf */
public enum qzf {
    UNDEFINED("Undefined", "", -1, -1, false, null, null, gcl.UNDEFINED),
    SNAP_FRIEND("SnapFriend", "", -1, -1, false, null, null, null),
    GO_TO_URL("GoToUrl", "", -1, -1, false, null, null, null),
    ADD_COLLEGE_OR_WORKPLACE("JoinGroup", "", -1, -1, false, null, null, null),
    BIRTHDAY_PARTY("BirthdayParty", "🎉", R.string.ff_birthday_party_title, R.string.ff_birthday_party_explanation, true, qyi.BDAY_FEED_HEADER_PROMPT_SEEN_COUNT, qyi.HAS_SEEN_BIRTHDAY_PROMPT, gcl.BIRTHDAY_PARTY),
    NOTIFICATION_PERMISSION("NotificationPerm", "📬", R.string.ff_notification_prompt_title, R.string.ff_notification_prompt_explanation, true, qyi.NOTIFICATION_FEED_HEADER_PROMPT_SEEN_COUNT, qyi.HAS_SEEN_NOTIFICATION_PROMPT, gcl.NOTIFICATION_PERMISSION),
    PHONE_NUMBER_VERIFICATION("PhoneVerification", "🔐", R.string.ff_phone_number_verification_prompt_secure, R.string.ff_phone_number_verification_prompt_tap_here, true, qyi.PHONE_VERIFICATION_FEED_HEADER_PROMPT_SEEN_COUNT, qyi.HAS_SEEN_PHONE_PROMPT, gcl.PHONE_NUMBER_VERIFICATION),
    SUICIDE_PREVENTION("SnapLove", "💌", R.string.ff_suicide_prevention_prompt_title, R.string.ff_suicide_prevention_prompt_desc, true, qyi.SUICIDE_PREVENTION_FEED_HEADER_PROMPT_SEEN_COUNT, null, gcl.SUICIDE_PREVENTION),
    EMAIL_VERIFICATION("EmailVerification", "📧", R.string.ff_email_verification_prompt_title_add, R.string.ff_email_verification_prompt_desc_secure, true, qyi.EMAIL_VERIFICATION_HEADER_PROMPT_SEEN_COUNT, null, gcl.EMAIL_VERIFICATION),
    CONTACT_SYNC("ContactSync", "👥", R.string.ff_find_friends_contact_sync, R.string.ff_find_friends_label_contact_sync, true, qyi.CONTACT_SYNC_HEADER_PROMPT_SEEN_COUNT, null, null);
    
    public static final a Companion = null;
    private static final String TAG = "DisplayPromptType";
    private static final ajxe labelMap$delegate = null;
    static final ajxe lookupMap$delegate = null;
    private final int defaultDescription;
    public final String defaultIcon;
    private final int defaultTitle;
    public final boolean hasDefault;
    public final String id;
    private final gcl legacyPrompt;
    public final qyi legacySeenKey;
    public final qyi saveCountKey;

    /* renamed from: qzf$c */
    static final class c extends akcs implements akbk<Map<String, ? extends qzf>> {
        public static final c a = null;

        static {
            a = new c();
        }

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            qzf[] values = qzf.values();
            Collection arrayList = new ArrayList(values.length);
            for (qzf qzf : values) {
                arrayList.add(ajxs.a(qzf.id, qzf));
            }
            return ajzm.a((Iterable) (List) arrayList);
        }
    }

    /* renamed from: qzf$b */
    static final class b extends akcs implements akbk<Map<String, ? extends qzf>> {
        public static final b a = null;

        static {
            a = new b();
        }

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            qzf[] values = qzf.values();
            Collection arrayList = new ArrayList(values.length);
            for (qzf qzf : values) {
                arrayList.add(ajxs.a(qzf.a(), qzf));
            }
            return ajzm.a((Iterable) (List) arrayList);
        }
    }

    /* renamed from: qzf$a */
    public static final class a {
        static {
            aken[] akenArr = new aken[]{new akdc(akde.a(a.class), "lookupMap", "getLookupMap()Ljava/util/Map;"), new akdc(akde.a(a.class), "labelMap", "getLabelMap()Ljava/util/Map;")};
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Companion = new a();
        TAG = TAG;
        lookupMap$delegate = ajxh.a(c.a);
        labelMap$delegate = ajxh.a(b.a);
    }

    private qzf(String str, String str2, int i, int i2, boolean z, qyi qyi, qyi qyi2, gcl gcl) {
        akcr.b(str, "id");
        akcr.b(str2, "defaultIcon");
        this.id = str;
        this.defaultIcon = str2;
        this.defaultTitle = i;
        this.defaultDescription = i2;
        this.hasDefault = z;
        this.saveCountKey = qyi;
        this.legacySeenKey = qyi2;
        this.legacyPrompt = gcl;
    }

    private static String a(Context context, int i) {
        if (i < 0) {
            return "";
        }
        Object string = context.getString(i);
        akcr.a(string, "ctx.getString(res)");
        return string;
    }

    public final String a() {
        gcl gcl = this.legacyPrompt;
        if (gcl != null) {
            String name = gcl.name();
            if (name != null) {
                return name;
            }
        }
        return this.id;
    }

    public final String a(Context context) {
        akcr.b(context, "ctx");
        return qzf.a(context, this.defaultTitle);
    }

    public final aakh b() {
        switch (qzg.a[ordinal()]) {
            case 1:
                return aakh.NOTIFICATION_PERMISSION;
            case 2:
                return aakh.BIRTHDAY_PARTY;
            case 3:
                return aakh.PHONE_NUMBER_VERIFICATION;
            case 4:
                return aakh.SUICIDE_PREVENTION;
            case 5:
                return aakh.CONTACT_BOOK;
            case 6:
                return aakh.EMAIL_VERIFICATION;
            default:
                return null;
        }
    }

    public final String b(Context context) {
        akcr.b(context, "ctx");
        if (this != BIRTHDAY_PARTY) {
            return qzf.a(context, this.defaultDescription);
        }
        Object format = String.format(qzf.a(context, this.defaultDescription), Arrays.copyOf(new Object[]{"🎂"}, 1));
        akcr.a(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
