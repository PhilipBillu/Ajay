import java.util.Scanner;
public class ToDoList {
    Scanner in = new Scanner(System.in);
    String[] addTask = new String[25];
    int delete, cnt = 0;
    String temp;
    public void one() {
        System.out.print("Enter your task " + (cnt + 1) + " : ");
        temp = in.nextLine();
        addTask[cnt] = temp;
        cnt++;
    }
    public void two() {
        System.out.print("Which task do you like to delete[mention it serial No ] : ");
        delete = in.nextInt();
        for (int i = delete-1; i < cnt; i++) {
            addTask[i] = addTask[i+1];
        }
    }
    public void three() {
        System.out.println("-----list of works-----");
        int work = 1;
        for (int j = 0; j < addTask.length; j++) {
            if (addTask[j] != null) {
                System.out.println(work + " " + addTask[j]);
                work++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        ToDoList obj = new ToDoList();
        System.out.print("-----to-do-list---------");
        System.out.print("\n1.add task\t2.delete task\t3.view task\t4.Exit\nEnter your choice[press No ] : ");
        int ch = out.nextInt();
        while (ch < 4) {
            switch (ch) {
                case 1:
                    obj.one();
                    break;
                case 2:
                    obj.two();
                    break;
                case 3:
                    obj.three();
                    break;
            }
            System.out.print("\n1.add task\t2.delete task\t3.view task\t4.Exit\nEnter your choice[press No ] : ");
            ch = out.nextInt();
        }
    }
}
