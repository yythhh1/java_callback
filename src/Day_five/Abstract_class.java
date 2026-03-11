package Day_five;

public class Abstract_class {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
            new Salary(3000),
            new Salary1(7500),
            new Salary2(15000),
        };
        double total = getAllTax(incomes);
        System.out.println(total);
    }
    public static double getAllTax(Income...incomes){
        double allTax = 0.0;
        for(Income income : incomes){
            allTax += income.getTax();
        }
        return allTax;
    }
}

abstract class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public abstract double getTax();
}

class Salary extends Income{
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return income * 0.1;
    }
}
class Salary1 extends Income{
    public Salary1(double income){
        super(income);
    }

    @Override
    public double getTax() {
        if(income > 5000){
            return (income - 5000) * 0.2;
        }else{
            return 0;
        }
    }
}

class Salary2 extends Income{
    public Salary2(double income){
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}