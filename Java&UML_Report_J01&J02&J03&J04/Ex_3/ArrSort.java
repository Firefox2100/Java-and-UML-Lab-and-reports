import java.util.Scanner;

public class ArrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        int i;
        arr[0]=10;
        arr[1]=20;
        arr[2]=-9;
        arr[3]=8;
        arr[4]=98;
        int min=0,max=0;
        int temp,j;
        for(i=0;i<5;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        for(i=0;i<4;i++){
            for(j=0;j<4-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
        System.out.println("???????????:" +max);
        System.out.println("???????§³???:"+min);
        System.out.println("?????????????:"); 
        int comp = sc.nextInt();
        int index=-1;
        for(i=0;i<5;i++){
            if(arr[i]==comp){
                index=i;
                break;
            }
        }
        if(index==-1)
            System.out.println("??????"+comp);
        else
            System.out.println("??????¡À???"+index);
        sc.close();
    }
}
