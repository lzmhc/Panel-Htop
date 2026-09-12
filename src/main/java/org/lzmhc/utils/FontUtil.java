package org.lzmhc.utils;

import java.awt.*;
import java.io.*;
import java.net.URL;

public class FontUtil {
    public static Font loadFont(String path, float fontSize){
        try(InputStream inputStream = FontUtil.class
                    .getClassLoader()
                    .getResourceAsStream(path)){
            Font sunFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            return sunFont.deriveFont(fontSize);
        }catch (Exception e){
            throw new RuntimeException("font load error" + e);
        }
    }
}
