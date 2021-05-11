class Student{
    String name;
    double scores[]=new double[3];
    double credit[]=new double[3];

    void setname(String n){
        name=n;
    }

    void setscore(int index, double s, double c){
        if(s>85)
            scores[index-1]=4;
        else if(s>75)
            scores[index-1]=3;
        else if(s>60)
            scores[index-1]=2;
        else if(s>45)
            scores[index-1]=1;
        else
            scores[index-1]=0;
        
        credit[index-1]=c;
    }

    double getGPA(){
        return (scores[0]*credit[0]+scores[1]*credit[1]+scores[2]*credit[2])/(credit[0]+credit[1]+credit[2]);
    }
}

public class GPAconvert{
    public static void main(String args[]){
        Student zhang=new Student();
        Student li=new Student();
        Student zhao=new Student();
        zhang.setname("��");
        li.setname("��");
        zhao.setname("��");
        zhang.setscore(1, 71.5, 4);
        zhang.setscore(2, 80.4, 3.5);
        zhang.setscore(3, 95.5, 3);
        li.setscore(1, 78.5, 4);
        li.setscore(2, 54.5, 3);
        li.setscore(3, 60.5, 3);
        zhao.setscore(1, 88.5, 4);
        zhao.setscore(2, 92.5, 3.5);
        zhao.setscore(3, 71.5, 3);
        System.out.println("��ͬѧ��GPA��"+zhang.getGPA());
        System.out.println("��ͬѧ��GPA��"+li.getGPA());
        System.out.println("��ͬѧ��GPA��"+zhao.getGPA());
    }
}