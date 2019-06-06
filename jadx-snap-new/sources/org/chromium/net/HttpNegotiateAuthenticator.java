package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import defpackage.akon;
import defpackage.akoo;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

public class HttpNegotiateAuthenticator {
    private static /* synthetic */ boolean c = (HttpNegotiateAuthenticator.class.desiredAssertionStatus() ^ 1);
    Bundle a;
    private final String b;

    class a implements AccountManagerCallback<Account[]> {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            String str = "net_auth";
            try {
                Account[] accountArr = (Account[]) accountManagerFuture.getResult();
                if (accountArr.length == 0) {
                    akoo.b(str, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.a.a, -341, null);
                } else if (accountArr.length > 1) {
                    akoo.b(str, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.a.a, -341, null);
                } else if (HttpNegotiateAuthenticator.a(akon.a, "android.permission.USE_CREDENTIALS")) {
                    akoo.c(str, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.a.a, -343, null);
                } else {
                    c cVar = this.a;
                    cVar.e = accountArr[0];
                    cVar.b.getAuthToken(this.a.e, this.a.d, this.a.c, true, new b(this.a), new Handler(ThreadUtils.a().getLooper()));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                akoo.b(str, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.a.a, -9, null);
            }
        }
    }

    class b implements AccountManagerCallback<Bundle> {
        final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            int i = 0;
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (bundle.containsKey("intent")) {
                    final Context context = akon.a;
                    context.registerReceiver(new BroadcastReceiver() {
                        public final void onReceive(Context context, Intent intent) {
                            context.unregisterReceiver(this);
                            b.this.a.b.getAuthToken(b.this.a.e, b.this.a.d, b.this.a.c, true, new b(b.this.a), null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    return;
                }
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = HttpNegotiateAuthenticator.this;
                c cVar = this.a;
                httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
                switch (bundle.getInt("spnegoResult", 1)) {
                    case 0:
                        break;
                    case 2:
                        i = -3;
                        break;
                    case 3:
                        i = -342;
                        break;
                    case 4:
                        i = -320;
                        break;
                    case 5:
                        i = -338;
                        break;
                    case 6:
                        i = -339;
                        break;
                    case 7:
                        i = -341;
                        break;
                    case 8:
                        i = -344;
                        break;
                    case 9:
                        i = -329;
                        break;
                    default:
                        i = -9;
                        break;
                }
                httpNegotiateAuthenticator.nativeSetResult(cVar.a, i, bundle.getString("authtoken"));
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                akoo.b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.a.a, -9, null);
            }
        }
    }

    static class c {
        public long a;
        public AccountManager b;
        public Bundle c;
        public String d;
        public Account e;

        c() {
        }
    }

    private HttpNegotiateAuthenticator(String str) {
        if (c || !TextUtils.isEmpty(str)) {
            this.b = str;
            return;
        }
        throw new AssertionError();
    }

    static boolean a(Context context, String str) {
        return VERSION.SDK_INT < 23 && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0;
    }

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* Access modifiers changed, original: 0000 */
    @CalledByNative
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        if (c || str != null) {
            Context context = akon.a;
            c cVar = new c();
            cVar.d = "SPNEGO:HOSTBASED:".concat(String.valueOf(str));
            cVar.b = AccountManager.get(context);
            cVar.a = j;
            String[] strArr = new String[]{"SPNEGO"};
            cVar.c = new Bundle();
            if (str2 != null) {
                cVar.c.putString("incomingAuthToken", str2);
            }
            if (this.a != null) {
                cVar.c.putBundle("spnegoContext", this.a);
            }
            cVar.c.putBoolean("canDelegate", z);
            if (a(context, "android.permission.GET_ACCOUNTS")) {
                akoo.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
                nativeSetResult(cVar.a, -343, null);
                return;
            }
            cVar.b.getAccountsByTypeAndFeatures(this.b, strArr, new a(cVar), new Handler(ThreadUtils.a().getLooper()));
            return;
        }
        throw new AssertionError();
    }

    public native void nativeSetResult(long j, int i, String str);
}
