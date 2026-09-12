package org.lzmhc.panel.tab;

import lombok.extern.log4j.Log4j;
import org.lzmhc.utils.IconUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.logging.Logger;

public class AboutTab extends JPanel{
    public AboutTab(){
        JLabel title = new JLabel(IconUtil.loadIcon("img/logo.png",256));
        JLabel label=new JLabel("使用OSHI模块和FlatLaf开发的一款可视化系统信息面板。");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel btnlabel=new JLabel(IconUtil.loadIcon("img/github-mark-white.png",64),0);
        btnlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    Runtime.getRuntime().exec("xdg-open https://github.com/lzmhc/Panel-Htop");
                }catch (Exception err){
                    err.printStackTrace();
                }
            }
        });
        LayoutManager Layout=new GridLayout(3,1);
        this.setLayout(Layout);
        this.add(title);
        this.add(label);
        this.add(btnlabel);
    }
}