package com.snap.creativekit.lib.ui.loading;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.gub;
import defpackage.guc;
import defpackage.ohk;
import java.util.List;

public abstract class BaseCreativeKitLoadingFragment extends MainPageFragment implements guc {
    public CreativeKitLoadingPresenter a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final String a() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("CLIENT_ID") : null;
    }

    public final String a(String str) {
        akcr.b(str, "clientPackageName");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String str2 = "CLIENT_APP_NAME";
            if (arguments.containsKey(str2)) {
                return arguments.getString(str2);
            }
        }
        return gub.a(str);
    }

    public final Context b() {
        return getActivity();
    }

    public final Uri c() {
        Object arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        akcr.a(arguments, "arguments ?: return null");
        String string = arguments.getString("intent_action");
        if (string != null) {
            int hashCode = string.hashCode();
            String str = "android.intent.extra.STREAM";
            if (hashCode != -1173264947) {
                if (hashCode == -58484670 && string.equals("android.intent.action.SEND_MULTIPLE")) {
                    arguments = arguments.getParcelableArrayList(str);
                    akcr.a(arguments, "args.getParcelableArrayList(Intent.EXTRA_STREAM)");
                    List list = (List) arguments;
                    if (list.isEmpty()) {
                        return null;
                    }
                    arguments = list.get(0);
                }
            } else if (string.equals("android.intent.action.SEND")) {
                arguments = arguments.getParcelable(str);
            }
            return (Uri) arguments;
        }
        return null;
    }

    public final String d() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("sticker") : null;
    }

    public final String f() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString(ohk.e) : null;
    }

    public final String g() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("captionText") : null;
    }

    public final String h() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("attachmentUrl") : null;
    }

    public void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        CreativeKitLoadingPresenter creativeKitLoadingPresenter = this.a;
        if (creativeKitLoadingPresenter == null) {
            akcr.a("presenter");
        }
        creativeKitLoadingPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.creative_kit_loading, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        CreativeKitLoadingPresenter creativeKitLoadingPresenter = this.a;
        if (creativeKitLoadingPresenter == null) {
            akcr.a("presenter");
        }
        creativeKitLoadingPresenter.dropTarget();
    }
}
