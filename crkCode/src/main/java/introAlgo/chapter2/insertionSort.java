package introAlgo.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class insertionSort {
    public static void main(String args[])
    {
        List<Integer> myList = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i=0; i<50;i++)
        {
            myList.add(rnd.nextInt(100));
        }

        System.out.println(myList);

        int key;
        int idx;
        for(int i=1;i<myList.size();i++)
        {
            key = myList.get(i);
            idx = i-1;
            while(idx>=0 && myList.get(idx)>key){
                myList.set(idx+1,myList.get(idx));
                idx=idx-1;
            }
            myList.set(idx+1,key);
            System.out.println(myList);
        }
    }
}

