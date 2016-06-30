package lesson09;

import java.util.Comparator;

/**
 * Created by lapte on 21.05.2016.
 */
public class Abiturient4 extends Human{
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;

    public Abiturient4(int id, String lastName,
                       String firstName, String otchestvo,
                       int dayOfBirth, int monthOfBirth,
                       int yearOfBirth, String address,
                       String telephone,
                       int mark1, int mark2, int mark3, int mark4, int mark5 ) {
        super(id, lastName, firstName, otchestvo, 1, 1, 2000, address, telephone);
        setMark1(mark1);
        setMark2(mark2);
        setMark3(mark3);
        setMark4(mark4);
        setMark5(mark5);
    }


    public int getMark4() {
        return mark4;
    }

    public void setMark4(int mark4) {
        this.mark4 = mark4;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getMark5() {
        return mark5;
    }

    public void setMark5(int mark5) {
        this.mark5 = mark5;
    }

    @Override
    public String toString() {
        return "Abiturient4{" + super.toString() +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ", mark4=" + mark4 +
                ", mark5=" + mark5 +
                '}';
    }


    public class AbiturientComparator implements Comparator<Abiturient4> {

        //Сортировка от большего к меньшему.
        @Override
        public int compare(Abiturient4 o1, Abiturient4 o2) {
            int sum1 = o1.getMark1()+o1.getMark2()+o1.getMark3()+o1.getMark4()+o1.getMark5();
            int sum2 = o2.getMark1()+o2.getMark2()+o2.getMark3()+o2.getMark4()+o2.getMark5();
            int result =0;
            if(sum1<sum2){result =1;}
            else if (sum1>sum2){result =-1;}
            else if (sum1==sum2){result =0;}
            return result;
        }
    }
}
