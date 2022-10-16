/* CM307HashMapDriver for CM307 Spring 2021
    Project 08 Resubmission
    Written by Justin Smith
*/

import java.io.*;
import java.util.*;



public class CM307HashMapDriver
{
    public static void main(String[] args) throws FileNotFoundException
    {   
        int count = 0;
        CM307HashMap hashMap = new CM307HashMap();
        File animals = new File("animals.txt");
        Scanner input = new Scanner (animals);
        while (input.hasNext())
        {
            String data = input.nextLine();
            hashMap.put(data,data);
            count = (count+1);
        }
        input.close();
        hashMap.printObjects();
        System.out.println("");
        System.out.println("Number of objects processed from data file: " + count);
    }
}