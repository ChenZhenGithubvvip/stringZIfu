package com.chen.ping;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App1 {
    public static void main(String[] args) {
        /*String testFile = "C:\\Users\\Administrator\\Desktop\\no_contact2_2019116.log";
        String str1 = "encIdNum=";
        String str2 = "codeIdNum";
        ReadFiles.readFile(testFile,str1,str2);*/
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test() throws Exception {
        JFrame frame = new JFrame("守护进程"); // 创建指定标题的JFrame窗口对象
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭按钮的动作为退出窗口
        frame.setSize(800, 600); // 设置窗口大小
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // 获得显示器大小对象
        Dimension frameSize = frame.getSize(); // 获得窗口大小对象
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width; // 窗口的宽度不能大于显示器的宽度
        if (frameSize.height > displaySize.height)
            frameSize.height = displaySize.height; // 窗口的高度不能大于显示器的高度
        frame.setLocation((displaySize.width - frameSize.width) / 2, (displaySize.height - frameSize.height) / 2); // 设置窗口居中显示器显示
        frame.setVisible(true); // 设置窗口为可见的，默认为不可见
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea();

        panel.setLayout(new GridLayout());
        textArea.setText("test \n");
        // 当TextArea里的内容过长时生成滚动条
        panel.add(new JScrollPane(textArea));
        frame.add(panel);
        //循环添加文本
        int k = 0;
        while (true) {
            Thread.sleep(1000);
            textArea.append("text=====" + k++ + "     ");
            if (k % 10 == 0) {
                textArea.append(" \n");
            }
        }

    }
}