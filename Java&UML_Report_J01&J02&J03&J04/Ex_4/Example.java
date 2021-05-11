class People{
    protected double weight,height;
    public void speakHello(){
        System.out.println("yayawawa");
    }
    public void averageHeight(){
        height=173;
        System.out.println("average height:"+height);
    }
    public void averageWeight(){
        weight = 70;
        System.out.println("average weight:"+weight);
    }
}

class ChinaPeople extends People{
    @Override
	public void speakHello(){//重写public void speakHello()方法，要求输出"你好，吃饭了吗"汉语信息
        System.out.println("你好，吃饭了吗？");
    }
    @Override
	public void averageHeight(){//重写public void averageHeight()方法，要求输出"中国人的平均身高：173.0厘米"汉语信息
        height=173.0;
        System.out.println("中国人的平均身高："+height+"厘米");
    }
    @Override
    public void averageWeight(){//重写public void averageWeight()方法，要求输出"中国人的平均体重：67.34公斤"汉语信息
        weight = 67.34;
        System.out.println("中国人的平均体重："+weight+"公斤");
    }
	public void chinaGongfu()
	{
        System.out.println("坐如钟，站如松，睡如弓");//输出中国武术信息，例如："坐如钟，站如松，睡如弓"
	}
}

class AmericanPeople extends People
{
    @Override
	public void speakHello(){//重写public void speakHello()方法，要求输出"How do you do"
        System.out.println("How do you do?");
    }
    @Override
	public void averageHeight(){//重写public void averageHeight()方法
        height=173;
        System.out.println("American People's average height:"+height);
    }
    @Override
    public void averageWeight(){//重写public void averageWeight()方法
        weight = 70;
        System.out.println("American People's average weight:"+weight);
    }
	public void americanBoxing()
	{
        System.out.println("直拳、勾拳");//输出拳术信息，例如："直拳、勾拳"
	}
}

class BeijingPeople extends ChinaPeople
{
	public void speakHello(){//重写public void speakHello()方法，要求输出"您好，这里是北京"
        System.out.println("您好，这里是北京");
    }
	public void averageHeight(){//重写public void averageHeight()方法
        height=173.0;
        System.out.println("北京人的平均身高："+height+"厘米");
    }
    public void averageWeight(){//重写public void averageWeight()方法
        weight = 67.34;
        System.out.println("北京人的平均体重："+weight+"公斤");
    }
	public void beijingOpera()
	{
        System.out.println("京剧术语");//输出京剧信息，例如："京剧术语"
	}
}

public class Example
{
	public static void main(String args[])
	{
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		BeijingPeople beijingPeople = new BeijingPeople();
		chinaPeople.speakHello();
          americanPeople.speakHello();
          beijingPeople.speakHello();
		chinaPeople.averageHeight();
		americanPeople.averageHeight();
		beijingPeople.averageHeight();
		chinaPeople.averageWeight();
		americanPeople.averageWeight();
		beijingPeople.averageWeight();
         chinaPeople.chinaGongfu();
         americanPeople.americanBoxing();
         beijingPeople.beijingOpera();
         beijingPeople.chinaGongfu();
	}
}
