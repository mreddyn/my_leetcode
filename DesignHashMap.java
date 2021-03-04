public class DesignHashMap {
    Node[] nodes = new Node[10000];
    public void put(int key, int value){
        int i = idx(key);
        if(nodes[i] == null){
            nodes[i] = new Node(-1,-1);
        }
        Node prev = find(nodes[i],key);
        if(prev.next == null){
            prev.next = new Node(key,value);
        }
        else{
            prev.next.val = value;
        }
    }
    public int get(int key){
        int i = idx(key);
        if(nodes[i] == null){
            return -1;
        }
        Node node = find(nodes[i],key);
        return node.next == null?-1:node.next.val;

    }
    public void remove(int key){
        int i = idx(key);
        if(nodes[i] == null) return;
        Node prev = find(nodes[i], key);
        if(prev.next == null) return;
        prev.next = prev.next.next;
    }
    int idx(int key){
        return Integer.hashCode(key) % nodes.length;
    }
    Node find(Node bucket, int key){
        Node node = bucket, prev = null;
        while(node !=null && node.key != key){
            prev = node;
            node = node.next;
        }
        return prev;
    }

    public class Node{
        int key,val;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    public static void main(String[] args) {
        
    }
  
    
}
