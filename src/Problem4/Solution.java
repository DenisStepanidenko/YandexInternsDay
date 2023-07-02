package Problem4;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Map<Long, Long> temp = new HashMap<>(); // id / категория
        String p = scanner.nextLine();
        int n = Integer.parseInt(p);
        ArrayList<Long> temp2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] temp1 = s.split(" ");
            temp.put(Long.parseLong(temp1[0]), Long.parseLong(temp1[1]));
            if (!temp2.contains(Long.parseLong(temp1[1]))) {
                temp2.add(Long.parseLong(temp1[1]));
            } else {
                flag = false;

            }
        }
        String position = scanner.nextLine();

        if (flag) {
            System.out.println(temp2.size());
        } else {
            long answer = Integer.MAX_VALUE;
            Map<Long, Integer> temp4 = new HashMap<>();
            //int[] all = new int[(int) (Collections.max(temp2) + 1)];
            for (int i = 0; i < temp2.size(); i++) {
                temp4.put(temp2.get(i), -1);
            }
            //Arrays.fill(all, -1);
            String[] split = position.split(" ");
            for (int j = 0; j < split.length; j++) {
                long index = Math.toIntExact(temp.get(Long.parseLong(split[j])));
                long number = temp4.get(index);
                if (number == -1) {
                    temp4.put(index, j + 1);
                } else {
                    if (j + 1 - number < answer) {

                        answer = (j + 1 - number);
                        temp4.put(index, j + 1);
                    } else {
                        temp4.put(index, j + 1);
                    }
                }
            }
            System.out.println(answer);
        }

    }
}
