import java.util.HashMap;

import java.util.Scanner;


public class hashset {
    public static int gcd(int a,int b){
        while (b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void phantich(int n){
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if (n%i==0)
            {
                while(n%i==0){
                    System.out.print(i+ " ");
                    n/=i;
                }
            }
        }
        if(n>1)
        System.out.println(n);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] a = new int[100];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (map.containsKey(a[i])) {
                    int tansuat = map.get(a[i]);
                    ++tansuat;
                    map.put(a[i], tansuat);
                } else {
                    map.put(a[i], 1);
                }
            }
            for (int i = 0; i < n; i++) {
                if (map.containsKey(a[i])) {
                    System.out.print(a[i] + " " + map.get(a[i]) + " ");
                    map.remove(a[i]);
                }
            }
        }
        
    }

