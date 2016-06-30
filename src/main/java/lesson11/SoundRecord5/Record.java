package lesson11.SoundRecord5;



import java.util.ArrayList;

/**
 * Created by lapte on 01.06.2016.
 */
public class Record {
    private ParentRecord [] records;
    private int allRecordsDuration;


    public Record(ParentRecord[] records, int allRecordsDuration) {
        setRecords(records);
        setAllRecordsDuration(allRecordsDuration);
    }

    public ParentRecord[] getRecords() {
        return records;
    }

    public void setRecords(ParentRecord[] records) {
        this.records = records;
    }

    public int getAllRecordsDuration() {
        return allRecordsDuration;
    }

    public void setAllRecordsDuration(int allRecordsDuration) {
        this.allRecordsDuration = allRecordsDuration;
    }


    // Метод ищет музыкальные композиции из сборника, длительность которых находится
    // в интервале [minDuration,maxDuration].
    // Метод возвращает список, содержащий индексы искомых музыкальны[ композициq.

    public ArrayList<Integer> findAMusicalComposition(ParentRecord[] musicalCompositions, int minDuration, int maxDuration) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < musicalCompositions.length; i++) {
            if (musicalCompositions[i].getDuration() >= minDuration &&
                    musicalCompositions[i].getDuration() <= maxDuration) {
                al.add(i);
            }
        }
        if (al.size() != 0) {
            System.out.println("Искомые музыкальные композиции: ");

            String musicalCompositionsTableFormat = "%-30s%-30s%-30s%n";
            String s1 = String.format(musicalCompositionsTableFormat, "PositionNumber", "Title", "Duration");
            String s2 = "-----------------------------------------------------------------------------";
            System.out.println(s1 + "\n" + s2 + "\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(musicalCompositions[al.get(i)]);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else {
            System.out.println("Музыкальных композиций с длительностью " +
                    "от " + minDuration + " до " + maxDuration + " нет.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        return al;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < records.length; i++) {
            str += records[i].toString() + "\n";

        }


        String musicalCompositionsTableFormat = "%-30s%-30s%-30s%n";
        String s1 = String.format(musicalCompositionsTableFormat, "PositionInTheCategory", "Title", "Duration");
        String s2 = "-----------------------------------------------------------------------------";



        String s3 = "AllRecordsDuration: " + getAllRecordsDuration() + " min.";
        return s1 + "\n" + s2 + "\n" + str + "\n" + s3;


    }




}
