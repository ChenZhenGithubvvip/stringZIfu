package com.chen.ping.awt;

import com.chen.ping.util.ReadFiles;

import javax.swing.*;
import java.awt.*;

public class Demo1 extends JFrame {

    // 定义组件
    JPanel jp1, jp2, jp3,jp4,jp5;
    JLabel jlb1, jlb2,jlb3;
    JButton jb1, jb2;
    JTextField jtf1,jtf2,jtf3,jtf4;
    JPasswordField jpf1;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Demo1 d1 = new Demo1();

    }
    // 构造函数
    public Demo1() {

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jlb1 = new JLabel("路     径:");
        jlb2 = new JLabel("开始字符:");
        jlb3 = new JLabel("结束字符:");

        jb1 = new JButton("确定");
        jb2 = new JButton("取消");

        jtf1 = new JTextField(50);
        jtf2 = new JTextField(50);
        jtf3 = new JTextField(50);
        jtf4 = new JTextField(50);

        //jpf1 = new JPasswordField(10);// 设置布局管理(上面忘记：extends JFrame，这里出错了)
        this.setLayout(new GridLayout(5, 1));

        // 加入各个组件
        jp1.add(jlb1);
        jp1.add(jtf1);

        jp2.add(jlb2);
        jp2.add(jtf2);
      /*  jp2.add(jlb2);
        jp2.add(jpf1);*/
        jp3.add(jb1);
        jp3.add(jb2);

        jp4.add(jlb3);
        jp4.add(jtf3);

        jp5.add(jtf4);

        // 加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp4);
        this.add(jp3);
        this.add(jp5);


        this.setSize(650, 550);
        this.setTitle("窗口");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        jb1.addActionListener((e) -> {
            String testFile = jtf1.getText();
            String str1 = jtf2.getText();
            String str2 =  jtf3.getText();
            String t = ReadFiles.readFileR(testFile,str1,str2);
            jtf4.setText(t);
        });
    }
}