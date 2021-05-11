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
	public void speakHello(){//��дpublic void speakHello()������Ҫ�����"��ã��Է�����"������Ϣ
        System.out.println("��ã��Է�����");
    }
    @Override
	public void averageHeight(){//��дpublic void averageHeight()������Ҫ�����"�й��˵�ƽ����ߣ�173.0����"������Ϣ
        height=173.0;
        System.out.println("�й��˵�ƽ����ߣ�"+height+"����");
    }
    @Override
    public void averageWeight(){//��дpublic void averageWeight()������Ҫ�����"�й��˵�ƽ�����أ�67.34����"������Ϣ
        weight = 67.34;
        System.out.println("�й��˵�ƽ�����أ�"+weight+"����");
    }
	public void chinaGongfu()
	{
        System.out.println("�����ӣ�վ���ɣ�˯�繭");//����й�������Ϣ�����磺"�����ӣ�վ���ɣ�˯�繭"
	}
}

class AmericanPeople extends People
{
    @Override
	public void speakHello(){//��дpublic void speakHello()������Ҫ�����"How do you do"
        System.out.println("How do you do?");
    }
    @Override
	public void averageHeight(){//��дpublic void averageHeight()����
        height=173;
        System.out.println("American People's average height:"+height);
    }
    @Override
    public void averageWeight(){//��дpublic void averageWeight()����
        weight = 70;
        System.out.println("American People's average weight:"+weight);
    }
	public void americanBoxing()
	{
        System.out.println("ֱȭ����ȭ");//���ȭ����Ϣ�����磺"ֱȭ����ȭ"
	}
}

class BeijingPeople extends ChinaPeople
{
	public void speakHello(){//��дpublic void speakHello()������Ҫ�����"���ã������Ǳ���"
        System.out.println("���ã������Ǳ���");
    }
	public void averageHeight(){//��дpublic void averageHeight()����
        height=173.0;
        System.out.println("�����˵�ƽ����ߣ�"+height+"����");
    }
    public void averageWeight(){//��дpublic void averageWeight()����
        weight = 67.34;
        System.out.println("�����˵�ƽ�����أ�"+weight+"����");
    }
	public void beijingOpera()
	{
        System.out.println("��������");//���������Ϣ�����磺"��������"
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
