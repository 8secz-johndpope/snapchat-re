//-----------------------------------------------------------------------
// Copyright (c) 2017 Snap Inc.
//-----------------------------------------------------------------------

float depthToDisparity(float depth, float numerator)
{
    return clamp(numerator/(depth+0.00001), 0.0, 0.99999);
}

float disparityToDepth(float disparity, float numerator)
{
    return numerator/(disparity+0.00001);
}
