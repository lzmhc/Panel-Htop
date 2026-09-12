package org.lzmhc.utils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconUtil {
    public static ImageIcon loadIcon(String resourcePath, int px) {
        URL url = IconUtil.class
                .getClassLoader()
                .getResource(resourcePath);
        if (url == null) {
            throw new IllegalArgumentException("Not Found: " + resourcePath);
        }
        Image image = new ImageIcon(url).getImage();
        Image scaleImg = image.getScaledInstance(px,px,Image.SCALE_SMOOTH);
        return new ImageIcon(scaleImg);
    }
}
