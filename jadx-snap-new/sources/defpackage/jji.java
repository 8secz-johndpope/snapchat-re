package defpackage;

import com.snap.identity.ui.settings.birthday.SettingsBirthdayFragment;
import com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisDetailFragment;
import com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisDetailFragment.a;
import com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisFragment;
import com.snap.identity.ui.settings.customemojis.skintone.SkinTonePickerFragment;
import com.snap.identity.ui.settings.displayname.SettingsDisplayNameFragment;
import com.snap.identity.ui.settings.email.SettingsEmailFragment;
import com.snap.identity.ui.settings.forgotpassword.SettingsForgotPasswordPhoneFragment;
import com.snap.identity.ui.settings.passwordchange.InAppPasswordChangeFragment;
import com.snap.identity.ui.settings.passwordvalidation.PasswordValidationFragment;
import com.snap.identity.ui.settings.phonenumber.SettingsPhoneNumberFragment;
import com.snap.ui.deck.MainPageFragment;

/* renamed from: jji */
public final class jji implements jjh {
    public final /* synthetic */ MainPageFragment a() {
        return new SettingsDisplayNameFragment();
    }

    public final MainPageFragment a(String str, String str2, String str3, String str4) {
        String str5 = "selectedEmojiCategory";
        akcr.b(str, str5);
        String str6 = "defaultEmojiUnicode";
        akcr.b(str3, str6);
        String str7 = "selectedEmojiUnicode";
        akcr.b(str4, str7);
        a aVar = new a();
        String str8 = "category";
        akcr.b(str, str8);
        aVar.a = str;
        aVar.b = str2;
        akcr.b(str3, str6);
        aVar.d = str3;
        akcr.b(str4, str7);
        aVar.c = str4;
        SettingsCustomizeEmojisDetailFragment settingsCustomizeEmojisDetailFragment = new SettingsCustomizeEmojisDetailFragment();
        str2 = aVar.a;
        if (str2 == null) {
            akcr.a(str5);
        }
        akcr.b(str2, str8);
        settingsCustomizeEmojisDetailFragment.b = str2;
        str2 = aVar.d;
        if (str2 == null) {
            akcr.a(str6);
        }
        str3 = "emojiInfo";
        akcr.b(str2, str3);
        settingsCustomizeEmojisDetailFragment.e = str2;
        str2 = aVar.c;
        if (str2 == null) {
            akcr.a(str7);
        }
        akcr.b(str2, str3);
        settingsCustomizeEmojisDetailFragment.d = str2;
        settingsCustomizeEmojisDetailFragment.c = aVar.b;
        return settingsCustomizeEmojisDetailFragment;
    }

    public final /* synthetic */ MainPageFragment b() {
        return new SettingsBirthdayFragment();
    }

    public final /* synthetic */ MainPageFragment c() {
        return new SettingsEmailFragment();
    }

    public final /* synthetic */ MainPageFragment d() {
        return new PasswordValidationFragment();
    }

    public final /* synthetic */ MainPageFragment e() {
        return new InAppPasswordChangeFragment();
    }

    public final /* synthetic */ MainPageFragment f() {
        return new SettingsPhoneNumberFragment();
    }

    public final /* synthetic */ MainPageFragment g() {
        return new SettingsForgotPasswordPhoneFragment();
    }

    public final /* synthetic */ MainPageFragment h() {
        return new SettingsCustomizeEmojisFragment();
    }

    public final /* synthetic */ MainPageFragment i() {
        return new SkinTonePickerFragment();
    }
}
