package homework22;

public class MyFirstRepo {

  public static void main(String[] args) {
    System.out.println("Hello World");
  }
  public static double power(double base, int pow){
    if(pow == 0) {
      return 1;
    }
    //если степень отриц-я: применяется след. формула:
    if(pow < 0){
      base = 1.0 / base;  // число в знаменатель
      pow *= -1;          // а степень делаем позитивной
    }
    double res = 1;
    for (int i = 0; i < pow; i++) {
      res *= base;
    }
    return res;
  }


  public static void main(String[] args) {

    System.out.println(power(2, -3));
  }
}
