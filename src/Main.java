public class Main {
    public static void main(String[] args) {
        // первая задача
        int q=1;
        while (q<=10) {
            System.out.print(q + " ");
        ++q;}
        System.out.print("\n");
        for (int w=10; w>=1; w--) {
            System.out.print(w + " ");}
        System.out.print("\n");
        // вторая задача
        int day=6;
        for (int n = 0; n<=31; n++) {
            if ((n-day) %7 ==0) {
                System.out.println("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет.");
            }
        }
        //третья задача
        int thisYear = 2022;
        for (int n=0; n<=(thisYear+100); n=n+79) {
            if ((n>(thisYear-200))&&(n<(thisYear+100))) {
                System.out.println(n);
            }
        }
        //четвертая задача
        for (int n = 1; n<=20; n++) {
            System.out.print(n + ":");
            if ((n%3==0)&&(n%5 !=0)) {
                System.out.print(" ping");}
            if ((n%5==0)&&(n%3 !=0)) {
                System.out.print(" pong");}
            if ((n%3==0)&&(n%5 ==0)) {
                System.out.print(" ping pong");}
            System.out.print("\n");
        }
        //пятая задача
        int z=0;
        int x=1;
        for (int n=1; n<=10; n++) {
            if (z<x) {
            System.out.print(z + " ");
            z=z+x;}
            else {
                System.out.print(x + " ");
                x=z+x;}
        }
    }
}