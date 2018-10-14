package com.hd.test;

import com.hd.dto.MyPoint;
import com.hd.dto.Panel;
import com.hd.utils.LinkUtil;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2018/10/9
 */
public class TestMain {

    public static void main(String[] args) {

        Panel panel = new Panel();
        Object[][] objects = panel.getObjects();
        int count = Panel.WIDTH * Panel.HEIGHT;
        while (count > 0){
            for (int i = 1; i <= Panel.WIDTH; i++){
                System.out.print("|");
                for (int j = 1; j <= Panel.HEIGHT; j++){
                    System.out.print(" " + objects[i][j] + " |");
                }
                System.out.println();
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入第一个元素的坐标：");
            MyPoint point1 = new MyPoint();
            point1.x = scan.nextInt();
            point1.y = scan.nextInt();
            System.out.println("请输入第二个元素的坐标：");
            MyPoint point2 = new MyPoint();
            point2.x = scan.nextInt();
            point2.y = scan.nextInt();

            if(LinkUtil.link(objects, point1, point2)){
                objects[point1.x][point1.y] = " ";
                objects[point2.x][point2.y] = " ";
                count -= 2;
                System.out.println("连接成功！");
            }else {
                System.out.println("无法相连！");
            }
        }
        System.out.println("游戏结束！");
    }
}
