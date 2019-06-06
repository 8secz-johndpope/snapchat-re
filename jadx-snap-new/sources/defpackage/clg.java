package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: clg */
public final class clg implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(cld.USER_STORY_MIN_STORIES_FROM_SESSION_START, "ADS.user_story_ad_min_stories_from_start");
            builder.put(cld.USER_STORY_MIN_STORIES_BEFORE_SESSION_END, "ADS.user_story_ad_min_stories_from_end");
            builder.put(cld.USER_STORY_MIN_STORIES_BETWEEN_ADS, "ADS.user_story_ad_min_stories_between_ads");
            builder.put(cld.USER_STORY_MIN_SNAPS_FROM_SESSION_START, "ADS.user_story_ad_min_snaps_from_start");
            builder.put(cld.USER_STORY_MIN_SNAPS_BETWEEN_ADS, "ADS.user_story_ad_min_snaps_between_ads");
            builder.put(cld.USER_STORY_MIN_DURATION_FROM_SESSION_START_SECONDS, "ADS.user_story_ad_min_time_from_start_seconds");
            builder.put(cld.USER_STORY_MIN_DURATION_BETWEEN_ADS_SECONDS, "ADS.user_story_ad_min_time_between_ad_seconds");
            builder.put(cld.OVERRIDE_ENABLE_FLAG_IN_CONTENT_INTERSTITIAL_EXPERIMENT, "ADS.content_interstitial_ad_enabled");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_DURATION_FROM_SESSION_START_SECONDS, "ADS.content_interstitial_ad_min_time_from_start_seconds");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_DURATION_BETWEEN_ADS_SECONDS, "ADS.content_interstitial_ad_min_time_between_ad_seconds");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_SNAPS_BETWEEN_ADS, "ADS.content_interstitial_ad_min_snaps_between_ads");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_STORIES_FROM_SESSION_START, "ADS.content_interstitial_ad_min_stories_from_start");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_STORIES_BEFORE_END, "ADS.content_interstitial_ad_min_stories_from_end");
            builder.put(cld.CONTENT_INTERSTITIAL_MIN_STORIES_BETWEEN_ADS, "ADS.content_interstitial_ad_min_stories_between_ads");
            this.a = builder.build();
        }
        return this.a;
    }
}
