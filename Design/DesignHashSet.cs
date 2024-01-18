// 705. Design HashSet
// Solved
// Easy
// Topics
// Companies
// Design a HashSet without using any built-in hash table libraries.

// Implement MyHashSet class:

// void add(key) Inserts the value key into the HashSet.
// bool contains(key) Returns whether the value key exists in the HashSet or not.
// void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.


// Example 1:

// Input
// ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
// [[], [1], [2], [1], [3], [2], [2], [2], [2]]
// Output
// [null, null, null, true, false, null, true, null, false]

// Explanation
// MyHashSet myHashSet = new MyHashSet();
// myHashSet.add(1);      // set = [1]
// myHashSet.add(2);      // set = [1, 2]
// myHashSet.contains(1); // return True
// myHashSet.contains(3); // return False, (not found)
// myHashSet.add(2);      // set = [1, 2]
// myHashSet.contains(2); // return True
// myHashSet.remove(2);   // set = [1]
// myHashSet.contains(2); // return False, (already removed)


// Constraints:

// 0 <= key <= 106
// At most 104 calls will be made to add, remove, and contains.

public class MyHashSet
{

    public Bucket[] buckets;
    public int weight;

    public MyHashSet()
    {
        this.weight = 2069;
        this.buckets = new Bucket[this.weight];
        for (int i = 0; i < weight; i++) buckets[i] = new Bucket();
    }

    public int hash(int key)
    {
        return (key % weight);
    }

    public void Add(int key)
    {
        int index = hash(key);
        buckets[index].add(key);
    }

    public void Remove(int key)
    {
        int index = hash(key);
        buckets[index].remove(key);
    }

    public bool Contains(int key)
    {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}

public class Bucket
{
    public LinkedList<int> chain;
    public Dictionary<int, LinkedListNode<int>> map = new Dictionary<int, LinkedListNode<int>>();

    public Bucket()
    {
        chain = new LinkedList<int>();
        map = new Dictionary<int, LinkedListNode<int>>();
    }

    public void add(int key)
    {
        if (map.ContainsKey(key)) return;

        chain.AddLast(key);
        map.Add(key, chain.Last);
    }

    public void remove(int key)
    {
        if (!map.ContainsKey(key)) return;

        var node = map[key];
        chain.Remove(node);
        map.Remove(key);
    }

    public bool contains(int key)
    {
        return map.ContainsKey(key);
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.Add(key);
 * obj.Remove(key);
 * bool param_3 = obj.Contains(key);
 */