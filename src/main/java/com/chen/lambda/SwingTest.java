package com.chen.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author liu
 * @Date 2018-12-11 14:00
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");
//        jButton.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("按钮被点击");
//            }
//        });
        //event是java编译器能够推断出其类型为ActionEvent，有的是推断不出就需要自己写明
        jButton.addActionListener(event -> {
            System.out.println("按钮被点击");
        });

        jButton.addActionListener((ActionEvent event) -> {
            System.out.println("按钮被点击");
            System.out.println("xxxxxxxxxxxx");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
