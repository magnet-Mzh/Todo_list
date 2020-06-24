package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        repeat();
        Scanner sc1 = new Scanner(System.in);
        int choose = sc1.nextInt();
        ArrayList<EventMark> list = new ArrayList<>();

        while(choose != 4){
            if(choose == 1){
                System.out.println("欢迎来到添加界面,请输入添加事项名称");
                Scanner sc2 = new Scanner(System.in);
                String thing = sc2.next();
                EventMark event = new EventMark(thing,true);
                list.add(event);
                System.out.println("恭喜,添加成功!");
            }else if(choose == 2){
                showList(list);
                System.out.println("欢迎来到删除界面,请输入删除事项的序号");
                Scanner sc3 = new Scanner(System.in);
                int index = sc3.nextInt();
                if(index < 0 || index >list.size()-1){
                    System.out.println("删除失败");
                }else{
                    list.remove(index);
                    System.out.println("删除成功");
                }
            }else if(choose == 3){
                showList(list);
                System.out.println("欢迎来到修改界面,请输入修改事项的序号");
                int index = sc1.nextInt();
                if(index < 0 || index > list.size()-1){
                    System.out.println("修改失败");
                }else{
                    list.get(index).setUnfinshed(false);
                    System.out.println("修改成功");
                }
            }else if(choose == 4){
                showList(list);
            }else{
                System.out.println("退出程序");
                break;
            };
            repeat();
            System.out.println("请输入你所需的服务对应的数字:");
            choose = sc1.nextInt();
        }
    }
    public static void showList(ArrayList<EventMark> list){
        for (int i = 0; i < list.size(); i++) {
            String str1 = "还未完成";
            String str2 = "已经完成";
            String str;
            if(list.get(i).isUnfinshed()){
                str = str1;
            }else{
                str = str2;
            }
            System.out.println(i+":"+list.get(i).getThing()+",该事项"+str);
        }
    }
    public static void repeat(){
        System.out.println("============================");
        System.out.println("欢迎进入Todo list应用程序,您可以通过输入键盘上的数字获取响应的服务:");
        System.out.println("输入1:添加代办事项");
        System.out.println("输入2:删除代办事项");
        System.out.println("输入3:修改代办事项为完成");
        System.out.println("输入4:展示所有事项");
        System.out.println("输入5:退出当前程序");
        System.out.println("下面请输入你选择服务的对应数字:");
        System.out.println("============================");
    }
}
