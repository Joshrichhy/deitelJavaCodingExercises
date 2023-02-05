package MyDiaryApp;

import java.util.ArrayList;

public class Diary {
    ArrayList <Entry> entries = new ArrayList<>();

        public void createEntry(String title, String body) {
        int ID = entries.size() + 1;
        Entry newEntry = new Entry(title,ID);
        newEntry.writeIntoMyEntry(body);
        entries.add(newEntry);
    }

    public int getPagesInDiary() {
        int page = entries.size();
        return page;
    }

    public Entry findEntryInDiary(int idnumber) {
        Entry idNumber = entries.get(idnumber - 1);

        return idNumber;

    }

    public void writeIntoDiary(int pageNumber, String title, String body) {
        Entry idNumber = entries.get(pageNumber - 1);
        idNumber.writeIntoMyEntry(body);
        idNumber.setTitle(title);
        entries.add(idNumber);
    }
    public void editOrAddingIntoEntry(int Number, String title, String body) {
        Entry idNumber = entries.get(Number - 1);
        if(title == null){title =idNumber.getTitle();}
        else if (body == null){body = idNumber.getbody();}

        idNumber.writeIntoMyEntry(idNumber.getbody() +" " +body);
        idNumber.setTitle(title);
        entries.set(Number-1, idNumber);

    }
    public void overwriteEntry(int Number, String title, String body) {
            Entry idNumber = entries.get(Number - 1);
        if(title == null){title = idNumber.getTitle();}
        else if (body == null){body = idNumber.getbody();}

        idNumber.writeIntoMyEntry(body);
        idNumber.setTitle(title);
        entries.set(Number-1, idNumber);

    }

    public int countEntries() {
        int count = entries.size();
        for (int i = 0; i < entries.size(); i++) {
            if(entries.get(i) == null) {
                count -= 1;}
        }
        return count;
    }

    public String viewEntry(int idNumber) {
        if (entries.get(idNumber-1) == null) return "ooops, you do not have an entry here";
        return findEntryInDiary(idNumber).toString();
    }

    public void deleteEntry(int idNumber) {
        Entry deletedEntry = findEntryInDiary(idNumber);
        entries.remove(deletedEntry);
        entries.add(idNumber-1, null);

       }

    public String viewAllEntry() {
        return entries.toString();
}

public void validateId(int idnumber){
                int validateId = entries.get(idnumber-1).getId();
                if(validateId > entries.size() ) throw new IndexOutOfBoundsException("Invalid ID");
}}
