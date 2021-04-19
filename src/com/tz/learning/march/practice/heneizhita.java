package com.tz.learning.march.practice;

//河内之塔(Towers of Hanoi)是法国人M.Claus(Lucas)于 1883 年从泰国带至法国的，河内为越战时
//北越的首都，即现在的胡志明市； 1883 年法国数学家 Edouard Lucas曾提及这个故事，据说创世
//纪时Benares有一座波罗教塔，是由三支钻石棒（Pag）所支撑，开始时神在第一根棒上放置 64
//个由上至下依由小至大排列的金盘（Disc），并命令僧侣将所有的金盘从第一根石棒移至第三根
//石棒，且搬运过程中遵守大盘子在小盘子之下的原则，若每日仅搬一个盘子，则当盘子全数搬
//运完毕之时，此塔将毁损，而也就是世界末日来临之时
//算法原理：当第一根pag上只有一个disc时，我们只需要将这个disc直接移动到第三根pag上，这时我们设需要移动的次数为a1.
// 当第一根pag上有两个disc时，我们要先将小的那个移到第二根上面，在把大的那个移动到第三根上面，然后把小的从第二根移动到第三根上面，
// 这样就可以完整的将全部disc从第一根移到第三根上面了，这时移动的次数可以看作是a2=a1+1+a1。
// 当第一根pag上面有三个disc时，我们把前两个当成一个整体，然后按照第二个方法的移动方式，先将上面的整体移动到第二根上面，
// 这时用掉的次数为a2=a1+1+a1，然后再将最下面的disc移到第三根上面，这时用的次数为1，然后再将上面的整体从第二根全部移到第三根上面，
// 这样用的次数也为a2=a1+1+a1。所以这个时候a3=a2+1+a2。依照这个方法下去，an= an-1 +1 +an-1————》an= 2an-1 +1是跟等差数列，
// 所以我们可以用等差数列的求和公式进行次数的求和。

import java.util.Scanner;

public class heneizhita {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要处理的盘子个数");
        long count = scanner.nextLong();
        System.out.printf("需要移动的次数是:%s", GetResult(count));
    }
    /*public static double sum(double n)
    {
        double sum;
        if(n==1)
            return 1;
        else
        {
            sum=2*sum(n-1)+1;
        }

        return sum;
    }*/

    public static long GetResult(long count){
        if(count < 1){
            System.out.println("请输入有效的大于0个数");
            return 0;
        }
        if(count == 1){
            return 1;
        }
        return (long)(Math.pow(2, count) - 1);
    }
}
