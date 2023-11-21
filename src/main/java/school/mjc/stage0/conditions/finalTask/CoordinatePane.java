package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String place;
       if (y==0||x==0){
           place="zero";
       }else {
           place=(x>0&&y>0)?
                 "first":
                 x>0&&y<0?
                 "forth":
                 x<0&&y<0?
                 "third":
                 "second";
       }
        System.out.println(place);
    }
}
