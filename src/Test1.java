import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {                    //菜单
        System.out.println("----------------项目编号----------------------");
        System.out.println("------1.1+2+3+···+100的和---------------------");
        System.out.println("------2.九九乘法表----------------------------");
        System.out.println("------3.1-100所有整数中的单数-----------------");
        System.out.println("------4.101-200只有的所有素数，并求出所素数的和");
        System.out.println("------5.退出---------------------------------");
        int num;
        do {
            System.out.println("请输入项目编号");
            Scanner n = new Scanner(System.in);
            num = n.nextInt();
            switch (num) {
                case 1:
                    Test1 test1 = new Test1();
                    test1.add();
                    break;
                case 2:
                    Test1 test2 = new Test1();
                    test2.multiply();
                    break;
                case 3:
                    Test1 test3 = new Test1();
                    test3.odd();
                    break;
                case 4:
                    Test1 test4 = new Test1();
                    test4.primeNumber();
                    break;
            }
        }while (num!=5);
    }
    private void add(){           //1-100相加
        int total=0;
        for(int i = 1;i <= 100;i++){
            total+=i;
        }
        System.out.println("total:"+total);
    }
    private  void multiply(){         //九九乘法表
        for(int i = 1;i < 10;i++){
            for(int j = 1;j <= i;j++){
                int num=0;
                num=i*j;
                if(j==i){
                    System.out.println(j+"x"+i+"="+num);
                }
                else{
                    System.out.print(j+"x"+i+"="+num+" ");
                }
            }
        }
    }
    private  void odd(){               //单数
        for(int i = 1;i <= 100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    private void primeNumber(){        //素数
        int i,k;
        int total=0;
        for(i = 101;i <= 200;i++){
            boolean flag=true;
            for(k = 2; k<i ;k++){
                if(i%k==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                System.out.println(i);
                total+=i;
            }
        }
        System.out.println("total:"+total);
    }
}
