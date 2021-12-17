package com.company;

public class GrayScale implements Color {

    int scale;

    public GrayScale(int scale) {
        this.scale = scale;
    }

    @Override
    public RGB toRGB() {
        int r = (scale > 127) ? 255 : scale/2;
        int g = (scale > 127) ? scale/2 : 0;
        int b = (scale > 127) ? scale/2 : 0;

        return new RGB(r, g, b);
    }

    @Override
    public String toString() {
        return "GrayScale{" +
                "scale=" + scale +
                '}';
    }
}
