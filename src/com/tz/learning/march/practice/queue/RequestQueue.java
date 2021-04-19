package com.tz.learning.march.practice.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RequestQueue {
    public static void main(String[] args){
        Queue queue = new LinkedList();
        offerRequestTo(queue);
        process(queue);
    }

    static void offerRequestTo(Queue queue){
        //Scanner scanner = new Scanner(System.in);
        for(int i =0; i<6; i++){
        //while(true){
            //System.out.printf("请输入想要储存的数据");
            //String input = scanner.nextLine();
            /*if(input.equals("quit")){
                break;
            }*/
            Request request = new Request(i) {
                //@Override
                public void execute() {

                    System.out.printf("处理数据%s: %f%n", getI(), Math.random());
                }
            };
            queue.offer(request);
        }
    }

    static void process(Queue queue){
        while(queue.peek() != null){
            Request request =  (Request)queue.poll();
            request.execute();
        }
    }
}
