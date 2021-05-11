class Book {
    String Title;
    int Pdate;
    int Words;

    void setbook(String T, int P, int W){
        Title=T;
        Pdate=P;
        Words=W;
    }

    double price(){
        double s;
        if(Pdate<=182)
            s=1.2;
        else
            s=1.18;
        return ((double)Words/1000.0)*35*s;
    }
}