package com.company.Task3;

import com.company.Task2.MyList;

import java.util.Arrays;

public class MyHashMap {
        // for better re-sizing is taken as 2^4
        private static final int SIZE = 16;
        public int count=0;
        String[] myKey = new String[1];
        String[] myValue = new String[1];

    public String[] getMyKey() {
        return myKey;
    }

    public void setMyKey(String[] myKey) {
        this.myKey = myKey;
    }

    public String[] getMyValue() {
        return myValue;
    }

    public void setMyValue(String[] myValue) {
        this.myValue = myValue;
    }

    private Entry table[] = new Entry[SIZE];

        /**
         * To store the Map data in key and value pair.
         * Used linked list approach to avoid the collisions
         */
        class Entry {
            final String key;
            String value;
            Entry next;

            Entry(String k, String v) {
                key = k;
                value = v;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getKey() {
                return this.key;
            }
        }

        /**
         * Returns the entry mapped to key in the HashMap.
         */
        public Entry get(String k) {
            int hash = k.hashCode() % SIZE;
            Entry e = table[hash];

// Bucket is identified by hashCode and traversed the bucket
// till element is not found.
            while (e != null) {
                if (e.key.equals(k)) {
                    return e;
                }
                e = e.next;
            }
            return null;
        }

        /**
         * If the map previously contained a mapping for the key, the old
         * value is replaced.
         */
        public void put(String k, String v) {




            int hash = k.hashCode() % SIZE;
            Entry e = table[hash];

            if (e != null) {
// If we will insert duplicate key-value pair,
// Old value will be replaced by new one.
                if (e.key.equals(k)) {

                    e.value = v;

                } else {

// Collision: insert new element at the end of list
// in the same bucket
                    while (e.next != null) {
                        e = e.next;
                    }
                    Entry entryInOldBucket = new Entry(k, v);
                    e.next = entryInOldBucket;
                }
            } else {
// create new bucket for new element in the map.
                Entry entryInNewBucket = new Entry(k, v);
                table[hash] = entryInNewBucket;

            }
            myKey = Arrays.copyOf(myKey, count+1);
            myValue = Arrays.copyOf(myValue,count+1);
           this.myKey[count] = k;
            this.myValue[count]=v;
            count++;
        }

    @Override
    public String toString() {

            String tempString = "MyHashMap ";
        for (int i = 0; i < count; i++) {
            tempString = tempString + "\n" + this.myKey[i] + " : " + this.myValue[i];

        }


        return tempString;
    }

    public void ReadOnlySize() {

       System.out.println(count+" - size of My table");
        }

    }