import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentsMarksManagement{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = 1; i<=10; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Marks of The students are "+list);
        for (int i =0; i<list.size(); i+=2){
            System.out.println(list.get(i));
    }
    System.out.println("Enter the searching target value");
    int target = sc.nextInt();
    if (list.contains(target)){
        System.out.println(list.indexOf("Target At Index Value "+target));
    }
    else{
         System.out.println("Marks Not Found");
    }
    System.out.println("Enter New Marks For Student At Index 3: ");
    int newMark=sc.nextInt();
    list.set(3,newMark);
    list.remove(5);
    System.out.println("Updated Students List "+list);
    System.err.println("Total Number Of Students "+ list.size());
    int heighest = Collections.max(list);
    int lowest = Collections.min(list);
    System.out.println("The Heighest Value is "+heighest);
    System.out.println("The Lowest Value is "+lowest);
}
}