public class Task1 {
    public static void task1() {
        int answer = 0;
        for(int i = 0; i <= 1000; i++)
            if(i % 3 == 0 || i % 5 == 0)
                answer += i;
        System.out.println(answer);
    }
}
