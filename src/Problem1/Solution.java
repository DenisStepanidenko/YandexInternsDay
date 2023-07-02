package Problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int days = Integer.parseInt(split[0]);
        String weekDay = split[1];

        Map<String, Integer> weekDays = new HashMap<>();
        weekDays.put("Monday", 1);
        weekDays.put("Tuesday", 2);
        weekDays.put("Wednesday", 3);
        weekDays.put("Thursday", 4);
        weekDays.put("Friday", 5);
        weekDays.put("Saturday", 6);
        weekDays.put("Sunday", 7);

        int numberOfDay = weekDays.get(weekDay);

        for (int i = 1; i < numberOfDay; i++) {
            System.out.print(".. ");
        }

        int number = 1;
        int transition = number + (7 - numberOfDay);
        for (int i = number; i <= days; i++) {
            if(transition == i){
                if(i / 10 == 0){
                    System.out.println("." + i);
                }
                else{
                    System.out.println(i);
                }
                transition = i + 7;
            }
            else{
                if(i / 10 == 0){
                    System.out.print("." + i + " ");
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }
    }
}
