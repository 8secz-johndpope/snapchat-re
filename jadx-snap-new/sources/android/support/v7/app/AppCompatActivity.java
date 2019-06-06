package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import defpackage.gm;
import defpackage.gw;
import defpackage.gw.a;
import defpackage.lj;
import defpackage.ll;
import defpackage.lm;
import net.sqlcipher.database.SQLiteDatabase;

public class AppCompatActivity extends FragmentActivity implements a, ll {
    private lm i;
    private int j = 0;
    private Resources k;

    private boolean d() {
        Intent a = gm.a(this);
        if (a == null) {
            return false;
        }
        boolean shouldUpRecreateTask;
        if (VERSION.SDK_INT >= 16) {
            shouldUpRecreateTask = shouldUpRecreateTask(a);
        } else {
            String action = getIntent().getAction();
            shouldUpRecreateTask = (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }
        if (shouldUpRecreateTask) {
            gw gwVar = new gw(this);
            Intent a_ = a_();
            if (a_ == null) {
                a_ = gm.a(this);
            }
            if (a_ != null) {
                ComponentName component = a_.getComponent();
                if (component == null) {
                    component = a_.resolveActivity(gwVar.b.getPackageManager());
                }
                gwVar.a(component);
                gwVar.a.add(a_);
            }
            if (gwVar.a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) gwVar.a.toArray(new Intent[gwVar.a.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.startActivities(gwVar.b, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                gwVar.b.startActivity(intent);
            }
            try {
                if (VERSION.SDK_INT >= 16) {
                    finishAffinity();
                } else {
                    finish();
                }
            } catch (IllegalStateException unused) {
                finish();
            }
        } else if (VERSION.SDK_INT >= 16) {
            navigateUpTo(a);
        } else {
            a.addFlags(67108864);
            startActivity(a);
            finish();
        }
        return true;
    }

    private lm e() {
        if (this.i == null) {
            this.i = lm.a((Activity) this, (ll) this);
        }
        return this.i;
    }

    public final void a() {
        e().g();
    }

    public final Intent a_() {
        return gm.a(this);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        e().b(view, layoutParams);
    }

    public void closeOptionsMenu() {
        e().a();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        e().a();
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return e().a(i);
    }

    public MenuInflater getMenuInflater() {
        return e().b();
    }

    public Resources getResources() {
        if (this.k == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.k = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.k;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        e().g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e().a(configuration);
        if (this.k != null) {
            this.k.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        lm e = e();
        e.i();
        e.a(bundle);
        if (e.j() && this.j != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.j, false);
            } else {
                setTheme(this.j);
            }
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        e().h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A:{RETURN} */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
        r3 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 1;
        r2 = 26;
        if (r0 >= r2) goto L_0x003f;
    L_0x0007:
        r0 = r5.isCtrlPressed();
        if (r0 != 0) goto L_0x003f;
    L_0x000d:
        r0 = r5.getMetaState();
        r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0);
        if (r0 != 0) goto L_0x003f;
    L_0x0017:
        r0 = r5.getRepeatCount();
        if (r0 != 0) goto L_0x003f;
    L_0x001d:
        r0 = r5.getKeyCode();
        r0 = android.view.KeyEvent.isModifierKey(r0);
        if (r0 != 0) goto L_0x003f;
    L_0x0027:
        r0 = r3.getWindow();
        if (r0 == 0) goto L_0x003f;
    L_0x002d:
        r2 = r0.getDecorView();
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r0 = r0.getDecorView();
        r0 = r0.dispatchKeyShortcutEvent(r5);
        if (r0 == 0) goto L_0x003f;
    L_0x003d:
        r0 = 1;
        goto L_0x0040;
    L_0x003f:
        r0 = 0;
    L_0x0040:
        if (r0 == 0) goto L_0x0043;
    L_0x0042:
        return r1;
    L_0x0043:
        r4 = super.onKeyDown(r4, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        lj a = e().a();
        return (menuItem.getItemId() != 16908332 || a == null || (a.a() & 4) == 0) ? false : d();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* Access modifiers changed, original: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        e().c();
    }

    public void onPostResume() {
        super.onPostResume();
        e().f();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e().b(bundle);
    }

    public void onStart() {
        super.onStart();
        e().d();
    }

    public void onStop() {
        super.onStop();
        e().e();
    }

    /* Access modifiers changed, original: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        e().a(charSequence);
    }

    public void openOptionsMenu() {
        e().a();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        e().b(i);
    }

    public void setContentView(View view) {
        e().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        e().a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.j = i;
    }
}
