package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aexm.class)
/* renamed from: aexl */
public class aexl extends aeji implements aezk {
    @SerializedName("action")
    public String c;
    @SerializedName("birthday")
    public String d;
    @SerializedName("time_zone")
    public String e;
    @SerializedName("email")
    public String f;
    @SerializedName("password")
    public String g;
    @SerializedName("phoneNumber")
    public String h;
    @SerializedName("code")
    public String i;
    @SerializedName("deviceid")
    public String j;
    @SerializedName("otpSecret")
    public String k;
    @SerializedName("privacySetting")
    public String l;
    @SerializedName("searchable")
    public String m;
    @SerializedName("storyFriendsToBlock")
    public List<String> n;
    @SerializedName("notificationSoundSetting")
    public String o;
    @SerializedName("notificationPrivacy")
    public String p;
    @SerializedName("ringingSound")
    public String q;
    @SerializedName("adPreferences")
    public String r;
    @SerializedName("snapchatLevelContactPermission")
    public aeyx s;
    @SerializedName("friendId")
    public String t;
    @SerializedName("block")
    public Boolean u;
    @SerializedName("enabledPushNotifications")
    public String v;
    @SerializedName("contact_sync_enabled")
    public String w;
    @SerializedName("confirmedBirthdayChange")
    public String x;
    @SerializedName("storyFriendsIdsToBlock")
    public List<String> y;

    /* renamed from: aexl$a */
    public enum a {
        UPDATEBIRTHDAY("updateBirthday"),
        UPDATEEMAIL("updateEmail"),
        UPDATEPRIVACY("updatePrivacy"),
        UPDATESTORYPRIVACY("updateStoryPrivacy"),
        UPDATEQUICKADDPRIVACY("updateQuickAddPrivacy"),
        UPDATESEARCHABLEBYPHONENUMBER("updateSearchableByPhoneNumber"),
        VERIFYEMAIL("verifyEmail"),
        DISABLETWOFA("disableTwoFA"),
        DISABLESMSTWOFA("disableSMSTwoFA"),
        DISABLEOTPTWOFA("disableOTPTwoFA"),
        ENABLETWOFA("enableTwoFA"),
        ENABLESMSTWOFA("enableSMSTwoFA"),
        ENABLEOTPTWOFA("enableOTPTwoFA"),
        TWOFAFORGETDEVICE("twoFAForgetDevice"),
        SENDTWOFACODE("sendTwoFACode"),
        SENDSMSTWOFACODE("sendSMSTwoFACode"),
        TWOFAFORGETONEDEVICE("twoFAForgetOneDevice"),
        PWCONFIRMPHONENUMBER("pwConfirmPhoneNumber"),
        UPDATENOTIFICATIONSOUNDSETTING("updateNotificationSoundSetting"),
        UPDATERINGINGSOUND("updateRingingSound"),
        UPDATENOTIFICATIONPRIVACY("updateNotificationPrivacy"),
        ADPREFERENCES("adPreferences"),
        UPDATESNAPCHATLEVELCONTACTPERMISSION("updateSnapchatLevelContactPermission"),
        STORYCUSTOMBLOCKLISTEDIT("storyCustomBlocklistEdit"),
        UPDATEENABLEDPUSHNOTIFICATIONS("updateEnabledPushNotifications"),
        UPDATECONTACTSYNC("updateContactSync"),
        UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
        
        private final String value;

        private a(String str) {
            this.value = str;
        }

        public static a a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return a.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    public final a a() {
        return a.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aexl)) {
            aexl aexl = (aexl) obj;
            return super.equals(aexl) && Objects.equal(this.c, aexl.c) && Objects.equal(this.d, aexl.d) && Objects.equal(this.e, aexl.e) && Objects.equal(this.f, aexl.f) && Objects.equal(this.g, aexl.g) && Objects.equal(this.h, aexl.h) && Objects.equal(this.i, aexl.i) && Objects.equal(this.j, aexl.j) && Objects.equal(this.k, aexl.k) && Objects.equal(this.l, aexl.l) && Objects.equal(this.m, aexl.m) && Objects.equal(this.n, aexl.n) && Objects.equal(this.o, aexl.o) && Objects.equal(this.p, aexl.p) && Objects.equal(this.q, aexl.q) && Objects.equal(this.r, aexl.r) && Objects.equal(this.s, aexl.s) && Objects.equal(this.t, aexl.t) && Objects.equal(this.u, aexl.u) && Objects.equal(this.v, aexl.v) && Objects.equal(this.w, aexl.w) && Objects.equal(this.x, aexl.x) && Objects.equal(this.y, aexl.y);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.i;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.k;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.l;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.n;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.p;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.q;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.r;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aeyx aeyx = this.s;
        hashCode = (hashCode + (aeyx == null ? 0 : aeyx.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.v;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.w;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.x;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list = this.y;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
