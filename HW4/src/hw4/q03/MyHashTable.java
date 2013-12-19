package hw4.q03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author baylor
 */
public class MyHashTable<K, V>
{
        List<KeyValuePair<K, V>>[] buckets;
        float loadFactor;
        int size;
	//<editor-fold defaultstate="collapsed" desc="initialize">
	public MyHashTable(int initialCapacity, float loadFactor)
	{
		this.loadFactor = loadFactor;
		buckets = createBucketList(initialCapacity);
	}
	//</editor-fold>

	private List<KeyValuePair<K, V>>[] createBucketList(int capacity)
	{
		//--- Creating arrays of templated objects has nasty syntax in java
		//--- Could also be unsafe and create an array of List<Object>
		Class<?> type = new LinkedList<KeyValuePair<K, V>>().getClass();
		List<KeyValuePair<K, V>>[] newBuckets =
				(List<KeyValuePair<K, V>>[]) Array.newInstance(type, capacity);

		//--- Put a list in each array spot
		for (int i = 0; i < newBuckets.length; i++)
		{
			newBuckets[i] = new LinkedList<>();
		}

                //--- Reset the size
		size = 0;
                return newBuckets;
	}

	private void resize()
	{
            // stuff
            int newCapacity = MyMath.getNextPrime(buckets.length);
            buckets = createBucketList(newCapacity);
            // stuff
	}
        public void grow()
        {
            List<KeyValuePair<K,V>> temp = this.getKeyValuePairs();
            
            if(this.getSize() > this.loadFactor * this.getCapacity()){
                resize();
            }
            for (int i = 0;i < temp.size(); i++) {
                buckets[this.getIndexOfBucket(temp.get(i).key)].add(temp.get(i));
                size++;
            }
        }
        private List<KeyValuePair<K, V>> getBucket(K key){
            int hashCode = Math.abs(key.hashCode());
            int bucketIndex = hashCode % this.getCapacity();
            return buckets[bucketIndex];
        }
        
        public boolean contains(K key){
            List<KeyValuePair<K, V>> bucket = getBucket(key);
            for (int i = 0; i < bucket.size(); i++) {
                if(bucket.get(i).key.equals(key)){
                    return true;
                }
            }
            return false;
        }
        
        public V get(K key){
            List<KeyValuePair<K, V>> bucket = getBucket(key);
            V value = null;
            for (int i = 0; i < bucket.size(); i++) {
                if(bucket.get(i).key.equals(key)){
                    value = bucket.get(i).value;
                }
            }
            return value;
        }
        
        public void put(K key, V value){
            if(this.getSize() > this.loadFactor * this.getCapacity()){
                this.grow();
            }
            List<KeyValuePair<K, V>> bucket = getBucket(key);
            KeyValuePair entry = new KeyValuePair(key,value);
            this.remove(key);
            bucket.add(entry);
            this.size++;
        }
        
        public int getCapacity(){
            return this.buckets.length;
        }
        
        public int getSize(){
            return this.size;
        }
        
        public int getIndexOfBucket(K key){
            return Math.abs(key.hashCode())% this.getCapacity();
        }
        
        public List<K> getKeys(){
            List<K> keys = new ArrayList<>();
            for (int i = 0; i < this.getCapacity(); i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    keys.add(buckets[i].get(j).key);
                }
            }
            return keys;
        }
        
        List<KeyValuePair<K, V>> getKeyValuePairs(){
            List<KeyValuePair<K, V>> pairs = new ArrayList<>();
            for (int i = 0; i < this.getCapacity(); i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    pairs.add(buckets[i].get(j));
                }
            }
            return pairs;
        }
        
        public List<V> getValues(){
            List<V> values = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    values.add(buckets[i].get(j).value);
                }
            }
            return values;
        }
        
        public void remove(K key){
            List<KeyValuePair<K, V>> bucket = getBucket(key);
            for (int i = 0; i < bucket.size(); i++) {
                if(bucket.get(i).key.equals(key)){
                    bucket.remove(i);
                    this.size--;
                }
            }
        }
        
}
