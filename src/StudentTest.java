/**
 * StudentTest类
 * LiangWeiMing
 * 2020/3/4-17:10
 */
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        /*
        创建list1及往里添加对象
         */
        List<Student> list1 = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.setRecord(80);
        stu1.setGrade("1班");
        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(19);
        stu2.setRecord(100);
        stu2.setGrade("1班");
        Student stu3 = new Student();
        stu3.setName("王五");
        stu3.setAge(17);
        stu3.setRecord(59);
        stu3.setGrade("1班");
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);
                /*
        创建list2及往里添加对象
         */
        List<Student> list2 = new ArrayList<>();
        Student stu4 = new Student();
        stu4.setName("赵六");
        stu4.setAge(18);
        stu4.setRecord(85);
        stu4.setGrade("2班");
        Student stu5 = new Student();
        stu5.setName("刘七");
        stu5.setAge(19);
        stu5.setRecord(93);
        stu5.setGrade("2班");
        Student stu6 = new Student();
        stu6.setName("孙八");
        stu6.setAge(17);
        stu6.setRecord(55);
        stu6.setGrade("2班");
        list1.add(stu4);
        list1.add(stu5);
        list1.add(stu6);

        StudentTest test1 = new StudentTest();
        List<Student> list = new ArrayList<>();
        list = test1.integration(list1,list2);
        test1.sort(list);
        test1.fail(list);
        test1.find(list);
        test1.eliminate(list);
    }
    /*
    （1）整合两个list学生信息成一个新的list
     */
    public List<Student> integration(List<Student> list1,List<Student> list2){
        List<Student> list3 = new ArrayList<>();
        list3.addAll(list1);      //将list1添加到list3
        list3.addAll(list2);      //将list2添加到list3
        System.out.println("------------1整合-------------");
        for(int i = 0;i < list3.size();i++){
            System.out.print("name:"+list3.get(i).getName()+"  ");
            System.out.println("age:"+list3.get(i).getAge());
            System.out.print("record:"+list3.get(i).getRecord()+"  ");
            System.out.println("grade:"+list3.get(i).getGrade());
        }
        return list3;
    }
    /*
    （2）按照分数给出学生信息排名
     */
    public void  sort(List<Student> list3){
        Student temp = new Student();
        for(int i = 0;i < list3.size()-1;i++){        //冒泡排序
            for(int k = 0;k < list3.size()-i-1;k++){
                if(list3.get(k).getRecord() < list3.get(k+1).getRecord()){
                    temp = list3.get(k);
                    list3.set(k,list3.get(k+1));
                    list3.set(k+1,temp);
                }
            }
        }
        System.out.println("------------2排名-------------");
        for(int j = 0;j < list3.size();j++){
            System.out.print("name:"+list3.get(j).getName()+"  ");
            System.out.println("age:"+list3.get(j).getAge());
            System.out.print("record:"+list3.get(j).getRecord()+"  ");
            System.out.println("grade:"+list3.get(j).getGrade());
        }

    }
    /*
    （3）输出不及格的学生信息
     */
    public void fail(List<Student> list3){
        List<Student> faillist = new ArrayList<>();
        System.out.println("------------3.不及格-------------");
        for(int i = 0;i < list3.size();i++){
            if(list3.get(i).getRecord() < 60){      //筛选成绩小于60的人
                faillist.add(list3.get(i));
                System.out.print("name:"+list3.get(i).getName()+"  ");
                System.out.println("age:"+list3.get(i).getAge());
                System.out.print("record:"+list3.get(i).getRecord()+"  ");
                System.out.println("grade:"+list3.get(i).getGrade());
            }
        }
    }
    /*
    （4）查找张三的信息
     */
    public void find(List<Student> list3){
        System.out.println("------------4查找张三信息-------------");
        for(int i = 0;i < list3.size();i++){
            if(list3.get(i).getName().equals("张三")){     //比较list3中的信息是否有张三
                System.out.print("name:"+list3.get(i).getName()+"  ");
                System.out.println("age:"+list3.get(i).getAge());
                System.out.print("record:"+list3.get(i).getRecord()+"  ");
                System.out.println("grade:"+list3.get(i).getGrade());
            }
        }
    }
    /*
    （5）从list剔除年龄大于18岁的学生信息
     */
    public void eliminate(List<Student> list3){
        for(int i = 0;i < list3.size();i++){
            if(list3.get(i).getAge() > 18){      //筛选年龄大于18的
                list3.remove(list3.get(i));
            }
        }
        System.out.println("------------剔除年龄大于18的-------------");
        for(int k = 0;k < list3.size();k++){
            System.out.print("name:"+list3.get(k).getName()+"  ");
            System.out.println("age:"+list3.get(k).getAge());
            System.out.print("record:"+list3.get(k).getRecord()+"  ");
            System.out.println("grade:"+list3.get(k).getGrade());
        }
    }
}
