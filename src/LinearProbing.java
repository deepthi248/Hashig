import java.util.ArrayList;
import java.util.Enumeration;

public class LinearProbing {
    public static void main(String[]args){
        int hashSize =10;
        int arr [] = {4,  14, 24, 44};
                //{9, 99, 999, 9999};

        // Linear probing
        //step1 -- creating arrayList


        ArrayList<Integer> myList = new ArrayList<>(hashSize);

        for( int i =0;i<hashSize;i++)
                myList.add(i,-1); // intialising the list with -1

        for( int i = 0; i< arr.length;i++){
            int hashValue = arr[i] % hashSize;
            if( myList.get(hashValue) == -1 )
                    myList.set(hashValue, arr[i]);
            else if ( hashValue != hashSize-1  ){
                for( int j = hashValue; j < hashSize; j++){
                    if(myList.get(j) == -1) {
                        myList.set(j, arr[i]);
                        break;
                    }
                }
            }
            else{
                for( int k = 0; k < hashSize; k++){
                    if(myList.get(k) == -1) {
                        myList.set(k, arr[i]);
                        break;
                    }
                }
            }
        }

        for( int i =0;i< hashSize;i++)
              System.out.println(myList.get(i));



    }
}
