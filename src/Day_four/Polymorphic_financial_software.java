package Day_four;

public class Polymorphic_financial_software {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500.0),
                new StateCSA(10000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income : incomes){
            total = total + income.getTax();
        }
        return total;
    }
}

//普通收入，默认税率10%
class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        return income * 0.1;
    }
}

//薪水收入，如果大于5000才会有税率
class Salary extends Income{
    public Salary(Double income){
        super(income);
    }

    @Override
    public double getTax() {
        if(income < 5000){
            return 0;
        }else{
            return (income - 5000) * 0.2;
        }
    }
}

//特殊类型收入，无税收
class StateCSA extends Income{
    public StateCSA(double income){
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}