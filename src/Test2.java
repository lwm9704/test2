public class Test2 {
    public static  void main(String[] args){
        Test2 test1 = new Test2();
        test1.sort1();
        test1.sort2();
        test1.merge();
        test1.splicing();
        test1.separate();
        test1.count();
    }

    /**
     * {1,23,6,74,8,19,104} 按 从小到大排序
     */
    public void sort1(){
        int temp;
        int[] a = {1,23,6,74,8,19,104};
        for(int i = 0;i < a.length-1;i++){     //冒泡排序
            for(int j = 0;j < a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("-------------数组练习一答案-------------");
        for(int k = 0;k < a.length;k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println("");
    }

    /**
     * 2.	数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
     */
    public void sort2(){
        int[] b = {1,2,3,4,5,5,5,5,5,6,7,8,9};
        int num = b.length;
        int cnt=0 ;
        int[] group = new int[num];    //根据数组b的长度来设置存储新数组的长度
        System.out.println("-------------数组练习二答案-------------");
        for(int i = 0;i < b.length;i++){
            if(b[i] != 5){       //当数组b的元素不是5时存入新数组
                group[cnt++] = b[i];
            }
        }
        for(int k = 0; k < cnt-1; k++){
            System.out.print(group[k]+" ");
        }
        System.out.println("");
    }

    /**
     * 3.	数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序
     */
    public void merge(){
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        int cnt = a.length;
        int num = a.length + b.length;
        int[] c = new int[num];   //根据数组a,b的长度设置合并后新数组的长度
        int temp;
        for(int i = 0; i < a.length; i++){   //将数组a元素存入数组c
            c[i] = a[i];
        }
        for(int k = 0;k < b.length; k++){   //将数组b元数存入数组c
            c[cnt++] = b[k];
        }
        for(int i = 0;i < c.length-1;i++){     //冒泡排序
            for(int j = 0;j < c.length-i-1;j++){
                if(c[j] > c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.println("-------------数组练习三答案-------------");
        for(int k = 0;k < c.length;k++) {
            System.out.print(c[k] + " ");
        }
        System.out.println("");
    }

    /**
     * 4 字符串：“Hello World!”，在字符串前面拼接自己的名字
     */
    public void splicing(){
        String myname = "梁维明";
        String word = "Hello World!";
        String newword = myname.concat(word);  //用concat将两个字符串合并
        System.out.println("-------------字符串操作练习一答案-------------");
        System.out.println(newword);
    }

    /**
     * 5 字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组
     */
    public void separate(){
        String a = "1,2,3,4,5,6,7";
        String[] b = a.split(",");  //用split将字符串分开
        System.out.println("-------------字符串操作练习二答案-------------");
        for(int i = 0;i < b.length;i++){
            if(i==b.length-1){
                System.out.println(b[i]);
            }
            else{
                System.out.print(b[i]+" ");
            }
        }
    }

    /**
     * 6.	计算Hello World! 中出现了几次l
     */
    public void count(){
        int count=0;
        String a="Hello World!";
        String[] b = a.split("l");  //用split将字符串分割
        count=b.length-1;                  //通过分割的段数来推出字符串中含有l的次数
        System.out.println("-------------字符串操作练习三答案-------------");
        System.out.println(count);
    }
}

