package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
         String para;
        para = divider==0?
                "division by zero":
                dividend%divider==0?
                        "can be divided completely":
                        "cannot be divided completely";
        System.out.println(para);
    }
}
