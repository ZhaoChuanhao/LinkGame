package com.hd.dto;

import java.awt.*;
import java.util.Objects;

/**
 * @author 赵传昊
 * @date 2018/10/14 15:25
 */
public class MyPoint extends Point {
    public int step;  //起点到该点的步数
    public int change;  //起点到该点的折点数量
    public int direction;  //该点现在所走的方向，0123分别代表上下左右
    public static int[][] next = {{-1,0},{1,0},{0,-1},{0,1}};

    public MyPoint(){
        step = 0;
        change = -1;
        direction = -1;
    }

}
