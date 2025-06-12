package Day3;
class Triangle extends Shape{
    double a, b, c ;
    double base, alt;

    Triangle(double alt, double base, double a, double b, double c){
        this.base=base;
        this.alt=alt;
        this.a=a;
        this.b=b;
        this.c=c;

    }
    @Override
        double getarea(){
        return (base*alt)/2;
    }

    @Override 
        double getper(){
        return (a+b+c);
    }
}