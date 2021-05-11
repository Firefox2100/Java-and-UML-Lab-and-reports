class CCircle   {
  final double Pi=3.14159;    
  double radius;
  double getRadius(){
      return radius;
    }
  public CCircle(){
      this.radius=0;
  }
  void setCircle(double r){
      radius=r;
   }
   double getarea(){
       return Pi*radius*radius;
   }
}
