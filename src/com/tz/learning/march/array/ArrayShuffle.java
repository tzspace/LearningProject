package com.tz.learning.march.array;

import java.util.*;

public class ArrayShuffle {
    //洗牌算法： https://blog.csdn.net/zhanggonglalala/article/details/103197411
    /*public static void main(String[] args){
        char[] style = new char[]{'桃','砖','心','梅'};
        String[] number = new String[]{"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<String> list = new ArrayList();
        for(char i: style){
            for(String j: number){
                list.add(i + " " + j + " ");
            }
        }
        Collections.shuffle(list);
        for(String item: list){
            System.out.print(item);
        }
    }*/

    /*public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //将52个数字放入一个List中
        for(int i=0;i<52;i++){
            list.add(i);
        }
        Collections.shuffle(list); //随机打乱list数据

        //按要求输出
        String[] flowers = {"桃", "砖", "梅", "心"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<52;i++){
            System.out.print(flowers[list.get(i)%4] + " " + numbers[list.get(i)/4] + " ");
            if(i%13==12){
                System.out.print('\n');
            }
        }
    }*/
    public static void main(String[] args) {
        int[] array = new int[]{44,67,8,5,3,21,43,22};
        Random random = new Random();
        int length = array.length;
        for (int i = length; i > 1; i--) {
            // 把随机位置交换到当前位置，既然是随机，就应该保证位置可能不变的情况，因此 random.nextInt 取 i
            // 谢谢 [virtualspider](https://www.jianshu.com/u/cfb9abcf0c97) 的提醒
            swap(array, i-1, random.nextInt(i));
        }

        for(int j: array){
            System.out.print(j + " ");
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
