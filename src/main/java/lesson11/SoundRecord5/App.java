package lesson11.SoundRecord5;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lapte on 01.06.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {
        //ParentRecord(int positionInTheCategory, String name, int duration)

        ParentRecord[] records = new ParentRecord[6];
        records[0] = new JazzSong(1, "", 5);
        records[1] = new JazzSong2(2, "", 10);
        records[2] = new MoonSonata(2, "", 15);
        records[3] = new NothingElseMetters(2, "", 4);
        records[4] = new ShowMustGoOn(1, "", 3);
        records[5] = new Symphony40(1, "", 7);

        int allRecordsDuration = 0;
        for (int i = 0; i < 6; i++) {
            allRecordsDuration += records[i].getDuration();
        }


        Record record = new Record(records, allRecordsDuration);




        ArrayList<ParentRecord> classicRecords = new ArrayList<ParentRecord>();
        ArrayList<ParentRecord> jazzRecords = new  ArrayList<ParentRecord>();
        ArrayList<ParentRecord> rockRecords = new ArrayList<ParentRecord>();

        for (int i = 0; i < records.length; i++) {
            if(records[i] instanceof ClassicStyle){
                classicRecords.add(records[i]);
            }
            if(records[i] instanceof JazzStyle){
                jazzRecords.add(records[i]);
            }
            if(records[i] instanceof RockStyle){
                rockRecords.add(records[i]);
            }
        }

        ParentRecord[] classicRecordsArray = new ParentRecord[classicRecords.size()];
        ParentRecord[] jazzRecordsArray = new ParentRecord[jazzRecords.size()];
        ParentRecord[] rockRecordsArray = new ParentRecord[rockRecords.size()];


        for (int i = 0; i < classicRecordsArray.length; i++) {
            classicRecordsArray[i] = classicRecords.get(i);
        }

        for (int i = 0; i < jazzRecordsArray.length; i++) {
            jazzRecordsArray[i] = jazzRecords.get(i);
        }

        for (int i = 0; i < rockRecordsArray.length; i++) {
            rockRecordsArray[i] = rockRecords.get(i);
        }


        int classicRecordsDuration = 0;
        for (int i = 0; i < classicRecordsArray.length; i++) {
            classicRecordsDuration += classicRecordsArray[i].getDuration();
        }

        int jazzRecordsDuration = 0;
        for (int i = 0; i < jazzRecordsArray.length; i++) {
            jazzRecordsDuration += jazzRecordsArray[i].getDuration();
        }

        int rockRecordsDuration = 0;
        for (int i = 0; i < rockRecordsArray.length; i++) {
            rockRecordsDuration += rockRecordsArray[i].getDuration();
        }


        Record classicRecord = new Record(classicRecordsArray, classicRecordsDuration);
        Record jazzRecord = new Record(jazzRecordsArray, jazzRecordsDuration);
        Record rockRecord = new Record(rockRecordsArray, rockRecordsDuration);


        System.out.println("Несортированный список музыкальных композиций: ");
        System.out.println(record);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Длительность всех музыкальных композиций: " + allRecordsDuration + " мин.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
// Сортировка музыкальных композиций по порядку для каждого стиля.
        Arrays.sort(classicRecordsArray, new positionComparator());
        Arrays.sort(jazzRecordsArray, new positionComparator());
        Arrays.sort(rockRecordsArray, new positionComparator());

        System.out.println("Список музыкальных композиций, отсортированных по стилям: ");
        System.out.println("Классика: ");
        System.out.println(classicRecord.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Джаз: ");
        System.out.println(jazzRecord.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Рок: ");
        System.out.println(rockRecord.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Найдём музыкальные композиции в сборнике, соответствующие заданному" +
                " диапазону длительности (Duration) [5, 7]: ");
        ArrayList<Integer> listOfTheRecordsIndexesWithDefiniteDuration = record.findAMusicalComposition(records, 5, 7);

    }
    /*
    private static class JazzComparator implements java.util.Comparator<JazzStyle> {

        @Override
        public int compare(JazzStyle o1, JazzStyle o2) {
            return o1.getPositionInTheCategory() - o2.getPositionInTheCategory();
        }
    }

    private static class ClassicComparator implements java.util.Comparator<ClassicStyle> {

        @Override
        public int compare(ClassicStyle o1, ClassicStyle o2) {
            return o1.getPositionInTheCategory() - o2.getPositionInTheCategory();
        }
    }

    private static class RockComparator implements java.util.Comparator<RockStyle> {

        @Override
        public int compare(RockStyle o1, RockStyle o2) {
            return o1.getPositionInTheCategory() - o2.getPositionInTheCategory();
        }
    }
    */

    private static class positionComparator implements java.util.Comparator<ParentRecord> {

        @Override
        public int compare(ParentRecord o1, ParentRecord o2) {
            return o1.getPositionInTheCategory() - o2.getPositionInTheCategory();
        }
    }
}
