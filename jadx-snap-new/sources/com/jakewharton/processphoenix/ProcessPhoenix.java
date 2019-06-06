package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

public final class ProcessPhoenix extends Activity {
    public static void a(Context context) {
        Intent[] intentArr = new Intent[1];
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            intentArr[0] = launchIntentForPackage;
            a(context, intentArr);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unable to determine default activity for ");
        stringBuilder.append(packageName);
        stringBuilder.append(". Does an activity specify the DEFAULT category in its intent filter?");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static void a(Context context, Intent... intentArr) {
        Intent intent = new Intent(context, ProcessPhoenix.class);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList(Arrays.asList(intentArr)));
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        Runtime.getRuntime().exit(0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
