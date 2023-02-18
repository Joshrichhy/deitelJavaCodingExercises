package Lists;

import java.util.Arrays;

public interface Lists {

        boolean isEmpty();
        void add(int number);
        void remove(int number);
        int size();
        void add(int number, int index);
         int get(int  index);
        int getIndexOf(int number);


      int getCapacity();

   default  boolean contains(int i) {

return false;
   }

    public void output();
}
