package collections.ex;

import java.util.ArrayList;

public class AryLstHw {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(16);
        list.add(22);
        list.add(27);
        System.out.println("List :"+list);
        ArrayList<Integer> even = new ArrayList() ;
        ArrayList<Integer> odd = new ArrayList() ;
        ArrayList<Integer> prime = new ArrayList() ;

//        for(int i : list)
//        {
//            if(i%2 ==0 )
//            {
//                even.add(i);                  // this is also a for-each loop //
//            } else
//            {
//                odd.add(i);
//            }
//        }


        list.forEach(i ->
        {
            int count =0 ;
            if(i%2 ==0 )
            {
                even.add(i);
            } else
            {
                odd.add(i);
            }
            for(int j = 2 ; j<=i/2 ; j++)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                prime.add(i);
            }
        });

        System.out.println("Even :"+even);
        System.out.println("Odd :"+odd);
        System.out.println("Prime :"+prime);


//        int count = 0;
//        for(int j =2 ; j<i/2 ; j++)
//        {
//            if(i%j==0)
//            {
//                count++;                      //  Normal Prime Number
//            }
//        }
//        if(count ==0)
//        {
//            prime.add(i);
//        }
    }
}
