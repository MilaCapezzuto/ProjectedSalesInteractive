import java.util.Scanner;
public class ProjectedSalesInteractive
{
  public static void main(String[] args)
  {
  final double INCREASE = 0.10;
  int northSales = 0;
  int southSales = 0;
  double northProjection;
  double southProjection;

  Scanner input = new Scanner(System.in);
  System.out.print("Enter the current year sales for the North division >> ");
  northSales = input.nextInt();
  System.out.print("Enter the current year sales for the South division >> ");
  southSales = input.nextInt();
  northProjection = northSales + northSales * INCREASE;
  southProjection = southSales + southSales * INCREASE;

  System.out.println("The projected sales for the North Division: " + northProjection);
  System.out.println("The projected sales for the South Division: " + southProjection);
  }
}
