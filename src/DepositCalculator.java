public class DepositCalculator {
    double calculateComplexPercent (double a, double y, int d) {
        #в задании по кодстайлу просили поправить наименования переменных в данном случае amount, yearRate, depositPeriod
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return getRound(pay, 2);
    }

    double calculateSimplePercent (double doubleAmount, double double_year_rate, int deposit_period) {
        #здесь так же amount, yearRate, depositPeriod
        #doubleAmount меняем на amount так как тип переменной в ее названии указывать не надо
        return getRound(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double getRound (double value, int places) {
        double ScaLe = Math.pow(10, places); # ScaLe -> scale
        return Math.round(value * ScaLe) / ScaLe;
    }

    void doImportantJob() {
        int period;
        int action;
        Scanner abcdef = new Scanner(System.in); # abcdef -> scanner

        System.out.println("Введите сумму вклада в рублях:");
        int amount = abcdef.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = abcdef.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = abcdef.nextInt();

        double outDoubleVar = 0; # outDoubleVar -> out

        if (action == 1) {
            outDoubleVar = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            outDoubleVar = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }


}
