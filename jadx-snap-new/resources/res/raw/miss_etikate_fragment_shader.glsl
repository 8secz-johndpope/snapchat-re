#version 100

#extension GL_OES_EGL_image_external : require

precision highp float;

const float EPSILON = 0.0001;

varying vec2 vTexCoord;

#if defined (EXTERNAL_OES_VIDEO_TEXTURE)
uniform samplerExternalOES sVideoTexture;
#elif defined (TEXTURE_2D_VIDEO_TEXTURE)
uniform sampler2D sVideoTexture;
#endif

uniform sampler2D sMissEtikateLookupTexture;

vec3 mapColor(vec3 orgColor) {
    const vec3 pxSize = vec3(256.0, 256.0, 16.0);

    float bValue = orgColor.b * 15.0;

    vec2 mulB = clamp(floor(bValue) + vec2(0.0, 1.0), 0.0, 15.0);
    vec3 lookup = orgColor.rrg * (15.0/pxSize) + vec3(mulB * (16.0/pxSize.x), 0.0) + 0.5/pxSize;
    float b1w = bValue - mulB.x;

    vec3 sampled1 = texture2D(sMissEtikateLookupTexture, lookup.xz).rgb;
    vec3 sampled2 = texture2D(sMissEtikateLookupTexture, lookup.yz).rgb;

    vec3 res = mix(sampled1, sampled2, b1w);
    return res;
}

void main() {
    vec4 videoSample = texture2D(sVideoTexture, vTexCoord);

    if (videoSample.a < EPSILON) {
        gl_FragColor = videoSample;
        return;
    }

    //TODO: Swizzling some operations may have performance benefits
    //(https://github.com/Snapchat/camera-android-transcoding-library/pull/66#discussion_r28468009)
    vec4 missEtikateLookupSample = texture2D(sMissEtikateLookupTexture, vTexCoord);
    vec3 baseTexture = videoSample.rgb;
    baseTexture = clamp(baseTexture, 0.0, 1.0);

    vec3 color = mapColor(baseTexture);
    gl_FragColor = vec4(color, 1.0);
}
