//-----------------------------------------------------------------------
// Copyright (c) 2019 Snap Inc.
//-----------------------------------------------------------------------

#define SC_USE_USER_DEFINED_VS_MAIN

#include <std.glsl>
#include <std_vs.glsl>
#include <std_fs.glsl>
#include <depth/float_packing.glsl>

uniform sampler2D mainTexture;
uniform vec4 mainTextureSize;

varying vec2 blurCoordinates[9];

#ifdef VERTEX_SHADER

void setBlurCoordinates(vec2 texCoords, vec4 size) {
    blurCoordinates[0] = texCoords + vec2(0.000000 * size[2], 0.000000 * size[3]);
    blurCoordinates[1] = texCoords + vec2(1.182426 * size[2], 0.000000 * size[3]);
    blurCoordinates[2] = texCoords + vec2(0.000000 * size[2], 1.182426 * size[3]);
    blurCoordinates[3] = texCoords + vec2(-1.182426 * size[2], 0.000000 * size[3]);
    blurCoordinates[4] = texCoords + vec2(0.000000 * size[2], -1.182426 * size[3]);
    blurCoordinates[5] = texCoords + vec2(1.182426 * size[2], 1.182426 * size[3]);
    blurCoordinates[6] = texCoords + vec2(-1.182426 * size[2], 1.182426 * size[3]);
    blurCoordinates[7] = texCoords + vec2(-1.182426 * size[2], -1.182426 * size[3]);
    blurCoordinates[8] = texCoords + vec2(1.182426 * size[2], -1.182426 * size[3]);
}

void main(void)
{
    setBlurCoordinates(texture0, mainTextureSize);
    gl_Position = position;
}

#endif

#ifdef FRAGMENT_SHADER

#if defined(DEPTH_BLUR)
    #define RET_TYPE vec2
    #define TEXTURE_DECODE textureDecode2
#else
    #define RET_TYPE vec4
    #define TEXTURE_DECODE texture2D
#endif

RET_TYPE blur_x() {
    RET_TYPE blurredColor = 0.162103 * TEXTURE_DECODE(mainTexture, blurCoordinates[0]);
    blurredColor += 0.120259 * (TEXTURE_DECODE(mainTexture, blurCoordinates[1]) + TEXTURE_DECODE(mainTexture, blurCoordinates[2]) + TEXTURE_DECODE(mainTexture, blurCoordinates[3]) + TEXTURE_DECODE(mainTexture, blurCoordinates[4]));
    blurredColor += 0.089216 * (TEXTURE_DECODE(mainTexture, blurCoordinates[5]) + TEXTURE_DECODE(mainTexture, blurCoordinates[6]) + TEXTURE_DECODE(mainTexture, blurCoordinates[7]) + TEXTURE_DECODE(mainTexture, blurCoordinates[8]));
    return blurredColor;
}

void main(void)
{
    RET_TYPE blur = blur_x();
#if defined(DEPTH_BLUR)
    gl_FragColor=vec4(encode2(blur.r), encode2(blur.g));
#else
    gl_FragColor = blur;
#endif
}

#endif
