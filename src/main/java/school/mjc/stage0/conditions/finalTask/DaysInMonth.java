package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int daysNumber;
        if(year<=0||month<=0||month>12){
            System.out.println("invalid date");
        }else {
            switch (month){
                case 4: case 6: case 9: case 11:
                    daysNumber=30;
                    break;
                case 2:
                    switch(year%4){
                        case(0):
                            if(year>=1000&&year%100==0){
                                if(year%400==0){
                                    daysNumber=29;
                                }else{
                                    daysNumber=28;  }
                            }else{
                                daysNumber=29;}
                            break;
                        default:
                            daysNumber=28;
                            break;
                    }
                    break;
                default:
                    daysNumber=31;
                    break;
            }
            System.out.println(daysNumber);
        }

    }
}
