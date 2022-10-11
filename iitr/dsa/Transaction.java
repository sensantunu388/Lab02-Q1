package com.gl.iitr.dsa;
import java.util.Scanner;
class Transaction {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the size of the transaction array: ");
       int size=S.nextInt();
       int arr[]=new int[size];
        System.out.println("Enter the values of array: ");
        for(int i=0;i<size;i++)
            arr[i]=S.nextInt();
        System.out.println("Enter the total no. of targets that are needed to be achieved: ");
        int targetNo=S.nextInt();
        while(targetNo--!=0){
            int flag=0;
            long target;
            System.out.println("Enter the value of the target: ");
            target =S.nextInt();
            long sum=0;
            for(int i=0;i<size;i++){
                sum += arr[i];
                if (sum >= target){
                    System.out.println("Targets achieved after "+(i+1)+" transactions.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("given target isn't achieved.");
            }
        }
    }
}
