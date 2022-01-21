package polymorphism;
class Bank121{
int getRateOfInterest(){return 0;}
}
class SBI extends Bank121{
int getRateOfInterest(){return 8;}
}
class ICICI extends Bank121{
int getRateOfInterest(){return 7;}
}
class AXIS extends Bank121{
int getRateOfInterest(){return 9;}
}
class Test1{
public static void main(String args[]){
Bank121 s =new SBI();
}
}

