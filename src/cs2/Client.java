package cs2;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用通讯录管理系统");
        System.out.println("--------------------------------");
        database d = new database();
        d.systemInit();

        System.out.println("--------------------------------");
        System.out.println("您想要进行的操作是：");
        System.out.println("1 添加好友  2 删除好友  3 查找好友   4 修改好友信息   5 退出系统");
        System.out.println("=============================================");


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = true;

        while (b){
            if (a == 0){
                System.out.println("您想要进行的操作是：");
                System.out.println("1 添加好友  2 删除好友  3 查找好友   4 修改好友信息   5 退出系统");
                System.out.println("=============================================");
                Scanner ag = new Scanner(System.in);
                int s = ag.nextInt();
                a = s;
            }

            if (a == 1){
                System.out.println("请输入新联系人的姓名");
                Scanner n = new Scanner(System.in);
                String nam = n.nextLine();

                System.out.println("请输入新联系人的年龄");
                Scanner ag = new Scanner(System.in);
                String age = ag.nextLine();

                System.out.println("请输入新联系人的电话号码");
                Scanner nu = new Scanner(System.in);
                String num = nu.nextLine();

                Person person = new Person(nam,age,num);

                database database = new database();
                database.add(person);

                System.out.println(person.toString());

                System.out.println("输入成功！！！");

                a = 0;
            }
            else if (a == 2) {

                System.out.println("请输入你要删除的人的编号");
                Scanner n = new Scanner(System.in);
                int nam = n.nextInt();
                database database = new database();
                database.delete(nam-1);
                System.out.println("删除成功");
                a = 0;;

            }
            else if (a == 3) {
                System.out.println("请输入你要查找的人的编号");
                Scanner n = new Scanner(System.in);
                int nam = n.nextInt();
                database database = new database();
                System.out.println(database.getPerson(nam-1));
                a = 0;

            }
            else if (a == 4) {

                System.out.println("请输入你要修改的人的编号");
                Scanner n = new Scanner(System.in);
                int nam = n.nextInt();
                System.out.println("请输入修改后的信息");


                database database = new database();
                Scanner scanner=new Scanner(System.in);
                scanner.nextLine();
                System.out.println("请输入新的姓名: ");
                String newName = scanner.nextLine();
                System.out.println("请输入新的年龄: ");
                String newAddress = scanner.nextLine();
                System.out.println("请输入新的电话号码: ");
                String newPhoneNumber = scanner.nextLine();
                Person editedPerson = new Person(newName, newAddress, newPhoneNumber);
                database.editPerson(nam-1, editedPerson);

                System.out.println("修改成功");
            }
            else {
                b = false;
            }

            d.writePerson();
        }
    }
}
