package org.stk.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {
    private int n; //total number of nodes in map
    private int N; //size of array of linkedlist
    private final int K; //threshold

    private LinkedList<Node>[] buckets;

    public HashMap() {
//        initial number of nodes
        this.n = 0;
//        setting threshold, avg number of nodes in each bucket
        this.K = 2;
//        initial number of buckets
        this.N = 4;
        this.buckets = new LinkedList[this.N];

//        initial all buckets with new LinkedList objects, as they will be null b4
        this.fill();

    }

    private void fill() {
        for (int i = 0; i < this.N; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int dataIndex = searchInLinkedList(bucketIndex, key);

//        dataIndex == 1, means this particular key, value pair is not there in map b4, so insert
        if (dataIndex == -1) {
            Node newNode = new Node(key, value);
            this.buckets[bucketIndex].add(newNode);
//            increment number of items in map
            this.n++;
        }
//        else case, key already present, then just update the value
        else {
            Node existingNode = this.buckets[bucketIndex].get(dataIndex);
            existingNode.value = value;
        }

//        if lambda value increases then time complexity of all functions in map will increase
//        so rehash
        double lambda = (double) this.n / this.N;
        if (lambda > this.K) {
            rehash();
        }
    }

    private void rehash() {


//        increasing number of buckets
//        by a factor of 2
        this.N = this.N * 2;
        System.out.println("rehash() invoked current N: " + this.N);
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[this.N];
        this.fill();

        for (int i = 0; i < oldBuckets.length; i++) {
            for (int j = 0; j < oldBuckets[i].size(); j++) {
                Node currentNode = oldBuckets[i].get(j);
                this.put(currentNode.key, currentNode.value);
            }
        }

    }

    private int searchInLinkedList(int bucketIndex, K key) {

        LinkedList<Node> currentBucket = buckets[bucketIndex];
        for (int i = 0; i < currentBucket.size(); i++) {
            if (currentBucket.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }

    private int getBucketIndex(K key) {

//        hashcode is internal method, which returns some unique value for each key
//        it returns same value everytime for same input
        int hash = key.hashCode();
//        hash can be negative also, so take abs value
        int bucketIndex = Math.abs(hash);
//        get index with in range [0, N)
        bucketIndex = bucketIndex % N;

        return bucketIndex;

    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int dataIndex = searchInLinkedList(bucketIndex, key);

//        dataIndex == -1, means this particular key not present
        if (dataIndex == -1) {
            return null;
        }
        return buckets[bucketIndex].get(dataIndex).value;
    }

    public boolean containsKey(K key) {
        int bucketIndex = getBucketIndex(key);
        int dataIndex = searchInLinkedList(bucketIndex, key);

//        dataIndex == -1, means this particular key not present
        if (dataIndex == -1) {
            return false;
        }
        return true;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        int dataIndex = searchInLinkedList(bucketIndex, key);

//        dataIndex == -1, means this particular key not present
        if (dataIndex == -1) {
            return null;
        }
        V value = this.buckets[bucketIndex].get(dataIndex).value;
        this.buckets[bucketIndex].remove(dataIndex);
        return value;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public List<K> keySet() {
        List<K> keys = new ArrayList<>();
        for (int i = 0; i < this.buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                keys.add(buckets[i].get(j).key);
            }
        }
        return keys;
    }

}
