package MainPackage;

public class ParentClass{
    public int parameter;

    public ParentClass(){
        this.parameter=0;
        System.out.println("The parameter now is "+this.parameter);
    }
}

public class SubClass extends ParentClass{
    public void setParameter(int p){
        this.parameter=p;
        System.out.println("The parameter now is "+this.parameter);
    }
}