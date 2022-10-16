/* CM307HashMap for CM307 Spring 2021
    Project 08 Resubmission
    Written by Justin Smith
*/

public class CM307HashMap
{
    private String[] keys;
    private Object[] objects;
    public int size;
    Integer countOne=1;
    Integer count;

    public CM307HashMap()
    {
        keys = new String[100];
        objects = new Object[100];
    }

    public void put(String key, Object object)
    {
        int hashValue;
        hashValue= Math.abs(key.hashCode())%keys.length;
        while(keys[hashValue]!=null&&!keys[hashValue].equals(key))
        {
            hashValue = (hashValue+1)%keys.length;
        }
        keys[hashValue]=key;
        if (objects[hashValue] ==null)
        {
            objects[hashValue]=countOne;
        }
        else
        {
            count = (Integer)objects[hashValue];
            count = count + 1;
            objects[hashValue]= count;
        }
        size++;
        

    }

    public Object get(String key)                           //Similar logic to the put method, only this time we are returning values rather than placing elements in arrays
    {
        int hashValue;
        hashValue= key.hashCode();
        hashValue= Math.abs(hashValue);
        hashValue = hashValue%100;
        for (int k=0; k<keys.length;k++)
        {
            if (key == keys[hashValue])
            {
                if (objects[hashValue] == null)
                {
                    return null;
                }
                else
                {
                return objects[hashValue];
                }
            }
            else 
            {
                hashValue = (hashValue + 1)%keys.length;
            }
            
        }
        return null;

    }

    public void printObjects()
    {
        for (int k=0; k<objects.length;k++)
        {
            System.out.println("Array Index:" + k);
            System.out.println("Key:" + keys[k]);
            System.out.println("Object Count:" + objects[k]);
            System.out.println("");

        }
    }
}