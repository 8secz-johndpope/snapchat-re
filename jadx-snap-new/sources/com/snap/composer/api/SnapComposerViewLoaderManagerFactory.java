package com.snap.composer.api;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.composer.ComposerFeature;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.attributes.impl.AttributesBinders;
import com.snap.composer.attributes.impl.fonts.AsyncFontCache;
import com.snap.composer.logger.Logger;
import com.snap.composer.reloader.ComposerReloader;
import com.snap.composer.utils.LoggerUtilsKt;
import com.snap.composer.views.ComposerButton;
import com.snap.composer.views.ComposerImageView;
import com.snap.composer.views.ComposerTextView;
import com.snapchat.client.ClientLoader;
import com.snapchat.client.ClientLoader.Result;
import defpackage.akcr;
import defpackage.zfw;
import defpackage.zgb;

public final class SnapComposerViewLoaderManagerFactory {
    public static final SnapComposerViewLoaderManagerFactory INSTANCE = new SnapComposerViewLoaderManagerFactory();

    private SnapComposerViewLoaderManagerFactory() {
    }

    public final ComposerViewLoaderManager create(Context context, zgb zgb) {
        akcr.b(context, "context");
        LoggerImpl loggerImpl = new LoggerImpl();
        Result checkIfLoadedOrTryToLoad = ClientLoader.checkIfLoadedOrTryToLoad();
        if (!checkIfLoadedOrTryToLoad.success) {
            Logger logger = loggerImpl;
            StringBuilder stringBuilder = new StringBuilder("Failed to load client: ");
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorType);
            stringBuilder.append(' ');
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorName);
            stringBuilder.append(' ');
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorReason);
            LoggerUtilsKt.error(logger, stringBuilder.toString());
        }
        zfw a = zgb != null ? zgb.a(ComposerFeature.INSTANCE, "Composer") : null;
        Logger logger2 = loggerImpl;
        ComposerViewLoaderManager composerViewLoaderManager = new ComposerViewLoaderManager(context, logger2, new AsyncFontCache(context, a, logger2), a != null ? new ComposerReloader(a, loggerImpl, context) : new SnapComposerViewLoaderManagerFactory$create$reloader$1(), new SnapComposerViewLoaderManagerFactory$create$manager$1(a));
        AttributesBinders.INSTANCE.registerAttributesBinders(composerViewLoaderManager);
        composerViewLoaderManager.registerClassReplacement(ImageView.class, ComposerImageView.class);
        composerViewLoaderManager.registerClassReplacement(TextView.class, ComposerTextView.class);
        composerViewLoaderManager.registerClassReplacement(Button.class, ComposerButton.class);
        composerViewLoaderManager.forceBindAllAttributes();
        return composerViewLoaderManager;
    }
}
